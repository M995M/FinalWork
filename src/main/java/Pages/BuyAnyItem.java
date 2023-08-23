package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyAnyItem extends BasePage {
    public BuyAnyItem (WebDriver driver){
        super(driver);
    }
    WebElement weddingShoes;

    WebElement itemForBuy;

    WebElement buttonAddItem;

    WebElement createOrder;

    WebElement shopInKiev;

    WebElement methodToPay;

    WebElement confirmOrder;

    public void buyAnyItem(){
        weddingShoes = wait.waitForVisibilityOfWebElementReturn(By.xpath("//div[@class='menu-container']//a[@href='https://kachorovska.com/ru/wedding-shoes-c']"));
        weddingShoes.click();
        itemForBuy = wait.waitForVisibilityOfWebElementReturn(By.xpath("//a[@data-id='48860']//h4"));
        itemForBuy.click();
        buttonAddItem = wait.waitForVisibilityOfWebElementReturn(By.xpath("//button[@id='button-cart']"));
        buttonAddItem.click();
        createOrder = wait.waitForVisibilityOfWebElementReturn(By.xpath("//a[@href='/index.php?route=checkout/buy#checkout-f']"));
        createOrder.click();
        shopInKiev = wait.waitForVisibilityOfWebElementReturn(By.xpath("//div[@class='float internal']//div[@class='shipping-type-wrap']//div[1]//label[1]"));
        shopInKiev.click();
        methodToPay =  wait.waitForVisibilityOfWebElementReturn(By.xpath("//div[@class='radio oplata']//label"));
        methodToPay.click();
        confirmOrder = driver.findElement(By.xpath("//input[@id='button-order']"));
        confirmOrder.click();





    }


}
