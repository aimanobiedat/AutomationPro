package PSP.pages;
import PSP.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
public class Classification extends BasePage {





    public Classification(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[@id='AddProfile-Classification']//*[name()='svg']")
    private WebElement AddProfileClassification;


    public WebElement getAddProfileClassification() {
        return AddProfileClassification;

    }

    public void AddProfileClassification() {

        AddProfileClassification.click();
    }


    @FindBy(xpath = "//input[@id='Name']")
    private WebElement ClassificationName;

    public WebElement getClassificationName() {

        return ClassificationName;
    }


    public void OpenClassificationName() {

        ClassificationName.sendKeys("Aymanemad");
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/label[1]")
    private WebElement AllowedCusrrency;

    public WebElement getAllowedCusrrency() {

        return AllowedCusrrency;
    }

    public void ChooseCurrency() {

        if (AllowedCusrrency.isEnabled() && AllowedCusrrency.isDisplayed())

            AllowedCusrrency.click();
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/label[1]")
    private WebElement AllowedService;

    public WebElement getAllowedService() {

        return AllowedService;
    }

    public void ChooseAllowedService() {
        if (AllowedService.isEnabled() && AllowedService.isDisplayed())
            AllowedService.click();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 2500);");


//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        AllowedService.sendKeys(Keys.PAGE_DOWN);
    }




    @FindBy(id = "Notes")
    private WebElement AddNotes;

    public WebElement getAddNotes() {

        return AddNotes;
    }

    public void writenote() {
                JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", CreateClassificaion);

        AddNotes.sendKeys("ahmademad");

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", CreateClassificaion);


//        AddNotes.sendKeys(Keys.PAGE_DOWN);
    }


    @FindBy(xpath = "//button[@id='submit-AddProfilesClassifications']")
    private WebElement CreateClassificaion;

    public WebElement getCreateClassificaion() {

        return CreateClassificaion;
    }

    public void AddClassificatin() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

//        js.executeScript("window.scrollBy(0, 2500);");

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


       if(CreateClassificaion.isEnabled()&&CreateClassificaion.isDisplayed())
        CreateClassificaion.click();

//        Actions actions=new Actions(driver);
//        actions.moveToElement(CreateClassificaion).click().perform();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", CreateClassificaion);

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", CreateClassificaion);
//        CreateClassificaion.click();
//        if (CreateClassificaion.isEnabled() && CreateClassificaion.isDisplayed()) {
//
//            CreateClassificaion.click();
//        }


    }

}










