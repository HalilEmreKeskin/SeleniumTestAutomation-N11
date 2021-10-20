import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondPage extends BasePage{

    By amIinSecondPage = new By.ById("pagination==2");
    public SecondPage(WebDriver driver) {
        super(driver);
    }

    public WebElement ifSecondPageHere(By locator){
        return find(amIinSecondPage);
    }
}
