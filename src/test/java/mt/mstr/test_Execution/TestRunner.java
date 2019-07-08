package mt.mstr.test_Execution;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"preety","html:target/htmlreport","html:target/Cucumberreport"}
,features={"src\\test\\resouces\\feature\\collection"}
,glue={"mt.mstr.steps"}
,tags={"@SmokeTest"})
public class TestRunner 
{
	

}



/*
#Author:Rupali Khule
#Feature:Login feature
#Date:30/06/2019
Feature: Login feature
         User wants to login into Mercury Tours Application
Starting ChromeDriver 74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}) on port 48383
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
[1561997714.888][WARNING]: This version of ChromeDriver has not been tested with Chrome version 75.
Jul 01, 2019 9:45:16 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Chrome Browser open SucessFully
Title of the login page is Welcome: Mercury Tours

  Background: User access login page of mercury tours application                       # E:/selnium/MV_Cucumber_Project_TestRunner_Valid_Invalid_Data/src/test/resouces/feature/collection/Valid_Invalid.feature:6
    When user opens "chrome" browser                                                    # LoginSteps.openBrowser(String)
    And user enters application url as "http://newtours.demoaut.com/mercurywelcome.php" # LoginSteps.enterApplicatinUrl(String)
    And user waits "15" second to load login page                                       # LoginSteps.waittillLoginPageLoaded(int)
    And user maximize browser                                                           # LoginSteps.maximizeBrowser()
    Then user is on login page                                                          # LoginSteps.verifyLoginPageTitle()
The Current url of the page ishttp://newtours.demoaut.com/mercurywelcome.php
Flight Finder image is displayed
User is on Sign on page

  @SmokeTest
  Scenario: Verify that valid user able to login into Mercury Tours application # E:/selnium/MV_Cucumber_Project_TestRunner_Valid_Invalid_Data/src/test/resouces/feature/collection/Valid_Invalid.feature:13
    Given User is on login page of mercury tours application                    # LoginSteps.verifyLoginPage()
    When User enters "Suvidyap1" as username                                    # LoginSteps.enterUserName(String)
    And User enters "P@ssword1" as password                                     # LoginSteps.enterPassword(String)
    And User clicks on Sign In button                                           # LoginSteps.clickonSignIn()
    Then User is on Flight Finder page                                          # LoginSteps.verifyFlightFinder()
    When User clicks on Sign Off link                                           # LoginSteps.clickonSignOff()
    Then User access Sign on page                                               # LoginSteps.verifySignonpage()
Starting ChromeDriver 74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}) on port 34098
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
[1561997726.959][WARNING]: This version of ChromeDriver has not been tested with Chrome version 75.
Chrome Browser open SucessFully
Jul 01, 2019 9:45:28 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Title of the login page is Welcome: Mercury Tours

  Background: User access login page of mercury tours application                       # E:/selnium/MV_Cucumber_Project_TestRunner_Valid_Invalid_Data/src/test/resouces/feature/collection/Valid_Invalid.feature:6
    When user opens "chrome" browser                                                    # LoginSteps.openBrowser(String)
    And user enters application url as "http://newtours.demoaut.com/mercurywelcome.php" # LoginSteps.enterApplicatinUrl(String)
    And user waits "15" second to load login page                                       # LoginSteps.waittillLoginPageLoaded(int)
    And user maximize browser                                                           # LoginSteps.maximizeBrowser()
    Then user is on login page                                                          # LoginSteps.verifyLoginPageTitle()
The Current url of the page ishttp://newtours.demoaut.com/mercurywelcome.php
User is on Sign on page

  @SmokeTest
  Scenario: Verify that invalid user not able to login into Mercury Tours application by using username in the form of digits and password # E:/selnium/MV_Cucumber_Project_TestRunner_Valid_Invalid_Data/src/test/resouces/feature/collection/Valid_Invalid.feature:23
    Given User is on login page of mercury tours application                                                                               # LoginSteps.verifyLoginPage()
    When User enters "123456" as username                                                                                                  # LoginSteps.enterUserName(String)
    And User enters "P@ssword" as password                                                                                                 # LoginSteps.enterPassword(String)
    And User clicks on Sign In button                                                                                                      # LoginSteps.clickonSignIn()
    Then User access Sign on page                                                                                                          # LoginSteps.verifySignonpage()
Starting ChromeDriver 74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}) on port 27433
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
[1561997739.990][WARNING]: This version of ChromeDriver has not been tested with Chrome version 75.
Jul 01, 2019 9:45:41 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Chrome Browser open SucessFully
Title of the login page is Welcome: Mercury Tours

  Background: User access login page of mercury tours application                       # E:/selnium/MV_Cucumber_Project_TestRunner_Valid_Invalid_Data/src/test/resouces/feature/collection/Valid_Invalid.feature:6
    When user opens "chrome" browser                                                    # LoginSteps.openBrowser(String)
    And user enters application url as "http://newtours.demoaut.com/mercurywelcome.php" # LoginSteps.enterApplicatinUrl(String)
    And user waits "15" second to load login page                                       # LoginSteps.waittillLoginPageLoaded(int)
    And user maximize browser                                                           # LoginSteps.maximizeBrowser()
    Then user is on login page                                                          # LoginSteps.verifyLoginPageTitle()
The Current url of the page ishttp://newtours.demoaut.com/mercurywelcome.php
User is on Sign on page

  @SmokeTest
  Scenario: Verify that invalid user not able to login into Mercury Tours application by using username in the form of special characters and password # E:/selnium/MV_Cucumber_Project_TestRunner_Valid_Invalid_Data/src/test/resouces/feature/collection/Valid_Invalid.feature:32
    Given User is on login page of mercury tours application                                                                                           # LoginSteps.verifyLoginPage()
    When User enters "#$#$%$" as username                                                                                                              # LoginSteps.enterUserName(String)
    And User enters "P@ssword" as password                                                                                                             # LoginSteps.enterPassword(String)
    And User clicks on Sign In button                                                                                                                  # LoginSteps.clickonSignIn()
    Then User access Sign on page                                                                                                                      # LoginSteps.verifySignonpage()

3 Scenarios (3 passed)
32 Steps (32 passed)
0m38.322s


*/