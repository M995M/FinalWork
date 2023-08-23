package Pages;

import Functions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItemsInBasket extends BasePage{
    public AddItemsInBasket(WebDriver driver){
        super(driver);
    }

    //div[@class='productBot_wrapper']//h4
    //Добавить в корзину
    //Товар Добавлен в корзину//div[@class='popup-window-titlebar']
    //close//div[@class='popup-window-close-icon']
    //basket////a[@id='cart']
    //ItemInBasket//a[@class='tovar_name']
    WebElement shoes;
    WebElement item;
    WebElement addInBasket;
    WebElement confirmAdd;
    WebElement closeElement;
    WebElement yourBasket;
    public static WebElement itemInBasket;
    public static String expectedNameOfItem;
    public void addInBasket(){
        shoes = driver.findElement(By.xpath("//ul//a[@href='https://kachorovska.com/ru/vzuttya']"));
        shoes.click();
        wait.waitForVisibilityOfWebElement(By.xpath("//a[@data-id='48520']//h4"));
        item=driver.findElement(By.xpath("//a[@data-id='48520']//h4"));
        expectedNameOfItem = item.getText();
        item.click();
        addInBasket=driver.findElement(By.xpath("//div[@class='item_info_section']//button[@id='button-cart']"));
        addInBasket.click();
        wait.waitForVisibilityOfWebElement(By.xpath("//div[@class='popup-window-titlebar']"));
        confirmAdd = driver.findElement(By.xpath("//div[@class='popup-window-titlebar']"));
        assertions.equalsOfResult(confirmAdd,"ТОВАР ДОБАВЛЕН В КОРЗИНУ");
        closeElement = driver.findElement(By.xpath("//div[@class='popup-window-close-icon']"));
        closeElement.click();
        yourBasket = driver.findElement(By.xpath("//a[@id='cart']"));
        yourBasket.click();
        itemInBasket = driver.findElement(By.xpath("//a[@class='tovar_name']"));
    }

}
