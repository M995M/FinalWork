import Functions.Action;
import Functions.Waiters;
import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class kachorovskaTest extends BaseTest {
    @Test
    public void registerTest() {
        basePage.openMainPage();
        registrationPage.fillRegister();
        WebElement finalResult = driver.findElement(By.xpath("//div[@class='account_wrapper']//div[@id='registration_modal']//div[@class='title']"));
        assertions.equalsOfResult(finalResult, "Поздравляем! Вы успешно зарегистрировались на сайте kachorovska.com");
        logOut.logOutProcess();


    }

    @Test
    public void loginTest() {
        basePage.openMainPage();
        loginPage.login("kirilldaniluk9@gmail.com", "159753h");
        WebElement finalResult = driver.findElement(By.xpath("//ul[@class='breadcrumb']/li"));
        assertions.equalsOfResult(finalResult, "ПРИВЕТСТВУЕМ, AFASF");
        logOut.logOutProcess();

    }

    @Test
    public void fillInform() {
        basePage.openMainPage();
        loginPage.login("kirilldaniluk9@gmail.com", "159753h");
        fillInformAboutYou.fillInform();
        WebElement finalResult = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
        assertions.equalsOfResult(finalResult, "Ваша учетная запись была успешно обновлена!");
        logOut.logOutProcess();
    }

    @Test
    public void addressFillForm() {
        basePage.openMainPage();
        loginPage.login("kirilldaniluk9@gmail.com", "159753h");
        addressForDelivery.fillAddressOfDelivery("Україна", "04214", "Київ", "Героїв Дніпра", "47", "145");
        WebElement finalResult = driver.findElement(By.xpath("//div[@class='address']//form//div[@class='alert alert-success']"));
        assertions.equalsOfResult(finalResult, "Ваш адрес успешно обновлен");
        logOut.logOutProcess();
    }

    @Test
    public void changePass() {
        basePage.openMainPage();
        loginPage.login("kirilldaniluk9@gmail.com", "159753h");
        changPassMethod.changPassAndLogin("159753h");
        assertions.equalsOfResult(ChangPassMethod.passSuccessfulChanged, "Пароль успешно изменен");
        logOut.logOutProcess();
        loginPage.login("kirilldaniluk9@gmail.com", "159753h");
        WebElement finalResult = driver.findElement(By.xpath("//ul[@class='breadcrumb']/li"));
        assertions.equalsOfResult(finalResult, "ПРИВЕТСТВУЕМ, AFASF");
        logOut.logOutProcess();
        //changPassMethod.loginAfterChange();
    }



    @Test
    public void socialMediaTest() {
        basePage.openMainPage();
        socialMedia.socialMedia();
        assertions.equalsOfResultString(SocialMedia.pageTitleInst, "KACHOROVSKA (kachorovska) - Profile | Pinterest");
        assertions.equalsOfResultString(SocialMedia.pageTitleFB, "Kachorovska (@kachorovska_atelier) • Фото и видео в Instagram");
        assertions.equalsOfResultString(SocialMedia.pageTitlePinterest, "Kachorovska atelier | Facebook");
        WebElement header = driver.findElement(By.xpath("//header"));
        BasePage.action.moveToElement(header).perform();
    }

    @Test
    public void filtersTest() {
        basePage.openMainPage();
        filterOfShoes.filtersTest();
        WebElement finalResult = driver.findElement(By.xpath("//div[@class='productName prodictaddinfo47760']//h4"));
        BasePage.wait.waitForVisibilityOfWebElement(finalResult);
        assertions.equalsOfResult(finalResult, "Босоножки Liv оранжевые кожаные /9 см/");


    }

    @Test
    public void searchTest() {
        basePage.openMainPage();
        searchByCode.searchBYCode();
        WebElement finalResult = driver.findElement(By.xpath("//div[@class='productBot']//div[@class='productName']//h4[contains(text(), 'Ботильоны Blanca голубые кожаные /7 см/')]"));
        assertions.equalsOfResult(finalResult, "Ботильоны Blanca голубые кожаные /7 см/");
    }

    @Test
    public void callback() {
        basePage.openMainPage();
        WebElement callback = driver.findElement(By.xpath("//div[@class='footer_subscriber-bottom']//a[@href='https://kachorovska.com/ru/contacts']"));
        BasePage.action.moveToElement(callback);
        callback.click();
        String title = driver.getTitle();
        assertions.equalsOfResultString(title, "Обратная связь");
    }
    @Test
    public void addItemInBasket() {
        basePage.openMainPage();
        loginPage.login("kirilldaniluk9@gmail.com", "159753h");
        addItemInBasket.addInBasket();
        assertions.equalsOfResult(AddItemsInBasket.itemInBasket, "*** Ковбойки Cherilyn молочные замшевые с окантовкой");
        logOut.logOutProcess();

    }


    @Test
    public void BuyAnyItem() {
        basePage.openMainPage();
        loginPage.login("kirilldaniluk9@gmail.com", "159753h");
        buyAnyItem.buyAnyItem();
        WebElement finalResult = driver.findElement(By.xpath("//div[@class='alert alert-danger ocpb-alert']"));
        assertions.equalsOfResult(finalResult, "Вы должны прочитать и согласиться с Terms & Conditions!\n" +
                "×");
        WebElement office = driver.findElement(By.xpath("//a[@href='https://kachorovska.com/ru/my-account']"));
        office.click();
        WebElement logout = driver.findElement(By.xpath("//div[@class='a_menu']//ul//li//a[@href='https://kachorovska.com/ru/logout']"));
        logout.click();

    }

    @Test
    public void informAboutUs() {
        basePage.openMainPage();
        WebElement aboutUs = driver.findElement(By.xpath("//div[@class='footer_subscriber-bottom']//a[@href='https://kachorovska.com/ru/about']"));
        BasePage.action.moveToElement(aboutUs);
        aboutUs.click();
        String title = driver.getTitle();
        assertions.equalsOfResultString(title, "О нас");
    }

    @Test
    public void news() {
        basePage.openMainPage();
        WebElement news = driver.findElement(By.xpath("//div[@class='footer_subscriber-bottom']//a[@href='https://kachorovska.com/ru/news']"));
        BasePage.action.moveToElement(news);
        news.click();
        String title = driver.getTitle();
        assertions.equalsOfResultString(title, "Новости");
    }

    @Test
    public void vacation() {
        basePage.openMainPage();
        WebElement vacation = driver.findElement(By.xpath("//div[@class='footer_subscriber-bottom']//a[@href='https://kachorovska.com/ru/vacancii']"));
        BasePage.action.moveToElement(vacation);
        vacation.click();
        String title = driver.getTitle();
        assertions.equalsOfResultString(title, "Вакансии");
    }


    @Test
    public void addToFavoriteTest() {
        basePage.openMainPage();
        loginPage.login("kirilldaniluk9@gmail.com", "159753h");
        favoriteTab.addToFavorite();
        WebElement finalResult = driver.findElement(By.xpath("//h1"));
        assertions.equalsOfResult(finalResult, "Сапоги Erica розовые кожаные добавлены в ваше избараное");
        logOut.logOutProcess();
    }



}
