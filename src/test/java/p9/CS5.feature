Feature: SignUp
 @uat
 Scenario: NewUser SignUp
 Given user navigates to URL
 And enters "Lalitha" and 123
 When user click on signup button
 Then the welcome page is displayed
 
 @unit
 Scenario: Login existing user
  Given user enters user name
  And user enters password
  When user clicks on login button
  Then homepage is displayed
   