Feature: To validate the login functionality of shopee application
Scenario: To validate the login functionality with invalid credentials
Given The user should open the home page of shopee
When The user has to click the login buttton
And The user has to fill the username and password
 #  0            1
|username     |password    |
|mani      |9090        |#0
|maran      |8989        |#1
|selvapriya971|95k@matchi95|#2
Then The user should navigate to the buyer login



