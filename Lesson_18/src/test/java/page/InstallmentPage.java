package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class InstallmentPage extends BasePage {

    public InstallmentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Номер счета на 44']")
    private WebElement words;

    @FindBy(xpath = "//input[@placeholder='Сумма']")
    private WebElement amount;

    @FindBy(xpath = "//input[@placeholder='E-mail для отправки чека']")
    private WebElement email;

    @FindBy(xpath = "//button[@class='select__header']")
    private WebElement button;

    @FindBy(xpath = "//p[text()='Рассрочка']")
    private WebElement element;

    @Step("Кликаем по кнопке для выбора рассрочки")
    public void clickButton() {
        clickElement(button);
    }

    @Step("Выбираем элемент 'Рассрочка'")
    public String clickList() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        clickElement(element);
        return getText(element);
    }

    public void choiceList() {
        clickElement(element);
    }

    @Step("Получение плейсхолдера номера счета на 44")
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