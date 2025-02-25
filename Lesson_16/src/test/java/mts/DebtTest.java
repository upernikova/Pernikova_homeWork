package mts;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.DebtPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebtTest extends BaseTest {
    private DebtPage dutyPage;

    @BeforeEach
    public void initPage() {
        dutyPage = new DebtPage(driver);
    }

    @Test
    @Description("Check list duty")
    public void checkDuty() {
        dutyPage.clickButton();
        assertEquals("Задолженность", dutyPage.clickList());
    }

    @Test
    @Description("Check account number")
    public void checkAccountNumber() {
        dutyPage.clickButton();
        dutyPage.choiceList();
        assertEquals("Номер счета на 2073", dutyPage.getWords());
    }

    @Test
    @Description("Check amount")
    public void checkAmount() {
        dutyPage.clickButton();
        dutyPage.choiceList();
        assertEquals("Сумма", dutyPage.getAmount());
    }

    @Test
    @Description("Check email")
    public void checkEmail() {
        dutyPage.clickButton();
        dutyPage.choiceList();
        assertEquals("E-mail для отправки чека", dutyPage.getEmail());
    }
}