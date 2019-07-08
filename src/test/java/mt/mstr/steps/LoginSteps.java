package mt.mstr.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mt.mstr.Config.Config;

public class LoginSteps 
{
	@When ("^user opens \"(.*)\" browser$")
	public void openBrowser(String browsernm)
		{
			if(browsernm.equalsIgnoreCase("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","E:\\soft\\chromedriver.exe");
			Config.driver=new ChromeDriver();
			System.out.println("Chrome Browser open SucessFully");	
			}
	        else if(browsernm.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver","E:\\soft\\IEDriverServer.exe");
				Config.driver=new InternetExplorerDriver();
				System.out.println("IE Browser open SucessFully");
		     }
	         else
	         {
	        	 System.setProperty("webdriver.gecko.driver","E:\\soft\\geckodriver.exe");
	        	 Config.driver=new InternetExplorerDriver();
				System.out.println("IE Browser open SucessFully");	
	         }
		
	   }
	
	   @And ("^user enters application url as \"(.*)\"$")
       public void enterApplicatinUrl(String url)
       {
    	   Config.driver.get(url);
    	   
       }
	   
	   @And ("^user waits \"(.*)\" second to load login page$")
       public void waittillLoginPageLoaded(int timeoutseconds)
       {
    	   Config.driver.manage().timeouts().pageLoadTimeout(timeoutseconds, TimeUnit.SECONDS);
    	   
       }
	   @And ("user maximize browser$")
       public void maximizeBrowser()
       {
    	   Config.driver.manage().window().maximize();
       }
	   
	   @Then ("^user is on login page$")
       public void verifyLoginPageTitle()
       {
    	   String Title=Config.driver.getTitle();
    	   System.out.println("Title of the login page is "+Title);
       }
       
	   @Given ("^User is on login page of mercury tours application$")
       public void verifyLoginPage()
       {
    	   String url=Config.driver.getCurrentUrl();
    	   System.out.println("The Current url of the page is"+url);
       }
       
	   @When ("^User enters \"(.*)\" as username$")
       public void enterUserName(String username)
       {
    	   Config.driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
    	   
       }
       
	   @And ("^User enters \"(.*)\" as password$")
       public void enterPassword(String password)
       {
    	   Config.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);   
       }
	   
	   @And ("^User clicks on Sign In button$")
       public void clickonSignIn()
       {
    	   Config.driver.findElement(By.xpath("//input[@name='login']")).click();
       }
	   
	   @Then ("^User is on Flight Finder page$")
       public void verifyFlightFinder()
       {
    	   boolean act_flag1= Config.driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
    	   System.out.println("Flight Finder image is displayed");
    		  	  
       }
	   @When ("^User clicks on Sign Off link$")
       public void clickonSignOff()
       {
    	   Config.driver.findElement(By.linkText("SIGN-OFF")).click();
       }
	
	   @Then ("^User access Sign on page$")
       public void verifySignonpage()
   	   {
   		boolean act_flag3=Config.driver.findElement(By.xpath("//img[@src='/images/masts/mast_signon.gif']")).isDisplayed();
   		if(act_flag3==true)
   		{
   			System.out.println("User is on Sign on page");
   		}
   	}
   	
}
