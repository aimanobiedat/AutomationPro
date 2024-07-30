package Corporate.pages;
import Corporate.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginCorp extends Base {
    //User Name :

    String UserName = "posted9@hotmail.com";

    //Password  :
    String Password = "P@ssw0rd";
    //--------------------FIND_ELEMENT----------------------

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

    @FindBy(xpath = "//*[@id=\"login\"]/div[2]/div[1]/input")
    private WebElement userNameField;

    @FindBy(css = "input[placeholder='Please enter your Password']")
    private WebElement passwordField;

    @FindBy(css = "#btnForgetPassword")
    private WebElement forgotPassword;


    @FindBy(css = "#loginBtn")
    private WebElement loginButton;


//-------------------------GET-------------------

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



//----------------------LOGIN-----------------------

    public LoginCorp(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public void UserNameField( ) {

        userNameField.click();
        userNameField.sendKeys(UserName);
    }


    public void PasswordFiled(){
        passwordField.click();
        passwordField.sendKeys(Password);
    }


    public void LoginButton(){
        loginButton.click();
    }

    //----------------OTP----------------


    public void OTP(){
        oTP1.sendKeys("0");
        oTP2.sendKeys("0");
        oTP3.sendKeys("0");
        oTP4.sendKeys("0");
        oTP5.sendKeys("0");
        verfiryOTP.click();
    }















}
