package mts;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.PayingPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Тестирование страницы оплаты")
@Feature("Оплата услуг")
public class PayingTest extends BaseTest {
    private PayingPage payingPage;

    @BeforeEach
    public void initPage() {
        payingPage = new PayingPage(driver);
        payingPage.inputNumber("297777777");
        payingPage.inputAmount("5");
        payingPage.inputEmail("test@gmail.com");
        payingPage.clickButtonAndWaitForIframe();
    }

    @Test
    @AllureId("1")
    @Story("Проверка номера телефона")
    @Description("Проверяет, что на странице правильно отображается номер телефона в формате: 'Оплата: Услуги связи Номер:375297777777'")
    @Severity(SeverityLevel.CRITICAL)
    public void checkNumberPhone() {
        assertEquals("Оплата: Услуги связи Номер:375297777777", payingPage.getPhone().trim());
    }

    @Test
    @AllureId("2")
    @Story("Проверка суммы оплаты")
    @Description("Проверяет, что на странице отображается сумма оплаты в формате: '5.00 BYN'")
    @Severity(SeverityLevel.NORMAL)
    public void checkPaymentCost() {
        assertEquals("5.00 BYN", payingPage.getCost().trim());
    }

    @Test
    @AllureId("3")
    @Story("Проверка суммы на кнопке")
    @Description("Проверяет, что на кнопке отображается правильная сумма с текстом 'Оплатить 5.00 BYN'")
    @Severity(SeverityLevel.NORMAL)
    public void checkPaymentCostOnTheButton() {
        assertEquals("Оплатить 5.00 BYN", payingPage.getCostOnTheButton().trim());
    }

    @Test
    @AllureId("4")
    @Story("Проверка надписи 'Номер карты'")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Номер карты'")
    @Severity(SeverityLevel.MINOR)
    public void checkNumberCardInscription() {
        assertEquals("Номер карты", payingPage.getNumberCard().trim());
    }

    @Test
    @AllureId("5")
    @Story("Проверка срока действия карты")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Срок действия'")
    @Severity(SeverityLevel.MINOR)
    public void checkValidity() {
        assertEquals("Срок действия", payingPage.getValidity().trim());
    }

    @Test
    @AllureId("6")
    @Story("Проверка CVC")
    @Description("Проверяет, что на странице отображается плейсхолдер 'CVC'")
    @Severity(SeverityLevel.MINOR)
    public void checkCvc() {
        assertEquals("CVC", payingPage.getCvc().trim());
    }

    @Test
    @AllureId("7")
    @Story("Проверка имени владельца карты")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Имя держателя (как на карте)'")
    @Severity(SeverityLevel.MINOR)
    public void checkNameUser() {
        assertEquals("Имя держателя (как на карте)", payingPage.getNameUser().trim());
    }

    @Test
    @AllureId("8")
    @Story("Проверка отображения логотипов платежных систем")
    @Description("Проверяет, что на странице корректно отображаются логотипы платежных систем")
    @Severity(SeverityLevel.NORMAL)
    public void testLogosDisplayed() {
        PayingPage page = new PayingPage(driver);
        assertTrue(page.arePaymentSystemLogosDisplayed(), "Payment system logos are not displayed");
    }
}