Feature: Amazon Smoke Test - Login Page - valid case

  Background: 
    Given User open amazon site
    When User open login page

@valid
  Scenario Outline: Verify User is able to successfully login in with valid credentials to amazon page #valid credentials
    When the User enters "<username>" and "<password>"
    When the User clicks on the "Continue" button
    Then the User should be redirected to the homepage
    And the User should see a welcome message
    


    Examples: 
      | username       | password |
      |8097231050      |8097231050|
      #| john@ymail.com |   123456 |
      #| jane@gmail.com | pass@122 |
      #|     9876543210 | abcdef   |


   @invalid
  Scenario Outline: Verify User should not be logs in with invalid credentials #invalid credentials
    When the User enters invalid credentials "<username>" and "<password>"
    When the User clicks on the "Continue" button
    Then the User should see an error message "<error_message>"
    

    Examples: 
      | username       | password | error_message                                     |
      | john@gmail.com | wrong    | Your password is incorrect                        | #invalid password
      |     8097231051 | abcde    | We cannot find an account with that mobile number | #invalid username - mobile
     # | wrong@gmail.com| wrong    | We cannot find an account with that email address | #invalid username - email
     # |     8097231050 |          | Enter your password.                              | # blank password
    #  |                |   123456 | Enter your email or mobile phone number           | # blank username   
    #  |                |          | Username and password cannot be empty.            | # blank
    #  | john@gmail.com | wrong    | Incorrect username or password.                   | #invalid username & password

  Scenario Outline: User requests to reset password # Forgot Password
    When the User clicks on the "Forgot Password" link
    When the User enters their email address "<username>" either email or mobile phone number
    When the User clicks on the "Continue" button
    Then the User should receive an email with instructions to reset their password
    And the User should be redirected to the login page
   

    Examples: 
      | username       |
    #  | user@gmail.com |
      |     8097231050 |
    #  | test@yahoo.com |
    #  |     9163726762 |

  Scenario Outline: User can select "Keep me signed in" checkbox # Keep me signed in checkbox
    When the User enters "<username>" and "<password>"
    And the User selects the "Keep me signed in" checkbox
    And the User clicks on the "Sign In" button
    Then the User should be logged in
    And the User should see the "Welcome, <username>" message
    

    Examples: 
      | username       | password |
     # | john@ymail.com |   123456 |
     # | jane@gmail.com | pass@122 |
      |     8097231050 | 8097231050   |

  Scenario Outline: User can select "Change" link on Password page # Change link
    When the User enters username and navigates to password page
    And the User clicks on the "Change" link on Password page
    Then the User should be redirected to username Page
    Then the User should be able to change the "<username>"
    

    Examples: 
      | username       |
    #  | john@ymail.com |
      |     8097231050 |
     # | jane@gmail.com |
      
   Scenario Outline: User can select Get an OTP on your phone link on Password page # OTP
    When the User clicks on the "Get an OTP on your phone" link on Password page
    Then the User should be redirected to "Authentication required" Page
    Then the User gets an OTP on either email or mobile phone number
    Then the User should be able to "<Enter OTP>" 
     And the User clicks on the "Continue" button and gets navigated to Homepage
    
      Examples: 
      |Enter OTP|
      | 234564 |
    #  | 548778 |
    #  | 284628 |
     # | 898998 |
 
 
   Scenario Outline: User can select Resend OTP on your phone link on Password page # Resend OTP
    When the User clicks on the "Get an OTP on your phone" link on Password page
    Then the User should be redirected to "Authentication required" Page
    Then the User gets an OTP on either email or mobile phone number
    And if the User clicks on "Resend OTP"
    And Alert message is seen as on sent "A new OTP has been sent to your mobile number."
    Then User waits for a certain amount of time until the new OTP code is received.
    When User enters an invalid OTP code multiple times until the maximum attempts are reached.
    And Alert message is seen for user to wait "Please wait 46 second(s) before requesting a new One Time Password (OTP)."
    And Timer ends user sees a new alert message as " You can now request a new code if needed."
    Then the User should be able to "<Enter OTP>"
    And the User clicks on the "Continue" button and gets navigated to Homepage
    
 
    
