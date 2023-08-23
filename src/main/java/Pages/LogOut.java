package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut extends BasePage {
    public LogOut(WebDriver driver) {
        super(driver);
    }

    public WebElement office;
    public WebElement logOutButton;
    public WebElement header;

    public void logOutProcess() {
        header = driver.findElement(By.xpath("//header"));
        action.moveToElement(header).perform();
        office = driver.findElement(By.xpath("//li//a[@href='https://kachorovska.com/ru/my-account']"));
        //wait.waitForVisibilityOfWebElement(office);
        office.click();
        //wait.waitForVisibilityOfWebElement(By.xpath("//li//a[@href='https://kachorovska.com/ru/logout']"));
        logOutButton = driver.findElement(By.xpath("//li//a[@href='https://kachorovska.com/ru/logout']"));
        logOutButton.click();

    }
}
