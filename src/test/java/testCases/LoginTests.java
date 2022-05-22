package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class LoginTests extends TestBase{

    LoginPage loginPage;
    HomePage homePage;


    @Test(priority = 3)
    public void loginWithValidData() throws IOException {
        excelUtils.setExcelFile(excelFilePath,"Login_data");
        loginPage = new LoginPage(driver);
        loginPage.enterEmail(excelUtils.getCellData(6,3));
        loginPage.enterPassword(excelUtils.getCellData(7,3));
        loginPage.loginButton.click();
        waitTillPageLoad();
        homePage = new HomePage(driver);
        Assert.assertEquals(homePage.welcomeMessage.getText(),"Welcome to Facebook, Emily");
    }

    @Test(priority = 2)
    public void loginWithInvalidData() throws IOException {
        excelUtils.setExcelFile(excelFilePath,"Login_data");
        loginPage = new LoginPage(driver);
        loginPage.enterEmail(excelUtils.getCellData(2,3));
        loginPage.enterPassword(excelUtils.getCellData(3,3));
        loginPage.loginButton.click();
        waitTillPageLoad();
        if (loginPage.errorBox.isDisplayed())
            Assert.assertEquals(loginPage.errorBox.getText(),"Wrong credentials\nInvalid username or password");
        else
            Assert.assertEquals(loginPage.invalidLoginError.getText(),"The email address you entered isn't connected to an account. Find your account and log in.");
    }

    @Test(priority = 1)
    public void loginWithInvalidPassword() throws IOException {
        excelUtils.setExcelFile(excelFilePath,"Login_data");
        loginPage = new LoginPage(driver);
        loginPage.enterEmail(excelUtils.getCellData(4,3));
        loginPage.enterPassword(excelUtils.getCellData(5,3));
        loginPage.loginButton.click();
        waitTillPageLoad();
        if (loginPage.errorBox.isDisplayed())
            Assert.assertEquals(loginPage.errorBox.getText(),"Wrong credentials\nInvalid username or password");
        else
            Assert.assertEquals(loginPage.invalidLoginError.getText(),"The password that you've entered is incorrect. Forgotten password?");
    }

}
