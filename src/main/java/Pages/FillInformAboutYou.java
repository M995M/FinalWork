package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FillInformAboutYou extends BasePage {
    public FillInformAboutYou(WebDriver driver) {
        super(driver);
    }

    WebElement closeNotification;

    WebElement myOffice;

    WebElement lastName;

    WebElement phone;
    WebElement sizeOfSneakers;

   // WebElement birthday;

    WebElement discountCard;
    WebElement saveChange;

    public void fillInform() {

        closeNotification = driver.findElement(By.xpath("//div[@id='content']//div[@id='registration_modal']//button[@class='close']"));
        myOffice = driver.findElement(By.xpath("//li//a[@href='https://kachorovska.com/ru/my-info']"));
        myOffice.click();
        lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        wait.waitForVisibilityOfWebElement(lastName);
        phone = driver.findElement(By.xpath("//input[@name='telephone']"));
        sizeOfSneakers = driver.findElement(By.xpath("//input[@name='size']"));
       // birthday = driver.findElement(By.xpath("//input[@name='birthday']"));
        discountCard = driver.findElement(By.xpath("//input[@name='coupon']"));
        lastName.sendKeys("gsdesdf");
        phone.sendKeys("734075902");
        sizeOfSneakers.sendKeys("42");
        //birthday.sendKeys("22062000");
        discountCard.sendKeys("1234567891011121");
        saveChange = driver.findElement(By.xpath("//form[@id='form-customer']//button"));
        saveChange.click();
    }

}
