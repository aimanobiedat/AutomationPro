package PSP;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {
    protected static WebDriver driver;
    @BeforeMethod
    public void lunchdriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver();
        driver.get("https://qcwalletpspportal.sedrapay.com/");
        driver.manage().window().maximize();
    }

   @AfterMethod
  public void closeDriver() {
    driver.quit();
  }
}
