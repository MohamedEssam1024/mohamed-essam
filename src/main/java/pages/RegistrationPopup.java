package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationPopup extends PageBase{

    WebDriver driver;

    public RegistrationPopup(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "reg_email__")
    public WebElement emailOrPhone;

    @FindBy(name = "reg_email_confirmation__")
    public WebElement confirmEmail;

    @FindBy(name = "reg_passwd__")
    public WebElement password;

    @FindBy(id = "day")
    public WebElement day;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(name = "sex")
    public List<WebElement> radioButton;

    @FindBy(name = "websubmit")
    public WebElement signUp;



    public void enterFirstName(String firstName) {
        this.firstName.clear();
        setTextElementText(this.firstName, firstName);
    }
    public void enterSurName(String lastName) {
        this.lastName.clear();
        setTextElementText(this.lastName, lastName);
    }
    public void enterEmail(String emailOrPhone) {
        this.emailOrPhone.clear();
        setTextElementText(this.emailOrPhone, emailOrPhone);
    }
    public void enterConfirmEmail(String confirmEmail) {
        this.confirmEmail.clear();
        setTextElementText(this.confirmEmail, confirmEmail);
    }
    public void enterPassword(String password) {
        this.password.clear();
        setTextElementText(this.password, password);
    }
    public void selectDay(String day) {
        Select selectDay = new Select(this.day);
        selectDay.selectByValue(day);
    }
    public void selectMonth(String month) {
        Select selectDay = new Select(this.month);
        selectDay.selectByValue(month);
    }
    public void selectYear(String year) {
        Select selectDay = new Select(this.year);
        selectDay.selectByValue(year);
    }
}
