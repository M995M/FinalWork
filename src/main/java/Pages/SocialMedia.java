package Pages;

import Functions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;
import java.util.Set;

public class SocialMedia extends BasePage{
    public SocialMedia(WebDriver driver){
        super(driver);
    }
    WebElement footer;
    WebElement insta;
    WebElement facebook;
    WebElement pinterest;
    Action action = new Action(driver);
    public static String  pageTitleInst;
    public static String  pageTitleFB;
    public static String  pageTitlePinterest;
public void socialMedia(){
wait.waitForVisibilityOfWebElement(By.xpath("//footer"));
footer = driver.findElement(By.xpath("//footer"));
insta = driver.findElement(By.xpath("//a[@id='insta']"));
facebook = driver.findElement(By.xpath("//a[@id='fb']"));
pinterest = driver.findElement(By.xpath("//a[@id='pinter']"));
BasePage.action.moveToElement(footer).perform();
action.openNewTab(By.xpath("//a[@id='insta']"));
action.openNewTab(By.xpath("//a[@id='fb']"));
action.openNewTab(By.xpath("//a[@id='pinter']"));
    Set<String> windowHandles = driver.getWindowHandles();
    String[] handles = windowHandles.toArray(new String[0]);
    pageTitleInst = driver.switchTo().window(handles[1]).getTitle();
    pageTitleFB = driver.switchTo().window(handles[2]).getTitle();
    pageTitlePinterest = driver.switchTo().window(handles[3]).getTitle();
    System.out.println(pageTitleInst + "/////// " + pageTitleFB + "////////// " + pageTitlePinterest);
    driver.switchTo().window(handles[0]);
    BasePage.action.moveToElement(elements.findElementByXpath("//header"));





}

}
