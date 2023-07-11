package Cucumber.StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;

import Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {
    LoginPage loginPage;
    HomePage homePage;

    public LoginSteps() {
        loginPage = new LoginPage();

        homePage = new HomePage();
    }


    @Then("Login page is displayed")
    public void loginPageIsDisplayed() {
        Assert.assertTrue(loginPage.emailLoginPageIsDisplayed());

        String actualLoginHeaderTitle = loginPage.getLoginHeaderTitle();
        Assert.assertEquals("Silakan masuk ke akun Anda", actualLoginHeaderTitle);

        String actualRegisterQuestionText = loginPage.getQuestionRegisterText();
        Assert.assertEquals("Belum punya akun Bhinneka? Daftar", actualRegisterQuestionText);
    }

    @When("Input {string} as email, {string} as password, {string} as account type")
    public void inputAsEmailAsPasswordAsAccountType(String email, String password, String account) {
        System.out.println("---" + email);
        System.out.println("---" + password);
        System.out.println("---" + account);
    }

    @When("Input credentials to login without headers")
    public void inputCredentialsToLoginWithoutHeaders(DataTable dataTable) throws InterruptedException {
        List<String> dataRow = dataTable.row(0);
        String email = dataRow.get(0);

        System.out.println("row index 0 --- " + email);
        loginPage.fillEmailData(email);
        System.out.println("row index 1 --- " + dataRow.get(1));
        System.out.println("row index 2 --- " + dataRow.get(2));
    }

    @When("Login to the application")
    public void loginApp(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions ac = new Actions(Driver.get());
        ac.moveToElement(loginPage.CompanyLink).perform();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginPage.LogoutLink.click();
       loginPage.DoLogin(false);


    }
    @When("Login to the application for cms")
    public void loginApplfg(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions ac = new Actions(Driver.get());
        ac.moveToElement(loginPage.CompanyLink).perform();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginPage.LogoutLink.click();

        loginPage.emailField.sendKeys("cms");
        loginPage.passwordTx.sendKeys("Calg2022!!");
        try {
            loginPage.clickSelanjutnyaButton();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    @Then("Click on All Jobs")
    public void AllJobs() throws InterruptedException {
        Thread.sleep(3000);
        homePage.AllJobsLink.click();
        Thread.sleep(3000);
    }
        @And("Click on Home")
        public void Home() throws InterruptedException {
            Thread.sleep(5000);
            homePage.HomeLink.click();

        }
    @Then("Click on My Jobs")
    public void MyJobs() throws InterruptedException {
        Thread.sleep(5000);
        homePage.MyJobsLink.click();

    }
    @Then("Click on Job")
    public void Job() throws InterruptedException {
        Thread.sleep(5000);
        homePage.JobLink.click();
    }
    @Then("Click on Published Jobs")
    public void PublishedJobs() throws InterruptedException {
        Thread.sleep(5000);
        homePage.PublishedJobsLink.click();
    }
    @Then("Click on Ready for Review")
    public void ReadyforReview() throws InterruptedException {
        Thread.sleep(5000);
        homePage.ReadyforReviewLink.click();

    }
    @Then("Click on Approved")
    public void Approved() throws InterruptedException {
        Thread.sleep(5000);
        Actions ac = new Actions(Driver.get());
        ac.moveToElement(homePage.ApprovedLink).click(homePage.ApprovedLink).build().perform();

    }

    @Then("Click on In Progress")
    public void InProgress() throws InterruptedException {
        Thread.sleep(5000);
        homePage.InProgressLink.click();

    }
    @Then("Click on Draft")
    public void Draft() throws InterruptedException {
        Thread.sleep(5000);
        homePage.DraftdLink.click();
        Thread.sleep(2000);
    }
    @Then("Click on Create Job")
    public void CreateJob() throws InterruptedException {
        Thread.sleep(5000);
        homePage.CreateJobLink.click();



    }

    @Then("Click on Print Preview")
    public void PrintPreview() throws InterruptedException {
        Thread.sleep(5000);
        homePage.PrintPreviewLink.click();
        Thread.sleep(5000);
    }

    @Then("Click on Job Information Sections")
    public void JobInformationSections() throws InterruptedException {
        Thread.sleep(5000);
        homePage.JobInformationSectionsLink.click();
        Thread.sleep(2000);
    }
    @Then("Click on Job Requirement Sections")
    public void JobRequirementSections() throws InterruptedException {
        Thread.sleep(5000);
        homePage.JobRequirementSectionsLink.click();
        Thread.sleep(2000);
    }
    @Then("Click on Job Attachments")
    public void JobAttachments() throws InterruptedException {
        Thread.sleep(5000);
        homePage.JobAttachmentsLink.click();
        Thread.sleep(2000);
    }
    @Then("Click on  DownloadPrint PDF")
    public void DownloadPrintPDF() throws InterruptedException {
        Thread.sleep(5000);
        homePage.DownloadPrintPDFLink.click();
        Thread.sleep(2000);
    }

    @Then("Click on Print Word")
    public void  Printword() throws InterruptedException {
        Thread.sleep(2000);
        homePage. PrintwordLink.click();
        Thread.sleep(2000);
    }

    @Then("Click on Email Job")
    public void  EmailJob() throws InterruptedException {
        Thread.sleep(2000);
        homePage.EmailJobLink.click();
        Thread.sleep(1000);
    }

    @Then("Click on Edit")
    public void  Edit() throws InterruptedException {
        Thread.sleep(5000);
        homePage.EditLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Position Information")
    public void  PositionInformation() throws InterruptedException {
        Thread.sleep(5000);
        homePage.PositionInformationLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on About the Job - Job Summary")
    public void  AbouttheJobSummary() throws InterruptedException {
        Thread.sleep(5000);
        homePage.AbouttheJobSummaryLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on About the Job - Essential Responsibilities")
    public void  AbouttheJobEssentialResponsibilities() throws InterruptedException {
        Thread.sleep(5000);
        homePage.AbouttheJobEssentialResponsibilitiesLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on About the Job - Skills & Abilities")
    public void  AbouttheJobSkillsAbilities() throws InterruptedException {
        Thread.sleep(5000);
        homePage.AbouttheJobSkillsAbilitiesLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on About You - Experience")
    public void  AboutYouExperience() throws InterruptedException {
        Thread.sleep(2000);
        homePage.AboutYouExperienceLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on About You - Education")
    public void  AboutYouEducation() throws InterruptedException {
        Thread.sleep(2000);
        homePage.AboutYouEducationLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on About You - Certifications")
    public void AboutYouCertifications() throws InterruptedException {
        Thread.sleep(2000);
        homePage.AboutYouCertificationsLink.click();
        Thread.sleep(2000);

    }

    @And("Click on profile icon")
    public void profileicon() throws InterruptedException {
        homePage.profileIcon.click();
        Thread.sleep(2000);
    }
    @And("Click on company profile")
    public void companyprofile() throws InterruptedException {
        homePage.companyProfile.click();
        Thread.sleep(2000);
    }
    @And("Click on manage users")
    public void manageuser() throws InterruptedException {
        homePage.manageUserLink.click();
        Thread.sleep(2000);
    }


    @And("Click on Setups")
    public void setups() throws InterruptedException {
        homePage. SetupsLink.click();
        Thread.sleep(2000);

    }

    @And("Click on Sections")
    public void Sections() throws InterruptedException {
        homePage. SectionsLink.click();
        Thread.sleep(2000);
    }
    @Then("Click on Add User")
    public void adduser() throws InterruptedException {
        homePage.adduserLink.click();
        Thread.sleep(2000);
    }
    @Then("Click on View Users")
    public void viewuser() throws InterruptedException {
        homePage.viewUsersLink.click();
        Thread.sleep(2000);
    }
    @Then("Click on Add Edit Groups")
    public void addeditgroups() throws InterruptedException {
        homePage.AddEditGroupsLink.click();
        Thread.sleep(2000);

    }
    @Then("Click on Workflows")
    public void Workflows() throws InterruptedException {
        homePage.Workflow.click();
        Thread.sleep(2000);

    }

    @Then("Click on Buttons")
    public void Buttons() throws InterruptedException {
        homePage.Buttons.click();
        Thread.sleep(2000);

    }
    @Then("Click on Job Sections")
    public void JobSections() throws InterruptedException {
        homePage.JobSectionsLink.click();
        Thread.sleep(2000);

    }
    @Then("Click on Exception Logs")
    public void ExceptionLogs() throws InterruptedException {
        homePage.ExceptionLogsLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Page Sections")
    public void PageSections() throws InterruptedException {
        homePage.PageSectionsLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Job List")
    public void JobList() throws InterruptedException {
        homePage.JoblistLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Print PDF")
    public void PrintPDF() throws InterruptedException {
        homePage.PrintPDFLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on PDF Sections")
    public void PDFSections() throws InterruptedException {
        homePage.PDFSectionsLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Import")
    public void Import() throws InterruptedException {
        homePage.ImportLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Export Jobs")
    public void ExportJobs() throws InterruptedException {
        homePage.ExportJobsLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Export Sections")
    public void ExportSections() throws InterruptedException {
        homePage.ExportSectionsLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Mass Approve Jobs")
    public void MassApproveJobs() throws InterruptedException {
        homePage.MassApproveJobsLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Import & Export")
    public void ImportExport() throws InterruptedException {
        homePage.ImportExportLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Template Assignment")
    public void TemplateAssignment() throws InterruptedException {
        homePage.TemplateAssignmentLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Job Information")
    public void JobInformation() throws InterruptedException {
        homePage.JobInformationLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on General Sections")
    public void GeneralSections() throws InterruptedException {
        homePage.GeneralSectionsLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Education Sections")
    public void EducationSections() throws InterruptedException {
        homePage.EducationSectionsLink.click();
        Thread.sleep(2000);

    }

    @Then("Click on Competencies Sections")
    public void CompetenciesSections() throws InterruptedException {
        homePage.CompetenciesSectionsLink.click();
        Thread.sleep(2000);

    }


    @Then("Click on Search Competencies")
    public void SearchCompetencies() throws InterruptedException {
        homePage.SearchCompetenciesLink.click();
        Thread.sleep(2000);

    }


    @Then("Click on General Settings")
    public void GeneralSettings() throws InterruptedException {
        homePage.GeneralSettingsLink.click();
        Thread.sleep(2000);

    }


    @Then("Click on Competency Groups")
    public void CompetencyGroups() throws InterruptedException {
        homePage.CompetencyGroupsLink.click();
        Thread.sleep(2000);


    }

    @Then("Click on CMS Job")
    public void CMSJob() throws InterruptedException {
        Thread.sleep(2000);
        homePage.CMSJobLink.click();
        Thread.sleep(2000);

    }


    @Then("Click on Data Migration")
    public void DataMigration() throws InterruptedException {
        homePage.DataMigrationLink.click();
        Thread.sleep(2000);

    }
        @Then("Click on Email Setup")
        public void EmailSetup() throws InterruptedException {
        Thread.sleep(2000);
        homePage.EmailSetupLink.click();Thread.sleep(2000);

    }


    @Then("Click on Competency Library")
    public void CompetencyLibrary() throws InterruptedException {
        homePage.CompetencyLibraryLink.click();
        Thread.sleep(2000);
    }



    }
