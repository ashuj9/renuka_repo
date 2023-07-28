package renuka_repo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_excecutor {

	public static void main(String[] args) {
		{
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	}

}
