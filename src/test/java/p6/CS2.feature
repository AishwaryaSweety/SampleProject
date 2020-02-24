Feature: Registering in testme app

Scenario Outline: Successfull registration
 Given user enters into Registration page
 When user enters "<username>","<firstname>","<lastname>","<password>","<confirmpassword>","<email>","<mobno>","<dob>","<address>","<answer>"
 Then user navigates to login page
 
 Examples:
 |username|firstname|lastname|password|confirmpassword|email|mobno|dob|address|answer|
 |RAshmi12345|aishwarya|s|123456|123456|aishu@gmail.com|9080706050|11/07/1998|Chennaigagaf|Briyani|