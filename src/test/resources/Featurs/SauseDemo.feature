Feature: sauce Demo Functionalities
         This is automate sauce demo functionalities
         
  
  # go to website 
  #type username and password
	#click signin
	#verify logged in successfully
	
Scenario: sauce demo valid login
Given user is on the login page
When user inter a valid username and valid password 
And user clicks on signin button 
Then user logged successfuly 
 
        