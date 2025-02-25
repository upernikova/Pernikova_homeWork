package mts;

import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import page.HomeInternetPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeInternetTest extends BaseTest {
    private HomeInternetPage homeInternetPage;

    @BeforeEach
    public void initializePage() {
        homeInternetPage = new HomeInternetPage(driver);
    }

    @Test
    @Description("Check list home internet")
    public void checkHomeInternet() {
        homeInternetPage.clickButton();
        assertEquals("Домашний интернет", homeInternetPage.clickList());
    }

    @Test
    @Description("Check subscriber number")
    public void checkSubscriberNumber() {
        homeInternetPage.clickButton();
        homeInternetPage.choiceList();
        assertEquals("Номер абонента", homeInternetPage.getWords());
    }

    @Test
    @Description("Check amount")
    public void checkAmount() {
        homeInternetPage.clickButton();
        homeInternetPage.choiceList();
        assertEquals("Сумма", homeInternetPage.getAmount());
    }

    @Test
    @Description("Check email")
    public void checkEmail() {
        homeInternetPage.clickButton();
        homeInternetPage.choiceList();
        assertEquals("E-mail для отправки чека", homeInternetPage.getEmail());
    }
}