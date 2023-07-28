package Fb_tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Driver1
{
	
	 static By usrnam=By.xpath("//*[@id='email']");
	 static By passwd=By.xpath("//*[@type='password']");
	 static By login_xpath=By.xpath("//*[@type='submit']");
	 static By logo_xpath=By.xpath("//*[@class='fb_logo _8ilh img']");
     static By homepage_xpath=By.xpath("(//*[@class='xe3v8dz'])[1]");
     
	 public static WebElement username()
	 {
	 WebElement username=d.findElement(usrnam);
	 return username;
	 }
	 public static WebElement password()
	 {
	 WebElement password=d.findElement(passwd);
	 return password;
	 }
	 public static WebElement login()
	 {
	 WebElement login=d.findElement(login_xpath);
	 return login;
	 }
	 public static WebElement logo()
	 {
		WebElement logo=d.findElement(logo_xpath);
		return logo;
	 }
	 public static void  username_enter(String username)
	 {
		
		 username().click();
		 username().sendKeys(username);
		 
		 
	 }
	 public static void  password_enter(String password)
	 {
		 password().click();
		 password().sendKeys(password);
	 }
	 public static void  login_click()
	 {
		 
		 login().click();
		 
	 }public static WebElement homepage()
	 {
		 WebElement dashboard=d.findElement(homepage_xpath);
		 return dashboard;
	 }
	 
	
	

	
	
	
	

}
