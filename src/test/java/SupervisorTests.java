import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;

public class SupervisorTests extends A_BaseTest {
    @BeforeClass
    void login() {
        Configuration.timeout = 20000; // может быть долгая загрузка и тест не отработает просто из-за timeout в 4 секунды, установлено 20 секунд
        app.mainPage.open();
        //app.mainPage.login();
        app.mainPage.mockLogin(true,
                true,
                "");
    }
    @Test
    void checkProposals() {
        //app.proposalListPage.open();
        app.mainPage.dropdownMenu.click();
        app.mainPage.dropdownMenuRoute.find(exactText("Мои заявки")).click();
        app.proposalListPage.proposalCardsList.shouldHave(sizeGreaterThan(0));
    }
    @Test
    void checkProjects() {
        //app.projectsListPage.open();
        app.mainPage.dropdownMenu.click();
        app.mainPage.dropdownMenuRoute.find(exactText("Мои проекты")).click();
        app.projectsListPage.projectsList.shouldHave(sizeGreaterThan(0));
    }

    @Test
    void rejectionReason() {
        //app.proposalListPage.open();
        app.mainPage.dropdownMenu.click();
        app.mainPage.dropdownMenuRoute.find(exactText("Мои заявки")).click();
        app.proposalListPage.showRejectionReasonButton.should(exist);
        app.proposalListPage.showRejectionReasonButton.click();
        app.proposalListPage.rejectionModal.shouldBe();
        app.proposalListPage.rejectionReasonText.shouldBe(visible).shouldNotHave(exactText(""));
    }
}
