package Pages;

import Functions.Assertions;
import Functions.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Functions.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

    protected static WebDriver driver;
    public static Waiters wait;
    static Assertions assertions;
    static Elements elements;
    public static Actions action;
    public String emailForAuthorization = "asdafaasd" + Math.random() + "@gmail.com";
    public String passForAuthorization = "159753hh";
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new Waiters(driver);
        assertions = new Assertions(driver);
        elements = new Elements(driver);
        action= new Actions(driver);
    }

    public final static String url = "https://kachorovska.com/ru/";
    public void openMainPage(){
        driver.get(BasePage.url);
    }

}