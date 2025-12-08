import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChimitovTests extends A_BaseTest {
    @BeforeClass
    void login() {
        app.mainPage.open();
        //app.mainPage.login();
        app.mainPage.mockLogin(true, false, "");
    }

    @Test
    void lostStudentsCheck() {
        app.mainPage.dropdownMenu.click();
        app.mainPage.dropdownMenuRoute.find(exactText("Формирование проектных команд")).click();
        $(byText("Нераспределенные студенты")).click();
        app.commandListPage.lostStudents.click();
        app.commandListPage.silentStudentsList.shouldHave(sizeGreaterThan(0));
    }
}