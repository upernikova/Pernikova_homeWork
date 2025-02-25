package mts;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.PayingPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    @Description("Check number phone")
    public void checkNumberPhone() {
        assertEquals("Оплата: Услуги связи Номер:375297777777", payingPage.getPhone().trim());
    }

    @Test
    @Description("Check payment cost")
    public void checkPaymentCost() {
        assertEquals("5.00 BYN", payingPage.getCost().trim());
    }

    @Test
    @Description("Check payment cost on the button")
    public void checkPaymentCostOnTheButton() {
        assertEquals("Оплатить 5.00 BYN", payingPage.getCostOnTheButton().trim());
    }

    @Test
    @Description("Check number card inscription")
    public void checkNumberCardInscription() {
        assertEquals("Номер карты", payingPage.getNumberCard().trim());
    }

    @Test
    @Description("Check validity")
    public void checkValidity() {
        assertEquals("Срок действия", payingPage.getValidity().trim());
    }

    @Test
    @Description("Check cvc")
    public void checkCvc() {
        assertEquals("CVC", payingPage.getCvc().trim());
    }

    @Test
    @Description("Check name user")
    public void checkNameUser() {
        assertEquals("Имя держателя (как на карте)", payingPage.getNameUser().trim());
    }

    @Test
    @Description("Check Logos")
    public void testLogosDisplayed() {
        PayingPage page = new PayingPage(driver);
        assertTrue(page.arePaymentSystemLogosDisplayed(), "Payment system logos are not displayed");
    }
}