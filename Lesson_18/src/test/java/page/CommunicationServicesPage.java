package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommunicationServicesPage extends BasePage {

    public CommunicationServicesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='select__now']")
    private WebElement words;

    @FindBy(xpath = "//input[@placeholder='Номер телефона']")
    private WebElement numberPhone;

    @FindBy(xpath = "//input[@placeholder='Сумма']")
    private WebElement amount;

    @FindBy(xpath = "//input[@placeholder='E-mail для отправки чека']")
    private WebElement email;

    @Step("Получение заголовка страницы услуг связи")
    public String getWords() {
        return getText(words);
    }

    @Step("Получение плейсхолдера номера телефона")
    public String getNumberPhone() {
        return getPlaceholder(numberPhone);
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