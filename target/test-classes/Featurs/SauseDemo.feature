@regression @login_test

Feature: sauce Demo Functionalities
         This is automate sauce demo functionalities
         
  
  # go to website 
  #type username and password
	#click signin
	#verify logged in successfully
	
	Background: 
	Given user is on the login page
	
	
	
	@smoke_tests @valid_login @MCA-32
  Scenario: sauce demo valid login
 # Given user is on the login page
  When user inter a valid username and valid password 
  And user clicks on signin button 
  Then user logged successfuly 





@invalid_user_login
Scenario: sauce demo invalid username login
#Given user is on the login page
When user inters invalid username and valid password
And user clicks on signin button
Then user should not be logged in

@invalid_password_login
Scenario: sauce demo valid user with invalid password 

When user inters valid username and invalid password
And user clicks on signin button
Then user should not be logged in






#different format of defining scenario as a user 
Scenario:  as a user i should be able to login with valid cred

When i enter a valid username and valid password 
And user clicks on signin button 
Then user logged successfuly 

 
 
 
 
 
 
 # this scenario outline test runs as many time as the row of data in the example table
    @outline
    Scenario Outline: Invalid login tests
  #  Given user is on the login page
    When user enters username "<username>" and password "<password>"
    And user clicks on signin button 
    Then user should not be logged in
    
    Examples:
    |    username       |      password    |
    |   hellohello      |     secret_sauce |
    |   standard_user   |     hjkhsdhgffsv |
    |                   |     secret_sauce |
    |   standard_user   |                  |
    |                   |                  |
 
 
 #############################################################################
 

 @invalid_login_parametrize
Scenario: sauce demo invalid username login
#Given user is on the login page
When user inters invalid username "username" and invalid password "password"
And user clicks on signin button
Then user should not be logged in with and messege as "Epic sadface: Username and password do not match any user in this service"
 
 
 #maybe write "hellllo" rather than "username"
 
 
 
 
 
 
 
 
 
 
 
 
 
        