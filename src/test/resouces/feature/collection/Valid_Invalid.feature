#Author:Rupali Khule
#Feature:Login feature
#Date:30/06/2019
Feature:Login feature
         User wants to login into Mercury Tours Application
Background:User access login page of mercury tours application
            When user opens "chrome" browser
            And user enters application url as "http://newtours.demoaut.com/mercurywelcome.php"
            And user waits "15" second to load login page
            And user maximize browser
            Then user is on login page
@SmokeTest
Scenario: Verify that valid user able to login into Mercury Tours application
    Given User is on login page of mercury tours application
    When User enters "Suvidyap1" as username
    And User enters "P@ssword1" as password
    And User clicks on Sign In button
    Then User is on Flight Finder page 
    When User clicks on Sign Off link
    Then User access Sign on page
    
@SmokeTest
Scenario:Verify that invalid user not able to login into Mercury Tours application by using username in the form of digits and password
    Given User is on login page of mercury tours application
    When User enters "123456" as username
    And User enters "P@ssword" as password
    And User clicks on Sign In button
    Then User access Sign on page


@SmokeTest
Scenario:Verify that invalid user not able to login into Mercury Tours application by using username in the form of special characters and password
    Given User is on login page of mercury tours application
    When User enters "#$#$%$" as username
    And User enters "P@ssword" as password
    And User clicks on Sign In button
    Then User access Sign on page

    