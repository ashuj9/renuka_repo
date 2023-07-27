package Playwright_Scripts;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class screenshot {

	public static void main(String[] args) {
	Playwright p=Playwright.create();
	Browser b=p.chromium().launch(new LaunchOptions());
	Page pg=b.newPage();
	pg.navigate("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN826G91647&p=google+search");
	//page
	pg.screenshot(new ScreenshotOptions().setPath( Paths.get("C:\\Users\\guggi\\OneDrive\\Pictures\\Screenshots.png")));
	//full page
 // pg.screenshot(new ScreenshotOptions().setPath( Paths.get("C:\\Users\\guggi\\OneDrive\\Pictures\\Screenshots.png"))).setFullPage(true);
  //Locator
  pg.locator("//*[text()='Yahoo India']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("screenshot.png")));

	}

}
