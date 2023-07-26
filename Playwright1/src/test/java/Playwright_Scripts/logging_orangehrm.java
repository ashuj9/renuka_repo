package Playwright_Scripts;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class logging_orangehrm {

	public static void main(String[] args) {

		Playwright pl=Playwright.create();
		Browser b= pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg=b.newPage();
		pg.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Locator user=pg.locator("//input[@name='username']");
		user.type("Admin");
		Locator pass=pg.locator("//input[@name='password']");
		pass.type("admin123");
		Locator login=pg.locator("//button[@type='submit']");
		login.click();
		


	}

}
