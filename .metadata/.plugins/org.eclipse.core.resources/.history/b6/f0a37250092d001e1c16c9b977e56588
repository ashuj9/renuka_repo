package Fb_tc;

import org.openqa.selenium.WebElement;

import orange_hrm.Driver;


public class Validation extends Driver1
{
	 
 public static void loginPage(WebElement logo) throws Exception 
		{
			if(!(logo.isDisplayed()))
			{
				throw new Exception("login page not displayed");
			}
			else
			{
				System.out.println("login page is displayed");
			}
			
		}
		public static void enter_username(String username) throws Exception
		{
			
			if(!(username.equals(Login.username().getAttribute("value"))))		{
				throw new Exception ("username  not displayed ");
			}
			else
			{
				System.out.println("username entered succefully");
			}
		}

public static void enter_password(String password) throws Exception
		{
			if(!(password.equals(Login.password().getAttribute("value"))))
			{
				throw new Exception("password not displayed");
			}
			else
			{
				System.out.println("password entered sucessfully");		}
		}
		
public static void dashboard(WebElement dashboard) throws Exception
		{
			if(!(dashboard.isDisplayed()))
			{
				throw new Exception("dashboard page not opened");
			}
			else
			{
				System.out.println("dashboard page opened sucessfully");
			}
		}

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

