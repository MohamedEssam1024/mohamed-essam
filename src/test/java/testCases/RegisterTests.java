package testCases;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPopup;

public class RegisterTests extends TestBase{

    RegistrationPopup registrationPopup;
    LoginPage loginPage;

    @Test(priority = 4)
    public void registerNewUser(){
        loginPage = new LoginPage(driver);
        loginPage.createNewAccount.click();
        waitTillPageLoad();
        registrationPopup = new RegistrationPopup(driver);
        registrationPopup.enterFirstName("essam");
        registrationPopup.enterSurName("essam");
        registrationPopup.enterEmail("43675673456");
        registrationPopup.enterPassword("34563456456");
        registrationPopup.selectDay("1");
        registrationPopup.selectMonth("1");
        registrationPopup.selectYear("1992");
        registrationPopup.radioButton.get(1).click();
        registrationPopup.signUp.click();
    }
}
