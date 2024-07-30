package Corporate.pages;

import Corporate.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class CardHolder extends Base {


    public CardHolder(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public static Integer getRandom(){

        Random random = new Random();
        int y = random.nextInt(1000);
        return y;

    }

    //--------------------------------------Click on CardHolderPage ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//a[normalize-space()='Card Holders']")
    private WebElement CardHolderPage;

    //Get
    public WebElement getCardHolderPage() {
        return CardHolderPage;
    }
    //Actions

    public void CardHolderPage() {


        CardHolderPage.click();
    }


    //--------------------------------------Click on AddCardHolder ----------------------------------------//
    //Find the element
    @FindBy(xpath = "//a[@class='btn btn-primary buttons-collection buttons-colvis addbtn-table']")
    private WebElement AddCardHolder;

    //Get
    public WebElement getAddCardHolder() {
        return AddCardHolder;
    }
    //Actions

    public void AddCardHolderButton() {


        AddCardHolder.click();
    }







    //--------------------------------------Click on Fill AddCardHolder fields ----------------------------------------//
    //Find the element
    //FirstName
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")
    private WebElement HFirstName;
    //SecondName
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/input[1]")
    private WebElement HSecondName;
    //LastName
    @FindBy(xpath = "(//input[@id='LAST_NAME'])[1]")
    private WebElement HLastName ;
    @FindBy(xpath = "(//input[@id='THIRD_NAME'])[1]")
    private WebElement ThirdName ;

    //Get
    public WebElement getHFirstName() {
        return HFirstName;
    }

    public WebElement getHSecondName() {
        return HSecondName;
    }
    public WebElement getThirdName() {
        return ThirdName;
    }
    public WebElement getHLastName() {
        return HLastName;
    }




    //------------------------------ACTIONS--------------------
    //First
    public void FirstName(String Fname) {

        HFirstName.sendKeys(Fname);
    }
    //OverLoad--
    public void FirstName() {

        HFirstName.sendKeys("Othman");
    }


    //SecondName

    public void SecondName(String Sname) {

        HSecondName.sendKeys(Sname);
    }
    //OverLoad--
    public void SecondName() {

        HSecondName.sendKeys("Aouto");
    }





    //LastName
    public void ThirdName(String thirdName) {

        ThirdName.sendKeys(thirdName);
    }
    //OverLoad--
    public void ThirdName() {

        ThirdName.sendKeys("Test");
    }

    //LastName
    public void LastName(String LName) {

        HLastName.sendKeys(LName);
    }
    //OverLoad--
    public void LastName() {

        HLastName.sendKeys("Test");
    }


    //--------------------------------------Click on Nationality Number ----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[5]/div[2]/input[1]")
    private WebElement NationalityNumber;

    //Get
    public WebElement getNationalityNumber() {
        return NationalityNumber;
    }
    //Actions

    public void NationalityNumber(String NationalityNum) {

        NationalityNumber.sendKeys(NationalityNum);
    }
    //OverLoad

    public void NationalityNumber() {

        NationalityNumber.sendKeys("1234201369");
    }






    //--------------------------------------Click on Phone Number ----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[6]/div[2]/input[1]")
    private WebElement PhoneNumber;

    //Get
    public WebElement getPhoneNumber() {
        return PhoneNumber;
    }
    //Actions

    public void PhoneNumber(String PhoneNumb) {

        PhoneNumber.sendKeys(PhoneNumb);
    }
    //Over Load
    public void PhoneNumber() {

        PhoneNumber.sendKeys("+962784563254");
    }



    //--------------------------------------Click on Create Button ----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/button[2]")
    private WebElement CreateButton ;

    //Get
    public WebElement getCreateButton() {
        return CreateButton;
    }
    //Actions

    public void ClickOnCreateButton() {

        CreateButton.click();
    }




    //--------------------------------------Click on Card Holder Details Button ----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/button[1]")
    private WebElement ActionButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement CardHolderDetailsButton;

    //Get
    public WebElement getActionButton() {
        return ActionButton;
    }
    public WebElement getCardHolderDetailsPage() {
        return CardHolderDetailsButton;
    }
    //Actions

    public void CardHolderDetailsPage() throws InterruptedException {

        ActionButton.click();

        Thread.sleep(1000);
        CardHolderDetailsButton.click();
    }





















}
