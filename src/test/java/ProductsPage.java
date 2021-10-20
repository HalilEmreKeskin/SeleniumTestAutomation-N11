import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{
    By checkOptionlocator = By.id("1000210");
    By productNameLocator = By.id("productName bold");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(checkOptionlocator);
    }

    public void selectProduct(int i) {
        getAllProductName().get(i).click();
    }

    private List<WebElement> getAllProductName(){
       return findAll(productNameLocator);
    }
}
