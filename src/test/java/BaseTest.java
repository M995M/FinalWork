
import Driver.DriverFactory;;
import Functions.Action;
import Functions.Assertions;
import Functions.Elements;
import Functions.Waiters;
import Pages.*;
/*import Utils.TestResultListeners;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;


/*@Listeners(TestResultListeners.class)*/
public class BaseTest {
    protected WebDriver driver = DriverFactory.startChromeDriver();
    protected Action actions = new Action(driver);
    protected Assertions assertions = new Assertions(driver);
    protected Elements elements = new Elements(driver);
    protected Waiters waiters = new Waiters(driver);
    protected RegistrationPage registrationPage = new RegistrationPage(driver);
    protected FillInformAboutYou fillInformAboutYou = new FillInformAboutYou(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected BasePage basePage = new BasePage(driver);
    protected LogOut logOut = new LogOut(driver);
    protected AddressForDelivery addressForDelivery = new AddressForDelivery(driver);
    protected ChangPassMethod changPassMethod = new ChangPassMethod(driver);
    protected AddItemsInBasket addItemInBasket = new AddItemsInBasket(driver);
    protected SocialMedia socialMedia = new SocialMedia(driver);
    protected FilterOfShoes filterOfShoes = new FilterOfShoes(driver);
    protected SearchByCode searchByCode = new SearchByCode(driver);
    protected FavoriteTab favoriteTab = new FavoriteTab(driver);
    protected BuyAnyItem buyAnyItem = new BuyAnyItem(driver);

    @BeforeSuite
    public void loginPage() {
        basePage.openMainPage();
    }


    /*@AfterSuite
    public void closeDriver(){
        driver.quit();
    }*/


}
