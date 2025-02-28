package mts;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.DebtPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Тестирование задолженности")
@Feature("Страница 'Задолженность'")
public class DebtTest extends BaseTest {
    private DebtPage dutyPage;


    @BeforeEach
    public void initPage() {
        dutyPage = new DebtPage(driver);
    }

    @Test
    @AllureId("1")
    @Story("Проверка заголовка варианта оплаты услуг")
    @Description("Проверяет, что на странице отображается заголовок 'Задолженность'")
    @Severity(SeverityLevel.CRITICAL)
    public void checkDuty() {
        dutyPage.clickButton();
        assertEquals("Задолженность", dutyPage.clickList());
    }

    @Test
    @AllureId("2")
    @Story("Проверка плейсхолдера номера счета")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Номер счета на 2073'")
    @Severity(SeverityLevel.NORMAL)
    public void checkAccountNumber() {
        dutyPage.clickButton();
        dutyPage.choiceList();
        assertEquals("Номер счета на 2073", dutyPage.getWords());
    }

    @Test
    @AllureId("3")
    @Story("Проверка плейсхолдера суммы задолженности")
    @Description("Проверяет, что на странице отображается плейсхолдер 'Сумма'")
    @Severity(SeverityLevel.NORMAL)
    public void checkAmount() {
        dutyPage.clickButton();
        dutyPage.choiceList();
        assertEquals("Сумма", dutyPage.getAmount());
    }

    @Test
    @AllureId("4")
    @Story("Проверка плейсхолдера Email")
    @Description("Проверяет, что на странице отображается плейсхолдер 'E-mail для отправки чека'")
    @Severity(SeverityLevel.NORMAL)
    public void checkEmail() {
        dutyPage.clickButton();
        dutyPage.choiceList();
        assertEquals("E-mail для отправки чека", dutyPage.getEmail());
    }
}