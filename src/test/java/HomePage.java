import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    SearchBox searchBox;
    By secondPage = By.id("2");
    By cartCountLocator = By.id("myBasket");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }

    public void goToSecond_page(){
        click(secondPage);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductAdd() {
        return getCardCount()>0;
    }


    public void goToCard() {
        click(cartCountLocator);
    }
    private int getCardCount(){
        String count =find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
