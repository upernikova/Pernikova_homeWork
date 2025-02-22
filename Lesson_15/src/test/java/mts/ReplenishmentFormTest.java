package mts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ReplenishmentFormTest extends BaseTest {

    @Test
    public void testHeaderText() {
        ReplenishmentPage page = new ReplenishmentPage(driver);
        assertEquals("Онлайн пополнение без комиссии", page.getHeaderText(), "Header text does not match");
    }

    @Test
    public void testLogosDisplayed() {
        ReplenishmentPage page = new ReplenishmentPage(driver);
        assertTrue(page.areLogosDisplayed(), "Payment system logos are not displayed");
    }

    @Test
    public void testDetailsLink() {
        ReplenishmentPage page = new ReplenishmentPage(driver);
        page.clickDetailsLink();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                driver.getCurrentUrl(), "URL doesn't match");
    }

    @Test
    public void testPositiveReplenishment() {
        ReplenishmentPage page = new ReplenishmentPage(driver);
        page.fillReplenishmentForm("297777777", "5", "test@gmail.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement frameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));

        driver.switchTo().frame(frameElement);

        WebElement paymentTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay-description__text']/span")));

        String actualText = paymentTextElement.getText();
        String expectedText = "Оплата: Услуги связи Номер:375297777777";
        assertEquals(expectedText, actualText, "Displayed payment text does not match expected value");

        driver.switchTo().defaultContent();
    }

    @Test
    public void testInvalidAmount() {
        ReplenishmentPage page = new ReplenishmentPage(driver);
        page.fillReplenishmentForm("297777777", "0", "test@gmail.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"pay-connection\"]/div[2]/p")
        ));

        String actualErrorMessage = errorMessageElement.getAttribute("innerText").trim();
        String expectedErrorMessage = "Введите сумму платежа";

        assertEquals(expectedErrorMessage, actualErrorMessage, "Error message for amount does not match");
    }

    @ParameterizedTest
    @ValueSource(strings = {"в", "1", "com", "@gmail"})
    public void testInvalidEmail(String email) {
        ReplenishmentPage page = new ReplenishmentPage(driver);
        page.fillReplenishmentForm("297777777", "40", email);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='pay-connection']/div[3]/p")
        ));

        String actualErrorMessage = errorMessageElement.getAttribute("innerText").trim();
        String expectedErrorMessage = "Введите корректный адрес электронной почты.";

        assertEquals(expectedErrorMessage, actualErrorMessage, "Email error message does not match");
    }
}