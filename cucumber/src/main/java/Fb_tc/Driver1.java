package Fb_tc;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver1 {

	public static WebDriver d;
//	public static void main(String[] args) {
//		WebDriver();
//		
//	}
	public static void WebDriver()
	{
    d=new ChromeDriver();
    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    d.get("https://www.facebook.com/");
    d.manage().window().maximize();
    
	 
}
	}


