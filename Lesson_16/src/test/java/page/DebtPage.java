package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class DebtPage extends BasePage {

    public DebtPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Номер счета на 2073']")
    private WebElement words;

    @FindBy(xpath = "//input[@placeholder='Сумма']")
    private WebElement amount;

    @FindBy(xpath = "//input[@placeholder='E-mail для отправки чека']")
    private WebElement email;

    @FindBy(xpath = "//button[@class='select__header']")
    private WebElement button;

    @FindBy(xpath = "//p[text()='Задолженность']")
    private WebElement element;

    public void clickButton() {
        clickElement(button);
    }

    public String clickList() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickElement(element);
        return getText(element);
    }

    public void choiceList() {
        clickElement(element);
    }

    public String getWords() {
        return getPlaceholder(words);
    }

    public String getAmount() {
        return getPlaceholder(amount);
    }

    public String getEmail() {
        return getPlaceholder(email);
    }
}