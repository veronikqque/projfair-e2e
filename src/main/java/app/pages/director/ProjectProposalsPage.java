package app.pages.director;

import app.pages.BasePage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ProjectProposalsPage extends BasePage {
  
    public SelenideElement projectProposalsLink = $("[data-test='user-navigation-project-proposals-link']");
    public SelenideElement newProposalsLink = $("[data-test='user-navigation-new-proposals-link']");
    public SelenideElement approvedProposalsLink = $("[data-test='user-navigation-approved-proposals-link']");
    
    public SelenideElement proposalsPage = $("[data-test='institute-director-proposals']");
    public ElementsCollection proposalCards = $$("[data-test='institute-director-proposals-proposal-card']");
    public SelenideElement emptyState = $("[data-test='institute-director-proposals-empty-state']");
    
    public SelenideElement approvalButton = $("[data-test='institute-director-project-proposal-card-approval-action']");
    public SelenideElement proposalStatus = $("[data-test='project-proposal-status']");

    public ProjectProposalsPage(String pageUrl) {
        super(pageUrl);
    }
}
