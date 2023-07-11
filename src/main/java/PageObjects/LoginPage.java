

package PageObjects;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "bt-split-screen__header")
    public WebElement loginHeaderTitle;

    @FindBy(id = "UserName")
    public WebElement emailField;

    @FindBy(id = "Password")
    public WebElement passwordTx;



    @FindBy(id = "btnlogin")
    private WebElement selanjutnyaButton;

    @FindBy(xpath = "//div[@class='bt-social-group']//button[1]")
    private WebElement loginFacebookButton;

    @FindBy(id = "btnGoogle")
    private WebElement loginGoogleButton;

    @FindBy(className = "bt-question-register")
    private WebElement registerQuestionText;

    @FindBy(xpath = "//a[@href='/register']")
    private WebElement registerLink;

    @FindBy(xpath= "//span[@class='username']")
    public WebElement  CompanyLink;

    @FindBy(xpath= "//a[normalize-space()='Log Out']")
    public WebElement  LogoutLink;

    public boolean emailLoginPageIsDisplayed() {
        loginHeaderTitle.isDisplayed();
        emailField.isDisplayed();
        selanjutnyaButton.isDisplayed();
        loginFacebookButton.isDisplayed();
        loginGoogleButton.isDisplayed();
        registerQuestionText.isDisplayed();
        registerLink.isDisplayed();
        return true;
    }

    public String getLoginHeaderTitle() {
        loginHeaderTitle.isDisplayed();
        return loginHeaderTitle.getText();
    }

    public String getQuestionRegisterText() {
        registerQuestionText.isDisplayed();
        return registerQuestionText.getText();
    }
    public void DoLogin(Boolean flag){
        if(flag == true)
            emailField.sendKeys("cms");
        else {
            emailField.sendKeys("lfg");
        }
        passwordTx.sendKeys("Calg2022!!");
        try {
            clickSelanjutnyaButton();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void fillEmailData(String email) throws InterruptedException {
        Thread.sleep(1000);
        emailField.isEnabled();
        emailField.clear();
        emailField.sendKeys(email);
        passwordTx.sendKeys(email);
    }
    public void fillPasswordData(String password) {
        passwordTx.clear();
        passwordTx.sendKeys(password);
    }

    public void clickSelanjutnyaButton() throws InterruptedException {
        Thread.sleep(2000);
        selanjutnyaButton.isEnabled();
        selanjutnyaButton.click();
        Thread.sleep(2000);
    }
}
