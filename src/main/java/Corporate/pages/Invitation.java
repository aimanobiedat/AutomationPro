package Corporate.pages;

import Corporate.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class Invitation extends Base {



    public Invitation(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public static Integer getRandom(){

        Random random = new Random();
        int y = random.nextInt(1000);
        return y;

    }

    //--------------------------------------Click on Invitations ----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/aside[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]")
    private WebElement InvitationPage;

    //Get
    public WebElement getInvitationPage() {
        return InvitationPage;
    }
    //Actions

    public void InvitationPage() {


        InvitationPage.click();
    }


    //--------------------------------------Click on Invitation ----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement AddInvitation;

    //Get
    public WebElement getAddInvitation() {
        return AddInvitation;
    }
    //Actions

    public void AddInvitationButton() {


        AddInvitation.click();
    }






    //--------------------------------------Get First Name ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    private WebElement InvitationFirstName;

    //Get
    public WebElement getInvitationFirstName() {
        return InvitationFirstName;
    }
    //Actions

    public void InvitationFirstName() {


        InvitationFirstName.sendKeys("Othman");
    }
    public void InvitationFirstName(String invitationfirst ) {


        InvitationFirstName.sendKeys(invitationfirst);
    }


    //--------------------------------------Get Last Name ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"LastName\"]")
    private WebElement InvitationLastName;

    //Get
    public WebElement getInvitationLastName() {
        return InvitationLastName;
    }
    //Actions

    public void InvitationLastName() {


        InvitationLastName.sendKeys("Hajjaj");
    }
    public void InvitationLastName(String invitationLast ) {


        InvitationLastName.sendKeys(invitationLast);
    }





    //--------------------------------------Get Holder Email  ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"HolderEmail\"]")
    private WebElement HolderEmail ;

    //Get
    public WebElement getHolderEmail() {
        return HolderEmail;
    }
    //Actions

    public void HolderEmail() {


        HolderEmail.sendKeys("Hajjaj@yahoo.com");
    }
    public void HolderEmail(String invitationEmail ) {


        HolderEmail.sendKeys(invitationEmail);
    }








    //--------------------------------------Get Holder Phone Number  ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"HolderPhoneNumber\"]")
    private WebElement HolderPhoneNumber ;

    //Get
    public WebElement getHolderPhoneNumber() {
        return HolderPhoneNumber;
    }
    //Actions

    public void HolderPhoneNumber() {


        HolderPhoneNumber.sendKeys("+9627865123620");
    }
    public void HolderPhoneNumber(String invitationPhone ) {


        HolderPhoneNumber.sendKeys(invitationPhone);
    }




    //--------------------------------------Click on SendInvitation ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"CreateInvitation\"]/div[3]/button[2]")
    private WebElement SendInvitation;

    //Get
    public WebElement getSendInvitation() {
        return SendInvitation;
    }
    //Actions

    public void SendInvitationButton() {


        SendInvitation.click();
    }


    //--------------------------------------Click on ActionButton ----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]" +
            "/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[1]")
    private WebElement ActionButton;

    //Get
    public WebElement getActionButton() {
        return ActionButton;
    }
    //Actions

    public void ActionButton() {


        ActionButton.click();
    }


    //--------------------------------------Click on InvitationDetails ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"InvitationsTable\"]/tbody/tr/td[7]/div/ul/li[3]/a")
    private WebElement InvitationDetails;

    //Get
    public WebElement getInvitationDetails() {
        return InvitationDetails;
    }
    //Actions

    public void InvitationDetails() {


        InvitationDetails.click();
    }


    //--------------------------------------Get the Token and Open  KYC Form ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"InvitationToken\"]")
    private WebElement InvitationToken;
    @FindBy(xpath = "//*[@id=\"MobileNumber\"]")
    private WebElement thePhoneNumb;
    @FindBy(xpath = "//*[@id=\"phoneNum\"]")
    private WebElement SetthePhoneNumb;



    //Get
    public WebElement getInvitationToken() {
        return InvitationToken;
    }
    public WebElement getthePhoneNumb() {
        return thePhoneNumb;
    }
    public WebElement getSetthePhoneNumb() {
        return SetthePhoneNumb;

    }

    //Actions
  //  String phoneNumb;
    public void OpenTheInvitationForm() throws InterruptedException {

        String phoneNumb = thePhoneNumb.getAttribute("value");
        //Get the value of the invitations Token:)
        String Token =InvitationToken.getAttribute("value");


        String urlToOpenInNewTab = "https://qcwalletcorporateportal.sedrapay.com/Invitation/CreatHolderKYC?token="+Token;


        //Open the Invitations
        ((JavascriptExecutor) driver).executeScript("window.open('" + urlToOpenInNewTab + "','_blank');");
      Thread.sleep(4000);


      //  SetthePhoneNumb.sendKeys(phoneNumb);
        SetthePhoneNumb.sendKeys(phoneNumb);


    }



    public void ConfirmThePhone() {

      // String a= OpenTheInvitationForm();



    }





}
