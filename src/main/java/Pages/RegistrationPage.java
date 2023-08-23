package Pages;

import Functions.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);

    }


    WebElement register;
    WebElement buttonRegistration;
    WebElement firstName;
    WebElement emailForRegister;
    WebElement passwordForRegister;
    WebElement confirmPassword;
    WebElement finalRegister;




    public void fillRegister() {

        register = driver.findElement(By.xpath("//div[@data-slick-index='0']//a[@onclick = 'SendToGaHeadClick();']//span[contains(text(), 'зарегестироваться')]"));
        register.click();
        buttonRegistration = driver.findElement(By.xpath("//form[@id='form-login']//button[@data-form='form_registr']"));
        wait.waitForVisibilityOfWebElement(buttonRegistration);
        buttonRegistration.click();
        firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        wait.waitForVisibilityOfWebElement(firstName);
        firstName.sendKeys("dasdaas");
        emailForRegister = driver.findElement(By.xpath("//form[@class='form_registr visible']//input[@name='email']"));
        emailForRegister.sendKeys(emailForAuthorization);
        passwordForRegister = driver.findElement(By.xpath("//form[@class='form_registr visible']//input[@name='password']"));
        passwordForRegister.sendKeys(passForAuthorization);
        confirmPassword = driver.findElement(By.xpath("//form[@class='form_registr visible']//input[@name='confirm']"));
        confirmPassword.sendKeys(passForAuthorization);
        finalRegister =driver.findElement(By.xpath("//form[@class='form_registr visible']//button[@type='submit']"));
        finalRegister.click();


    }








}
