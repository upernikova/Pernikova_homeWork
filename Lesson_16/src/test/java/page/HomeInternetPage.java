package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class HomeInternetPage extends BasePage {

    public HomeInternetPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Номер абонента']")
    private WebElement words;

    @FindBy(xpath = "//input[@placeholder='Сумма']")
    private WebElement amount;

    @FindBy(xpath = "//input[@placeholder='E-mail для отправки чека']")
    private WebElement email;

    @FindBy(xpath = "//button[@class='select__header']")
    private WebElement button;

    @FindBy(xpath = "//p[text()='Домашний интернет']")
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