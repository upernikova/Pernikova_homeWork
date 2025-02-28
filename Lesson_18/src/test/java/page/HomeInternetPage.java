package page;

import io.qameta.allure.Step;
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

    @Step("Кликаем по кнопке для выбора домашнего интернета")
    public void clickButton() {
        clickElement(button);
    }

    @Step("Выбираем элемент 'Домашний интернет'")
    public String clickList() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickElement(element);
        return getText(element);
    }

    public void choiceList() {
        clickElement(element);
    }

    @Step("Получение плейсхолдера номера абонента")
    public String getWords() {
        return getPlaceholder(words);
    }

    @Step("Получение плейсхолдера суммы")
    public String getAmount() {
        return getPlaceholder(amount);
    }

    @Step("Получение плейсхолдера email")
    public String getEmail() {
        return getPlaceholder(email);
    }
}