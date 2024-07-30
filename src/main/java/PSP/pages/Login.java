package PSP.pages;
import PSP.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login extends BasePage {

    public Login(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserNameField() {
        return userNameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getForgotPassword() {
        return forgotPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

//    public Login (WebDriver driver) {
//
//        PageFactory.initElements(driver, this);
//    }

    @FindBy(name = ("UsernameOrEmailAddress"))
    private WebElement userNameField;

    @FindBy(css = "input[placeholder='Please enter your Password']")
    private WebElement passwordField;

    @FindBy(css = "#btnForgetPassword")
    private WebElement forgotPassword;

    @FindBy(css = "#loginBtn")
    private WebElement loginButton;

    public WebElement getoTP1() {
        return oTP1;
    }

    public WebElement getoTP2() {
        return oTP2;
    }

    public WebElement getoTP3() {
        return oTP3;
    }

    public WebElement getoTP4() {
        return oTP4;
    }

    public WebElement getoTP5() {
        return oTP5;
    }

    public WebElement getVerfiryOTP() {
        return verfiryOTP;
    }

    @FindBy(css = "input[name='Digit1']")
    private WebElement oTP1;

    @FindBy(css = "input[name='Digit2']")
    private WebElement oTP2;


    @FindBy(css = "input[name='Digit3']")
    private WebElement oTP3;

    @FindBy(css = "input[name='Digit4']")
    private WebElement oTP4;

    @FindBy(css = "input[name='Digit5']")
    private WebElement oTP5;


    @FindBy(css = "#submitOTP")
    private WebElement verfiryOTP;


    public void UserNameField( ) {

        userNameField.click();
        userNameField.sendKeys("halarmouti@blessedtreeit.com");
    }


    public void PasswordFiled(){
        passwordField.click();
        passwordField.sendKeys("P@ssw0rd");
    }


    public void LoginButton(){
        loginButton.click();
    }





    public void OTP(){
        oTP1.sendKeys("0");
        oTP2.sendKeys("0");
        oTP3.sendKeys("0");
        oTP4.sendKeys("0");
        oTP5.sendKeys("0");
        verfiryOTP.click();
    }
}
