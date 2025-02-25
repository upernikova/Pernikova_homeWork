package mts;

import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import page.InstallmentPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstallmentTest extends BaseTest {
    private InstallmentPage installmentPlanPage;

    @BeforeEach
    public void initializePage() {
        installmentPlanPage = new InstallmentPage(driver);
    }

    @Test
    @Description("Check list installment plan")
    public void checkInstallmentPlan() {
        installmentPlanPage.clickButton();
        assertEquals("Рассрочка", installmentPlanPage.clickList());
    }

    @Test
    @Description("Check account number")
    public void checkAccountNumber() {
        installmentPlanPage.clickButton();
        installmentPlanPage.choiceList();
        assertEquals("Номер счета на 44", installmentPlanPage.getWords());
    }

    @Test
    @Description("Check amount")
    public void checkAmount() {
        installmentPlanPage.clickButton();
        installmentPlanPage.choiceList();
        assertEquals("Сумма", installmentPlanPage.getAmount());
    }

    @Test
    @Description("Check email")
    public void checkEmail() {
        installmentPlanPage.clickButton();
        installmentPlanPage.choiceList();
        assertEquals("E-mail для отправки чека", installmentPlanPage.getEmail());
    }
}