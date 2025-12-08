package app.pages.chimitov;

import app.pages.BasePage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CommandListPage extends BasePage {
    public ElementsCollection silentStudentsList = $$("[data-test='arm-students-silent-candidate-']");
    public SelenideElement lostStudents = $("[data-test='arm-students-lost-students']");
    public CommandListPage(String pageUrl) {
        super(pageUrl);
    }
}

