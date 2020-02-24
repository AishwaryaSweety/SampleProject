Feature: Login me into Testme app

Scenario Outline: Successfull login
 Given user is on the login page
 When user enters "<username>" and "<password>" and clicks submit button
 Then user does successful login
 
 Examples:
 |username| password   |
 |Lalitha | Password123|