import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardPage extends BasePage {

    By productNameLocator1 = By.id("prodDescription");
    By deleteClick = By.id("removeProd");

    public CardPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdd() {
        return getProducts().size() >0;
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator1);
    }

    public void deleteProduct(){
        click(deleteClick);
    }
    public boolean checkIfProductDeleted() {
        return getProducts().size() == 0;
    }

}
