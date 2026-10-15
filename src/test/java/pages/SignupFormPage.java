package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import contex.TestContext;

public class SignupFormPage {
    
    private WebDriver browser;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "[data-qa='first_name']")
    private WebElement firstNameInput;
    
    @FindBy(css = "[data-qa='last_name']")
    private WebElement lastNameInput;

    @FindBy(css = "[data-qa='address']")
    private WebElement addressInput;

    @FindBy(css = "[data-qa='state']")
    private WebElement stateInput;

    @FindBy(css = "[data-qa='city']")
    private WebElement cityInput;

    @FindBy(css = "[data-qa='zipcode']")
    private WebElement zipcodeInput;

    @FindBy(css = "[data-qa='mobile_number']")
    private WebElement mobileInput;

    @FindBy(css = "[data-qa='create-account']")
    private WebElement createButton;
    
    public SignupFormPage(TestContext context){
        browser = context.getDriver();
        PageFactory.initElements(browser, this);
    }

    public void verifyingSignupForm(){
        Assert.assertTrue(passwordInput.isDisplayed());
    }

    public void fillingPersonalInfo(String password, String firstName, String lastName){

        passwordInput.sendKeys(password);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);

    }

    public void fillingAddress(String address, String state, String city, String zipcode){

        addressInput.sendKeys(address);
        stateInput.sendKeys(state);
        cityInput.sendKeys(city);
        zipcodeInput.sendKeys(zipcode);

    }

    public void fillingMobileNumber(String mobile){

        mobileInput.sendKeys(mobile);

    }
    
    public void clickingOnCreateButton(){

        createButton.click();

    }
    
    public void verifyingDashboard(){

        Assert.assertTrue(browser.findElement(By.cssSelector("[data-qa='continue-button']")).isDisplayed());

    }

}
