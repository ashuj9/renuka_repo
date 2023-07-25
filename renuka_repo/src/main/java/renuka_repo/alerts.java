package renuka_repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws Exception
	{
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().window().maximize();
		d.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		// Alert box
		String alertText = d.findElement(By.xpath("//button[@id='alertBox']")).getText();
		System.out.println(alertText);
		d.findElement(By.xpath("//button[@id='alertBox']")).click();
		String alertText2 = d.switchTo().alert().getText();
		System.out.println(alertText2);
		d.switchTo().alert().accept();

		// Confirm box

		d.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		String confirmText = d.switchTo().alert().getText();
		System.out.println(confirmText);
		d.switchTo().alert().dismiss();
		System.out.println(d.findElement(By.xpath("//div[@id='output']")).getText());
		
	
	
	
	
	
	
	
	
		

	}

}
