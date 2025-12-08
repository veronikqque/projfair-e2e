package app.pages.director;

import app.pages.BasePage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class InstituteProposalsPage extends BasePage {
    public ElementsCollection proposalCards = $$("[data-test^='institute-director-project-proposals-proposal-card']");
    public ElementsCollection proposalTitles = $$("[data-test^='institute-director-project-proposals-proposal-card'] a");
    
    public SelenideElement newProposalsTab = $("[data-test='new-proposals-tab']");
    public SelenideElement approvedAutumnTab = $("[data-test='approved-autumn-tab']");
    public SelenideElement approvedSpringTab = $("[data-test='approved-spring-tab']");
    public SelenideElement rejectedProposalsTab = $("[data-test='rejected-proposals-tab']");
    
    public InstituteProposalsPage(String pageUrl) {
        super(pageUrl);
    }
}