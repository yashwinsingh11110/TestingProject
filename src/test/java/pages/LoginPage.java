package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import contex.TestContext;

public class LoginPage {
    private WebDriver browser;

    @FindBy(css = "[data-qa='login-email']")
    private WebElement loginEmailInput;

    @FindBy(css = "[data-qa='login-password']")
    private WebElement loginPasswordInput;

    @FindBy(css = "[data-qa='login-button']")
    private WebElement loginButton;
    
    public LoginPage(TestContext context){

        browser = context.getDriver();
        PageFactory.initElements(browser, this);
        
    }
    
    public void fillingCredentials(String email, String pass){

        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(pass);

    }

    public void clickingSingupButton(){

        loginButton.click();

    }
    
    public void verifyingLoggedInDashboard(){

        Assert.assertTrue(browser.findElement(By.cssSelector("a[href='/delete_account']")).isDisplayed());
        browser.findElement(By.cssSelector("a[href='/delete_account']")).click();

    }
}
