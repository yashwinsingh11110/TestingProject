package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import contex.TestContext;

public class SignupPage {
    
    private WebDriver browser;

    @FindBy(css = "[data-qa='signup-name']")
    private WebElement signupNameInput;

    @FindBy(css = "[data-qa='signup-email']")
    private WebElement signupEmailInput;

    @FindBy(css = "[data-qa='signup-button']")
    private WebElement signupButton;
    
    public SignupPage(TestContext context){
        browser = context.getDriver();
        PageFactory.initElements(browser, this);
    }

    public void fillingCredentials(String name, String email){

        signupNameInput.sendKeys(name);
        signupEmailInput.sendKeys(email);
    }

    public void clickingSingupButton(){
        signupButton.click();
    }
}
