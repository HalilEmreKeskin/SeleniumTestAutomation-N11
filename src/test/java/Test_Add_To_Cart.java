import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_To_Cart extends BaseTest {

    HomePage homePage;
    SecondPage secondPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CardPage cardPage ;
    @Test
    @Order(1)
    public void searchProduct(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Bilgisayar");
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page");
    }
    @Test
    @Order(2)
    public void goToSecondPage(){
        secondPage = new SecondPage(driver);
        homePage.goToSecond_page();
    }

    @Test
    @Order(3)
    public void selectProduct(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on products detail page");

    }
    @Test
    @Order(4)
    public void addProductToCard(){
        productDetailPage.addToCard();
        Assertions.assertTrue(homePage.isProductAdd(),"Product is not add");

    }
    @Test
    @Order(5)
    public void goToCard(){
        cardPage = new CardPage(driver);
        homePage.goToCard();
        Assertions.assertTrue(cardPage.checkIfProductAdd(),"Product not found ");

    }
    @Test
    @Order(6)
    public void deleteProducts(){
        homePage.goToCard();
        cardPage.deleteProduct();
        Assertions.assertTrue(cardPage.checkIfProductDeleted(),"Product is found ");

    }

}
