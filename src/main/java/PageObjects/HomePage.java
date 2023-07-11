package PageObjects;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//header//img[@alt='Bhinneka.com']//parent::a")
    private WebElement headerLogoButton;
    @FindBy(className = "icon-user")
    public WebElement profileIcon;

    @FindBy(xpath = "//span[normalize-space()='Manage Users']")
    public WebElement manageUserLink;
    @FindBy(xpath = "//a[normalize-space()='Add User']")
    public WebElement adduserLink;

    @FindBy(xpath = "//a[normalize-space()='Company Profile']")
    public WebElement companyProfile;

    @FindBy(xpath = "//span[@class='arrow open']")
    public WebElement arrowBtn;

    @FindBy(xpath = "//a[normalize-space()='View Users']")
    public WebElement viewUsersLink;

    @FindBy(xpath = "//a[normalize-space()='Add Edit Groups']")
    public WebElement AddEditGroupsLink;

    @FindBy(xpath = "//span[normalize-space()='Setups']")
    public WebElement  SetupsLink;

    @FindBy(xpath = "//a[normalize-space()='Workflows']")
    public WebElement Workflow;
    @FindBy(xpath = "//a[normalize-space()='Buttons']")
    public WebElement  Buttons;
    @FindBy(xpath = "//a[normalize-space()='Job Sections']")
    public WebElement  JobSectionsLink;
    @FindBy(xpath = "//a[normalize-space()='Job List']")
    public WebElement  JoblistLink;

    @FindBy(xpath = "//a[normalize-space()='Exception Logs']")
    public WebElement  ExceptionLogsLink;

    @FindBy(xpath = "//a[normalize-space()='Page Sections']")
    public WebElement  PageSectionsLink;

    @FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[4]/ul/li[7]/a")
    public WebElement  PrintPDFLink;

    @FindBy(xpath = "//a[normalize-space()='PDF Sections']")
    public WebElement  PDFSectionsLink;

    @FindBy(xpath = "//a[normalize-space()='Import']")
    public WebElement  ImportLink;

    @FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[4]/ul/li[10]/a")
    public WebElement  ExportJobsLink;

    @FindBy(xpath = "//a[normalize-space()='Export Sections']")
    public WebElement  ExportSectionsLink;

    @FindBy(xpath = "//a[normalize-space()='Mass Approve Jobs']")
    public WebElement  MassApproveJobsLink;

    @FindBy(xpath = "//a[normalize-space()='Import & Export']")
    public WebElement  ImportExportLink;

    @FindBy(xpath = "//a[normalize-space()='Template Assignment']")
    public WebElement  TemplateAssignmentLink;

    @FindBy(xpath = "//span[normalize-space()='Sections']")
    public WebElement  SectionsLink;
    @FindBy(xpath = "//a[normalize-space()='Job Information']")
    public WebElement  JobInformationLink;

    @FindBy(xpath = "//a[normalize-space()='General Sections']")
    public WebElement  GeneralSectionsLink;
    @FindBy(xpath = "//a[normalize-space()='Education Sections']")
    public WebElement  EducationSectionsLink;
    @FindBy(xpath = "//a[normalize-space()='Competencies Sections']")
    public WebElement  CompetenciesSectionsLink;

    @FindBy(xpath = "//a[normalize-space()='Search Competencies']")
    public WebElement  SearchCompetenciesLink;

    @FindBy(xpath = "//a[normalize-space()='Competency Library']")
    public WebElement  CompetencyLibraryLink;

    @FindBy(xpath = "//a[normalize-space()='Competency Groups']")
    public WebElement  CompetencyGroupsLink;

    @FindBy(xpath = "//a[normalize-space()='General Settings']")
    public WebElement  GeneralSettingsLink;

    @FindBy(id = "tabAllJobs")
    public WebElement  AllJobsLink;

    @FindBy(id = "tabMyJobs")
    public WebElement  MyJobsLink;

    @FindBy(id = "tabReViewJobs")
    public WebElement  ReadyforReviewLink;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div/ul/li[5]/a")
    public WebElement  CreateJobLink;

    //@FindBy(xpath ="//*[@id=\"GridPannelBody\"]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[2]/td/a")
    @FindBy(linkText ="Base Job")
    public WebElement  JobLink;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/a[2]")
    public WebElement  PrintPreviewLink;

    @FindBy(id = "Approved")
    public WebElement  ApprovedLink;

    @FindBy(xpath = "//*[@id=\"In Progress\"]")
    public WebElement  InProgressLink;

    @FindBy(id = "Draft")
    public WebElement  DraftdLink;

    @FindBy(xpath = "//img[@alt='logo']")
    public WebElement  HomeLink;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/ul/li[1]/a")
    public WebElement  JobInformationSectionsLink;

    @FindBy(xpath= "/html/body/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/ul/li[2]/a")
    public WebElement  JobRequirementSectionsLink;

    @FindBy(xpath= "/html/body/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/ul/li[3]/a")
    public WebElement  JobAttachmentsLink;

    @FindBy(xpath= "//*[@id=\"_MenuItemSection\"]/div[1]/div/div[2]/div[1]/a")
    public WebElement  DownloadPrintPDFLink;

    @FindBy(xpath= "//*[@id=\"_MenuItemSection\"]/div[1]/div/div[2]/div[2]/a")
    public WebElement  PrintwordLink;

    @FindBy(xpath= "//div[contains(@class,'span3')]//div[3]//a[1]")
    public WebElement  EmailJobLink;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/a[1]")
    public WebElement  EditLink;

    @FindBy(id = "jobsec-4773-tion")
    public WebElement  PositionInformationLink;

    @FindBy(id = "jobsec-4775-tion")
    public WebElement  AbouttheJobSummaryLink;

    @FindBy(id = "jobsec-4953-tion")
    public WebElement  AbouttheJobEssentialResponsibilitiesLink;

    @FindBy(id = "jobsec-4785-tion")
    public WebElement  AbouttheJobSkillsAbilitiesLink;

    @FindBy(id= "jobsec-4780-tion")
    public WebElement  AboutYouExperienceLink;

    @FindBy(id = "jobsec-4779-tion")
    public WebElement  AboutYouEducationLink;

    @FindBy(id = "jobsec-4783-tion")
    public WebElement  AboutYouCertificationsLink;

    @FindBy(id = "tabPublishedJobs")
    public WebElement  PublishedJobsLink;

    @FindBy(xpath= "//*[@id=\"GridPannelBody\"]/div[5]/div/div[2]/div[2]/div[3]/div[2]/div/div/div[3]/div[3]/td/a/p")
    public WebElement  CMSJobLink;

    @FindBy(xpath= "//a[normalize-space()='Email Setup']")
    public WebElement  EmailSetupLink;

    @FindBy(xpath= "//a[normalize-space()='Data Migration']")
    public WebElement  DataMigrationLink;




}
