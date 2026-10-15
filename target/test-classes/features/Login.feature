Feature: Login a user account
    Scenario: Validate login a user with valid credentials successfully
        Given Navigate to this URL"https://automationexercise.com/"
        And Go to Login page
        When Enter email "y4l8os1izx@yzcalo.com" and password "pass12"
        Then Click on the Login button
        And Should see User's Name