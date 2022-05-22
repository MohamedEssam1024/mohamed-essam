package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(css = "#loginform > div.clearfix._5466._44mg > div._9ay7")
    public WebElement invalidLoginError;

    @FindBy(css = "a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    public WebElement createNewAccount;

    public void enterEmail(String email) {
        this.email.clear();
        setTextElementText(this.email, email);
    }

    public void enterPassword(String password){
        this.password.clear();
        setTextElementText(this.password,password);
    }
}
