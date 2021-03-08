#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Functionality Test

  @Regression
  Scenario Outline: Positive Login Test data driven
	 	Given user is in homepage
	  When user provides valid "<username>" & valid "<password>" 
		And clicks submit button
		Then user should be able to login
		And login success page should get displayed

    Examples: 
      | username  | password |
      | test123 |   123 |
      #| test |     123 |
      #| tom  |   123   |
      
  @EndToEnd    
  Scenario Outline: Negative Login Test with both invalid credentials
		Given user is in homepage
		When user provides invalid "<username>" & invalid "<password>" 
		And clicks submit button
		Then user should not be able to login
		And error message saying enter correct credentials should get displayed
		
		Examples: 
      | username  | password |
      | tom12 |   12345 |
      #| john12 |     12345 |
      #| harry12  |   12345   |
