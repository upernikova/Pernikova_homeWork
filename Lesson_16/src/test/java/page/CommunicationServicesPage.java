package page;

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

    public String getWords() {
        return getText(words);
    }

    public String getNumberPhone() {
        return getPlaceholder(numberPhone);
    }

    public String getAmount() {
        return getPlaceholder(amount);
    }

    public String getEmail() {
        return getPlaceholder(email);
    }
}