import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

public class CandidateTests extends A_BaseTest {
    @BeforeClass
    void login() {
        Configuration.timeout = 20000; // может быть долгая загрузка и тест не отработает просто из-за timeout в 4 секунды, установлено 20 секунд
        app.mainPage.open();
        //app.mainPage.login();
        app.mainPage.mockLogin(false,
                true,
                "");
    }
}
