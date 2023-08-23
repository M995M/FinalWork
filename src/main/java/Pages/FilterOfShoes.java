package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterOfShoes extends BasePage {
    public FilterOfShoes(WebDriver driver) {
        super(driver);
    }

    WebElement shoesTab;

    WebElement filtersButton;

    WebElement blockOfFilters;
    WebElement sizeOfSole;
    //a[@href='https://kachorovska.com/ru/vzuttya/rozmir/41/']
    WebElement sizeOfHell;
    //a[@href='https://kachorovska.com/ru/vzuttya/rozmir/41/visota-pidboriv/9-sm/']
    WebElement colorOfItem;
    //a[@href='https://kachorovska.com/ru/vzuttya/rozmir/41/kolir/pomaranchevij/']
    WebElement actualResult;
    //div[@class='productName prodictaddinfo47760']//h4
    public void filtersTest() {
        shoesTab = wait.waitForVisibilityOfWebElementReturn(By.xpath("//ul//a[@href='https://kachorovska.com/ru/vzuttya']"));
        shoesTab.click();
        filtersButton = wait.waitForVisibilityOfWebElementReturn(By.xpath("//div[@class='category-right']//div[@class='category-filter__drop']"));
        filtersButton.click();
        blockOfFilters = driver.findElement(By.xpath("//div[@class='category-parametr ']"));
        blockOfFilters.click();
        sizeOfSole = driver.findElement(By.xpath("//a[@href='https://kachorovska.com/ru/vzuttya/rozmir/41/']"));
        sizeOfSole.click();
        sizeOfHell = driver.findElement(By.xpath("//a[@href='https://kachorovska.com/ru/vzuttya/rozmir/41/visota-pidboriv/9-sm/']"));
        sizeOfHell.click();
        colorOfItem= driver.findElement(By.xpath("//a[@href='https://kachorovska.com/ru/vzuttya/rozmir/41/visota-pidboriv/9-sm/kolir/pomaranchevij/']"));
        colorOfItem.click();

    }
}
