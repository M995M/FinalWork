package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddressForDelivery extends BasePage{
    public AddressForDelivery (WebDriver driver){
        super(driver);
    }
    WebElement myOffice;
    WebElement country;
    WebElement index;
    WebElement city;
    WebElement street;
    WebElement numberOfBuilding;
    WebElement post;
    WebElement save;
    public void fillAddressOfDelivery(String yourCountry,String yourIndex, String yourCity, String yourStreet,String yourNumberOfHouse,String numberOfPost) {
        myOffice = driver.findElement(By.xpath("//li//a[@href='https://kachorovska.com/ru/my-info']"));
        myOffice.click();
        country = driver.findElement(By.xpath("//input[@name = 'country']"));
        index = driver.findElement(By.xpath("//input[@name = 'postcode']"));
        city = driver.findElement(By.xpath("//input[@name = 'city']"));
        street = driver.findElement(By.xpath("//input[@name = 'address_1']"));
        numberOfBuilding = driver.findElement(By.xpath("//input[@name = 'house']"));
        post = driver.findElement(By.xpath("//input[@name = 'address_2']"));
        save = driver.findElement(By.xpath("//div[@class='address']//button[@type='submit']"));
        action.moveToElement(save).perform();
        country.sendKeys(yourCountry);
        index.sendKeys(yourIndex);
        city.sendKeys(yourCity);
        street.sendKeys(yourStreet);
        numberOfBuilding.sendKeys(yourNumberOfHouse);
        post.sendKeys(numberOfPost);
        save.click();



    }
}
