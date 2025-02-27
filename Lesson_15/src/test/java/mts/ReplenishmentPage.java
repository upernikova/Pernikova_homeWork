package mts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ReplenishmentPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ReplenishmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    private By headerLocator = By.cssSelector(".pay__wrapper h2");
    private By logoLocator = By.cssSelector(".pay__partners ul li img");
    private By detailsLinkLocator = By.xpath("//a[text()='Подробнее о сервисе']");
    private By phoneFieldLocator = By.xpath("//input[@placeholder='Номер телефона']");
    private By amountFieldLocator = By.xpath("//input[@placeholder='Сумма']");
    private By emailFieldLocator = By.xpath("//input[@placeholder='E-mail для отправки чека']");
    private By continueButtonLocator = By.xpath("//button[text()='Продолжить']");
    private By errorMessagesLocator = By.cssSelector(".error-message");

    public String getHeaderText() {
        return driver.findElement(headerLocator).getText().replace("\n", " ");
    }

    public boolean areLogosDisplayed() {
        List<WebElement> logos = driver.findElements(logoLocator);
        if (logos.size() != 5) {
            return false;
        }

        for (WebElement logo : logos) {
            if (!logo.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public void clickDetailsLink() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(detailsLinkLocator));
        link.click();
    }

    public void fillReplenishmentForm(String phone, String amount, String email) {
        driver.findElement(phoneFieldLocator).sendKeys(phone);
        driver.findElement(amountFieldLocator).sendKeys(amount);
        driver.findElement(emailFieldLocator).sendKeys(email);
        driver.findElement(continueButtonLocator).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessagesLocator).getText();
    }
}