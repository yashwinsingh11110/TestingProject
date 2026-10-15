package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginUser {

    private HomePage homePage;
    private LoginPage loginPage;

    public LoginUser(HomePage homePage, LoginPage loginPage){
        this.homePage = homePage;
        this.loginPage = loginPage;
    }
    
    @Given("^Navigate to this URL\"([^\"]*)\"$")
    public void navigateToBrowser(String url){
        homePage.navigatingToTheBrowser(url);
    }
    
    @And ("^Go to Login page$")
    public void goToSignupPage(){
        homePage.navigatingToSignupPage();
    }
    
    @When ("^Enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void fillCredentials(String email, String pass){
        loginPage.fillingCredentials(email, pass);
    }

    @Then ("^Click on the Login button$")
    public void clickSignupButton(){
        loginPage.clickingSingupButton();
    }

    @And ("^Should see User's Name$")
    public void verifyLoggedInDashboard(){
        loginPage.verifyingLoggedInDashboard();
    }

}
