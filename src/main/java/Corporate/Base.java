package Corporate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
    public static WebDriver driver;
    public static WebDriver driver1;

    /* public void chooseBorowser(String browserName) {

        if (browserName == "firefox") {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://qcwalletpspportal.sedrapay.com/");

        } else {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://qcwalletpspportal.sedrapay.com/");
            //
        }

    }*/

    @BeforeMethod
    public void launcheDriver() {

        //chooseBorowser("firfox");

        //WebDriverManager.chromedriver().setup();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://qcwalletcorporateportal.sedrapay.com/");
        driver.manage().window().maximize();

    }

   /*  @AfterMethod
    public void closeDriver() {
        driver.close();
    }*/



}

