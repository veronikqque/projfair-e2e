package app.pages.student;

import app.pages.BasePage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class StudentProjectsPage extends BasePage {
    public ElementsCollection projectCards = $$(".card");
    public StudentProjectsPage(String pageUrl) {
        super(pageUrl);
    }
}