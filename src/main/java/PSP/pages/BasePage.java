package PSP.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;

public class BasePage {
    protected WebDriver driver;
    public  BasePage(WebDriver driver)

    {
        PageFactory.initElements(driver,this);
}
    public static Integer getRandom() {
        Random random = new Random();
        int y = random.nextInt(10000);
        return y;
    }


}