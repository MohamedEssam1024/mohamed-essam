package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends TestBase{

    LoginPage loginPage;
    HomePage homePage;

    @Test(priority = 3)
    public void loginWithValidData(){
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("dhhaytjcbp_1653237884@tfbnw.net");
        loginPage.enterPassword("12345678aA");
        loginPage.loginButton.click();
        waitTillPageLoad();
        homePage = new HomePage(driver);
        Assert.assertEquals(homePage.welcomeMessage.getText(),"Welcome to Facebook, Emily");
    }

    @Test(priority = 1)
    public void loginWithInvalidData(){
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("invalid@data.com");
        loginPage.enterPassword("12345678ah");
        loginPage.loginButton.click();
        waitTillPageLoad();
        if (loginPage.errorBox.isDisplayed())
            Assert.assertEquals(loginPage.errorBox.getText(),"Wrong credentials\nInvalid username or password");
        else
            Assert.assertEquals(loginPage.invalidLoginError.getText(),"The email address you entered isn't connected to an account. Find your account and log in.");
    }

    @Test(priority = 2)
    public void loginWithInvalidPassword(){
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("dhhaytjcbp_1653237884@tfbnw.net");
        loginPage.enterPassword("12345678");
        loginPage.loginButton.click();
        waitTillPageLoad();
        if (loginPage.errorBox.isDisplayed())
            Assert.assertEquals(loginPage.errorBox.getText(),"Wrong credentials\nInvalid username or password");
        else
            Assert.assertEquals(loginPage.invalidLoginError.getText(),"The password that you've entered is incorrect. Forgotten password?");
    }

}
