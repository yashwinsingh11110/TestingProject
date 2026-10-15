Feature: Create a user account
    Scenario: Register a new user successfully
        Given Navigate to the URL"https://automationexercise.com/"
        And Go to Signup/Login page
        When Enter my name "User Testing" and email "y4l8os1izx@yzcalo.com"
        And Click the Signup button
        When Should see the account registration form
        Then Fill Password "pass12" and First Name "User" and Last Name "Test"
        And Address "India" and State "UP" and City "Mirzapur" and ZIP code "123456"
        And Mobile Number "9087654321"
        And Click on Create Account button
        Then Should see a Logged in Dashboard
        