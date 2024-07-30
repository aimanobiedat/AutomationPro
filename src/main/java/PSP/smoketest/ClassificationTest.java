package PSP.smoketest;
import PSP.BaseTest;
import PSP.pages.Classification;
import PSP.pages.HomePage;
import org.testng.annotations.Test;

import static PSP.smoketest.ComonTest.validLoginPsp;

public class ClassificationTest extends BaseTest {


    @Test(description = "this to test open Classification Page ", priority = 1)
    public void openClassificationPage () throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(1000);
        homePage.buisnessConfigDropDown();
        Thread.sleep(2000);
        homePage.ProfileClassificationLink();
        Thread.sleep(2000);


    }

    @Test(description = "this to test open Add Classification page ", priority = 2)
    public void openAddClassificationPage () throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(1000);
        homePage.buisnessConfigDropDown();
        Thread.sleep(2000);
        homePage.ProfileClassificationLink();
        Classification classification = new Classification(driver);
        Thread.sleep(5000);
        classification.AddProfileClassification();
        Thread.sleep(2000);
    }


    @Test(description = "this to test  Add  profile Classification ", priority = 3)
    public void AddProfileClassification () throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(1000);
        homePage.buisnessConfigDropDown();
        Thread.sleep(2000);
        homePage.ProfileClassificationLink();
        Classification classification = new Classification(driver);
        Thread.sleep(5000);
        classification.AddProfileClassification();
        Thread.sleep(2000);
        classification.OpenClassificationName();
        Thread.sleep(3000);
        classification.ChooseCurrency();
        Thread.sleep(2000);
        classification.ChooseAllowedService();
        Thread.sleep(5000);
        classification.writenote();
        Thread.sleep(8000);
        classification.AddClassificatin();
        Thread.sleep(2000);
    }

}
