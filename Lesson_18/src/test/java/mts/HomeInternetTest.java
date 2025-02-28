package mts;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import page.HomeInternetPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Тестирование домашнего интернета")
@Feature("Страница 'Домашний интернет'")
public class HomeInternetTest extends BaseTest {
    private HomeInternetPage homeInternetPage;

    @BeforeEach
    public void initializePage() {
        homeInternetPage = new HomeInternetPage(driver);
    }

    @Test
    @AllureId("1")
    @Story("Проверка заголовка варианта оплаты услуг")
    @Description("Проверяет, что на странице отображается заголовок 'Домашний интернет'")
    @Severity(SeverityLevel.CRITICAL)
    public void checkHomeInternet() {
        homeInternetPage.clickButton();
        assertEquals("Домашний интернет", homeInternetPage.clickList());
    }

    @Test
    @AllureId("2")
    @Story("Проверка плейсхолдера номера абонента")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Номер абонента'")
    @Severity(SeverityLevel.NORMAL)
    public void checkSubscriberNumber() {
        homeInternetPage.clickButton();
        homeInternetPage.choiceList();
        assertEquals("Номер абонента", homeInternetPage.getWords());
    }

    @Test
    @AllureId("3")
    @Story("Проверка плейсхолдера суммы")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Сумма'")
    @Severity(SeverityLevel.NORMAL)
    public void checkAmount() {
        homeInternetPage.clickButton();
        homeInternetPage.choiceList();
        assertEquals("Сумма", homeInternetPage.getAmount());
    }

    @Test
    @AllureId("4")
    @Story("Проверка плейсхолдера email")
    @Description("Проверяет, что на странице отображается плейсхолдер 'E-mail для отправки чека'")
    @Severity(SeverityLevel.NORMAL)
    public void checkEmail() {
        homeInternetPage.clickButton();
        homeInternetPage.choiceList();
        assertEquals("E-mail для отправки чека", homeInternetPage.getEmail());
    }
}