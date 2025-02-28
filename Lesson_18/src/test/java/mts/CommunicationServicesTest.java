package mts;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.CommunicationServicesPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Тестирование услуг связи")
@Feature("Страница 'Услуги связи'")
public class CommunicationServicesTest extends BaseTest {
    private CommunicationServicesPage servicesPage;

    @BeforeEach
    public void initPage() {
        servicesPage = new CommunicationServicesPage(driver);
    }

    @Test
    @AllureId("1")
    @Story("Проверка заголовка варианта оплаты услуг")
    @Description("Проверяет, что на странице отображается заголовок 'Услуги связи'")
    @Severity(SeverityLevel.CRITICAL)
    public void checkCommunicationServices() {
        assertEquals("Услуги связи", servicesPage.getWords());
    }

    @Test
    @AllureId("2")
    @Story("Проверка плейсхолдера номера телефона")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Номер телефона'")
    @Severity(SeverityLevel.NORMAL)
    public void checkPlaceholderPhoneNumber() {
        assertEquals("Номер телефона", servicesPage.getNumberPhone());
    }

    @Test
    @AllureId("3")
    @Story("Проверка плейсхолдера суммы")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Сумма'")
    @Severity(SeverityLevel.NORMAL)
    public void checkPlaceholderAmount() {
        assertEquals("Сумма", servicesPage.getAmount());
    }

    @Test
    @AllureId("4")
    @Story("Проверка плейсхолдера Email")
    @Description("Проверяет, что на странице отображается плейсхолдер 'E-mail для отправки чека'")
    @Severity(SeverityLevel.NORMAL)
    public void checkPlaceholderEmail() {
        assertEquals("E-mail для отправки чека", servicesPage.getEmail());
    }
}