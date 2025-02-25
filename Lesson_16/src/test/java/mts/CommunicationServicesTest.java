package mts;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.CommunicationServicesPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommunicationServicesTest extends BaseTest {
    private CommunicationServicesPage servicesPage;

    @BeforeEach
    public void initPage() {
        servicesPage = new CommunicationServicesPage(driver);
    }

    @Test
    @Description("Check list communication services")
    public void checkCommunicationServices() {
        assertEquals("Услуги связи", servicesPage.getWords());
    }

    @Test
    @Description("Check placeholder phoneNumber")
    public void checkPlaceholderPhoneNumber() {
        assertEquals("Номер телефона", servicesPage.getNumberPhone());
    }

    @Test
    @Description("Check placeholder amount")
    public void checkPlaceholderAmount() {
        assertEquals("Сумма", servicesPage.getAmount());
    }

    @Test
    @Description("Check placeholder email")
    public void checkPlaceholderEmail() {
        assertEquals("E-mail для отправки чека", servicesPage.getEmail());
    }
}