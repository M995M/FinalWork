package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangPassMethod extends BasePage {
    public ChangPassMethod(WebDriver driver){
        super(driver);
    }
    WebElement buttonAuthorization;

    WebElement emailAuthorization;

    WebElement passAuthorization;

    WebElement buttonLogin;
    WebElement myOffice;
    WebElement razdelitel;

    WebElement oldPass;


    WebElement newPassword;

    WebElement confirmPass;

    WebElement changePass;
    public static String newPass;
    public static WebElement passSuccessfulChanged;

public void changPassAndLogin(String newpass){
    myOffice = driver.findElement(By.xpath("//li//a[@href='https://kachorovska.com/ru/my-info']"));
    myOffice.click();
    razdelitel = driver.findElement(By.xpath("//div[@id='razdelitel']"));
    action.moveToElement(razdelitel).perform();
    oldPass = driver.findElement(By.xpath("//input[@name='old_password']"));
    newPassword = driver.findElement(By.xpath("//input[@name='new_password']"));
    confirmPass = driver.findElement(By.xpath("//input[@name='confirm_password']"));
    changePass = driver.findElement(By.xpath("//button[contains(text(), 'Изменить пароль')]"));
    oldPass.sendKeys("159753h");
    newPass = newpass;
    newPassword.sendKeys(newPass);
    confirmPass.sendKeys(newPass);
    changePass.click();
    passSuccessfulChanged = driver.findElement(By.xpath("//form[@id='form-password']//div"));
}
/*public void loginAfterChange(){
        buttonAuthorization = driver.findElement(By.xpath("//a[@href='https://kachorovska.com/ru/login']"));
        buttonAuthorization.click();
        emailAuthorization =driver.findElement(By.xpath("//form[@id='form-login']//input[@name='email']"));
        wait.waitForVisibilityOfWebElement(emailAuthorization);
        emailAuthorization.sendKeys("kirilldaniluk9@gmail.com");
        passAuthorization = driver.findElement(By.xpath("//form[@id='form-login']//input[@name='password']"));
        passAuthorization.sendKeys(newPass);
        buttonLogin = driver.findElement(By.xpath("//form[@id='form-login']//button[@type='submit']"));
        buttonLogin.click();
    }*/
}
