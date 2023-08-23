package Functions;

import org.jaxen.expr.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class Assertions {
    private final WebDriver driver;
    private final Elements elements;
    private final Waiters waiters;



    public Assertions(WebDriver driver) {
        this.driver = driver;
        elements = new Elements(driver);
        waiters = new Waiters(driver);

    }

    public void equalsOfResult(WebElement actualElement, String expected) {
        String actual = actualElement.getText();
        assertEquals(actual, expected,
        "Я ожидал получить " + expected + ". А получил " + actual+ ".");
    }
    public void equalsOfResultString(String actualElement, String expected) {
        assertEquals(actualElement, expected,
                "Я ожидал получить " + expected + ". А получил " + actualElement+ ".");
    }

}
