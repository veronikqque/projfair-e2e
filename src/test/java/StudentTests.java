import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.AssertJUnit.assertTrue;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class StudentTests extends A_BaseTest {
    @BeforeClass
    void login() {
        app.mainPage.open();
        //app.mainPage.login();
        app.mainPage.mockLogin(true);
    }

    @Test
    void viewStudentProjects() { //сценарий для просмотра списка проектов студента
        //app.studentProjectsPage.open();
        app.mainPage.dropdownMenu.click();
        app.mainPage.dropdownMenuRoute.find(exactText("Мои проекты")).click();
        app.projectsListPage.projectsList.shouldHave(sizeGreaterThan(0));
    }
}