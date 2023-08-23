package Pages;
import Functions.Waiters;
import Pages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);

    }

    WebElement buttonAuthorization;

    WebElement emailAuthorization;

    WebElement passAuthorization;

    WebElement buttonLogin;




    public void login(String email,String pass){

        buttonAuthorization = driver.findElement(By.xpath("//a[@href='https://kachorovska.com/ru/login']"));
        buttonAuthorization.click();
        emailAuthorization =driver.findElement(By.xpath("//form[@id='form-login']//input[@name='email']"));
        wait.waitForVisibilityOfWebElement(emailAuthorization);
        emailAuthorization.sendKeys(email);
        passAuthorization = driver.findElement(By.xpath("//form[@id='form-login']//input[@name='password']"));
        passAuthorization.sendKeys(pass);
        buttonLogin = driver.findElement(By.xpath("//form[@id='form-login']//button[@type='submit']"));
        buttonLogin.click();
        wait.waitForVisibilityOfWebElement(By.xpath("//ul[@class='breadcrumb']"));
    }

}
