package mts;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import page.InstallmentPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Тестирование рассрочки")
@Feature("Страница 'Рассрочка'")
public class InstallmentTest extends BaseTest {
    private InstallmentPage installmentPlanPage;

    @BeforeEach
    public void initializePage() {
        installmentPlanPage = new InstallmentPage(driver);
    }

    @Test
    @AllureId("1")
    @Story("Проверка заголовка варианта оплаты услуг")
    @Description("Проверяет, что на странице отображается заголовок 'Рассрочка'")
    @Severity(SeverityLevel.CRITICAL)
    public void checkInstallmentPlan() {
        installmentPlanPage.clickButton();
        assertEquals("Рассрочка", installmentPlanPage.clickList());
    }

    @Test
    @AllureId("2")
    @Story("Проверка плейсхолдера номера счета")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Номер счета на 44'")
    @Severity(SeverityLevel.NORMAL)
    public void checkAccountNumber() {
        installmentPlanPage.clickButton();
        installmentPlanPage.choiceList();
        assertEquals("Номер счета на 44", installmentPlanPage.getWords());
    }

    @Test
    @AllureId("3")
    @Story("Проверка плейсхолдера суммы")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Сумма'")
    @Severity(SeverityLevel.NORMAL)
    public void checkAmount() {
        installmentPlanPage.clickButton();
        installmentPlanPage.choiceList();
        assertEquals("Сумма", installmentPlanPage.getAmount());
    }

    @Test
    @AllureId("4")
    @Story("Проверка плейсхолдера email")
    @Description("Проверяет, что на странице отображается плейсхолдер 'E-mail для отправки чека'")
    @Severity(SeverityLevel.NORMAL)
    public void checkEmail() {
        installmentPlanPage.clickButton();
        installmentPlanPage.choiceList();
        assertEquals("E-mail для отправки чека", installmentPlanPage.getEmail());
    }
}