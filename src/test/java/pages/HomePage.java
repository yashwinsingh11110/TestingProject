package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import contex.TestContext;

public class HomePage {
    
    private WebDriver browser;

    @FindBy(partialLinkText = "Signup / Login")
    private WebElement signupLoginButton;
    
    public HomePage(TestContext context){
        browser = context.getDriver();
        PageFactory.initElements(browser, this);
    }

    public void navigatingToTheBrowser(String url){
        browser.get(url);
    }

    public void navigatingToSignupPage(){
        signupLoginButton.click();
    }
}
