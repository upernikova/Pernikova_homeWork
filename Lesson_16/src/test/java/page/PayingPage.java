package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.time.Duration;

public class PayingPage extends BasePage {
    private WebDriverWait wait;
    private JavascriptExecutor jsExecutor;

    public PayingPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//input[@placeholder='Номер телефона']")
    private WebElement numberPhone;

    @FindBy(xpath = "//input[@placeholder='Сумма']")
    private WebElement amount;

    @FindBy(xpath = "//input[@placeholder='E-mail для отправки чека']")
    private WebElement email;

    @FindBy(xpath = "//button[text()='Продолжить']")
    private WebElement button;

    @FindBy(xpath = "//div[@class='pay-description__text']/span")
    private WebElement phone;

    @FindBy(xpath = "//div[@class='pay-description__cost']/span")
    private WebElement cost;

    @FindBy(xpath = "//button[@class='colored disabled']")
    private WebElement costOnTheButton;

    @FindBy(xpath = "//div[contains(@class, 'cards-brands') and contains(@class, 'ng-tns-c46-1')]\n")
    private List<WebElement> paymentSystemLogos;

    @FindBy(xpath = "//label[@class='ng-tns-c46-1 ng-star-inserted']")
    private WebElement numberCard;

    @FindBy(xpath = "//label[@class='ng-tns-c46-4 ng-star-inserted']")
    private WebElement validity;

    @FindBy(xpath = "//label[@class='ng-tns-c46-5 ng-star-inserted']")
    private WebElement cvc;

    @FindBy(xpath = "//label[@class='ng-tns-c46-3 ng-star-inserted']")
    private WebElement nameUser;

    public void inputNumber(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOf(numberPhone)).sendKeys(phoneNumber);
    }

    public void inputAmount(String sum) {
        wait.until(ExpectedConditions.visibilityOf(amount)).sendKeys(sum);
    }

    public void inputEmail(String e) {
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(e);
    }

    public void clickButtonAndWaitForIframe() {
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(button));
        btn.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement frameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));

        driver.switchTo().frame(frameElement);
    }

    public String getPhone() {
        Actions action = new Actions(driver);
        action.moveToElement(phone).build().perform();
        String phone1 = phone.getAttribute("innerText");
        return phone1;
    }

    public String getCost() {
        Actions action = new Actions(driver);
        action.moveToElement(cost).build().perform();
        String cost1 = cost.getAttribute("innerText");
        return cost1;
    }

    public String getCostOnTheButton() {
        Actions action = new Actions(driver);
        action.moveToElement(costOnTheButton).build().perform();
        String cost2 = costOnTheButton.getAttribute("innerText");
        return cost2;
    }

    public String getNumberCard() {
        Actions action = new Actions(driver);
        action.moveToElement(numberCard).build().perform();
        String card = numberCard.getAttribute("innerText");
        return card;
    }

    public String getValidity() {
        Actions action = new Actions(driver);
        action.moveToElement(validity).build().perform();
        String val = validity.getAttribute("innerText");
        return val;
    }

    public String getCvc() {
        Actions action = new Actions(driver);
        action.moveToElement(cvc).build().perform();
        String c = cvc.getAttribute("innerText");
        return c;
    }

    public String getNameUser() {
        Actions action = new Actions(driver);
        action.moveToElement(nameUser).build().perform();
        String user = nameUser.getAttribute("innerText");
        return user;
    }

    public boolean arePaymentSystemLogosDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(paymentSystemLogos));

            for (WebElement logo : paymentSystemLogos) {
                if (logo.isDisplayed()) {
                    return true;
                }
            }

            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
