package testCases;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPopup;

import java.io.IOException;

public class RegisterTests extends TestBase{

    RegistrationPopup registrationPopup;
    LoginPage loginPage;

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    @Test(priority = 4)
    public void registerNewUser() throws IOException {
        excelUtils.setExcelFile(excelFilePath,"Registration_data");
        loginPage = new LoginPage(driver);
        loginPage.createNewAccount.click();
        waitTillPageLoad();
        registrationPopup = new RegistrationPopup(driver);
        registrationPopup.enterFirstName(excelUtils.getCellData(2,2));
        registrationPopup.enterSurName(excelUtils.getCellData(3,2));
        registrationPopup.enterEmailOrPhone(excelUtils.getCellData(4,2));
        if (!isNumeric(excelUtils.getCellData(4,2)))
            registrationPopup.enterConfirmEmail(excelUtils.getCellData(5,2));
        registrationPopup.enterPassword(excelUtils.getCellData(6,2));
        registrationPopup.selectDay(excelUtils.getCellData(7,2));
        registrationPopup.selectMonth(excelUtils.getCellData(8,2));
        registrationPopup.selectYear(excelUtils.getCellData(9,2));
        registrationPopup.radioButton.get(Integer.parseInt(excelUtils.getCellData(10,2))).click();
        registrationPopup.signUp.click();
    }
}
