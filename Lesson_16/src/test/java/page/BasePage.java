package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    protected Actions action;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    protected void moveToElement(WebElement element) {
        action.moveToElement(element).build().perform();
    }

    protected String getText(WebElement element) {
        moveToElement(element);
        return element.getText();
    }

    protected String getPlaceholder(WebElement element) {
        moveToElement(element);
        return element.getAttribute("placeholder");
    }

    protected void clickElement(WebElement element) {
        moveToElement(element);
        element.click();
    }
}