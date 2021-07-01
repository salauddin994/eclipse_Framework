Feature: SignUp

@Parameters
  Scenario Outline: Signup with valid info
    Given User on saksfifth avenue homepage
    And Hover over signIn button and click on creat an account link
    And I fillout the form using Valid information
    And Verify Are you canadian customer radio button by defult NO
    And Click on saks fifth ave radio button 
    And Click on Create Account button 
    
  