package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchByCode extends BasePage {
    public SearchByCode(WebDriver driver) {
        super(driver);
    }

    WebElement searchButton;

    WebElement searchInput;
    WebElement closeSearch;

    //BO7249001
    WebElement target;

    //div[@class='productBot']//div[@class='productName']//h4[contains(text(), 'Ботильоны Blanca голубые кожаные /7 см/')]
    public void searchBYCode() {
        searchButton = wait.waitForVisibilityOfWebElementReturn(By.xpath(" //li[@class='d-flex header-main_search_li']"));
        searchButton.click();
        searchInput = wait.waitForVisibilityOfWebElementReturn(By.xpath("//div[@class='search_content_line']//input[@type='text']"));
        searchInput.sendKeys("BO7249001");
        wait.waitForVisibilityOfWebElement(By.xpath("//div[@class='productBot']//div[@class='productName']//h4[contains(text(), 'Ботильоны Blanca голубые кожаные /7 см/')]"));
        closeSearch = driver.findElement(By.xpath("//a[@class='header-main_buttons_search']"));
        closeSearch.click();
    }
}
