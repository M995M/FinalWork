package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FavoriteTab extends BasePage{
    public FavoriteTab (WebDriver driver){
        super(driver);
    }
WebElement shoes;
    WebElement item;
    WebElement addToFavorite;
    WebElement myFavorite;
    public void addToFavorite(){
        shoes = driver.findElement(By.xpath("//ul//a[@href='https://kachorovska.com/ru/vzuttya']"));
        shoes.click();
        item = wait.waitForVisibilityOfWebElementReturn(By.xpath("//a[@data-id='48520']//h4"));
        item.click();
        addToFavorite = wait.waitForVisibilityOfWebElementReturn(By.xpath("//button[@class='product_wishlist']"));
        addToFavorite.click();
        myFavorite = driver.findElement(By.xpath("//a[@href='/favorite']"));
        myFavorite.click();
    }
}
