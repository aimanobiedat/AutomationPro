package Corporate.pages;

import Corporate.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class LinkedAccounts extends Base {

    public LinkedAccounts(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public static Integer getRandom(){

        Random random = new Random();
        int y = random.nextInt(1000);
        return y;

    }



    //--------------------------------------Click on LinkedAccounts Button----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"card1\"]/div/div[2]/div[1]/div[1]/a[2]")
    private WebElement AddLinkedAccountsButton;

    //Get
    public WebElement getAddLinkedAccountsButton() {
        return AddLinkedAccountsButton;
    }
    //Actions

    public void AddLinkedAccountsButton() {


        AddLinkedAccountsButton.click();
    }






    //-------------------------------------- AccountName ----------------------------------------//
    //Find the element Currency Feild
    //List

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    private WebElement EnterLinkAccountNumber;
    @FindBy(xpath = "//*[@id=\"search\"]")
    private WebElement ClickOnSearchButton;








    //Get


    public WebElement getEnterLinkAccountNumber() {
        return EnterLinkAccountNumber;
    }
    public WebElement getClickOnSearchButton() {
        return ClickOnSearchButton;
    }



    //Actions

    public void EnterLinkAccountNumber(String EnterName) {

        EnterLinkAccountNumber.sendKeys(EnterName);
    }


    //Over loading if does not enter value execute the following metohd ..
    public void EnterLinkAccountNumber() {
        EnterLinkAccountNumber.click();
        EnterLinkAccountNumber.sendKeys("0210640064223144");

        ClickOnSearchButton.click();
        ClickOnSearchButton.click();

    }











    //*[@id="addAccountBtn"]





    //-------------------------------------- AccountName ----------------------------------------//
    //Find the element Currency Feild
    //List

    @FindBy(css = "#addAccountBtn")
    private WebElement addAccountBtn;











    //Get


    public WebElement getAddAccountBtn() {
        return addAccountBtn;
    }




    //Actions



    public void AddAccountBtn() {
        addAccountBtn.click();

    }














}
