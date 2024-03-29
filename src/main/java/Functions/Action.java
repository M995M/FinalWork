package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {
    private final WebDriver driver;
    private final Elements elements;
    private final Actions actions;

    public Action(WebDriver driver){
        this.driver = driver;
        elements = new Elements(driver);
        actions = new Actions(driver);
    }

    public void dragAndDrop(By sourceLocator, By targetLocator){
        actions.dragAndDrop(elements.findElement(sourceLocator), elements.findElement(targetLocator)).perform();
    }


    public void openNewTab(By by){
        WebElement element = driver.findElement(by);
        actions.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();
    }



}
