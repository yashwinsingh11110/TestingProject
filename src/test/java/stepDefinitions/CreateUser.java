package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignupFormPage;
import pages.SignupPage;

public class CreateUser {

    private HomePage homePage;
    private SignupPage signupPage;
    private SignupFormPage signupFormPage;

    public CreateUser(HomePage homePage, SignupPage signupPage, SignupFormPage signupFormPage){
        this.homePage = homePage;
        this.signupPage = signupPage;
        this.signupFormPage = signupFormPage;
    }
    
    @Given("^Navigate to the URL\"([^\"]*)\"$")
    public void navigateToBrowser(String url){
        homePage.navigatingToTheBrowser(url);
    }
    
    @And ("^Go to Signup/Login page$")
    public void goToSignupPage(){
        homePage.navigatingToSignupPage();
    }
    
    @When ("^Enter my name \"([^\"]*)\" and email \"([^\"]*)\"$")
    public void fillCredentials(String name, String email){
        signupPage.fillingCredentials(name, email);
    }

    @And ("^Click the Signup button$")
    public void clickSignupButton(){
        signupPage.clickingSingupButton();
    }
    
    @When ("^Should see the account registration form$")
    public void verifySignupForm(){
        signupFormPage.verifyingSignupForm();
    }

    @Then("^Fill Password \"([^\"]*)\" and First Name \"([^\"]*)\" and Last Name \"([^\"]*)\"$")
    public void fillPersonalInfo(String password, String firstName, String lastName){
        signupFormPage.fillingPersonalInfo(password, firstName, lastName);
    }

    @And("^Address \"([^\"]*)\" and State \"([^\"]*)\" and City \"([^\"]*)\" and ZIP code \"([^\"]*)\"$")
    public void fillAddress(String address, String state, String city, String zipcode){
        signupFormPage.fillingAddress(address, state, city, zipcode);
    }

    @And("^Mobile Number \"([^\"]*)\"$")
    public void fillMobileNumber(String mobile){
        signupFormPage.fillingMobileNumber(mobile);
    }

    @And("^Click on Create Account button$")
    public void clickCreateButton(){
        signupFormPage.clickingOnCreateButton();
    }

    @Then("^Should see a Logged in Dashboard$")
    public void verifyDashboard(){
        signupFormPage.verifyingDashboard();
    }
}
