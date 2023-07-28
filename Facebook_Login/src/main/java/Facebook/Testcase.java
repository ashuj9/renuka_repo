package Facebook;

public class Testcase extends Driver
{
	
	public void testcase_one()throws Exception
	{
		Driver.WebDriver();
	}
	
	public void testcase_two() throws Exception
	{
		   Login.username_enter("7993169534");
		   Login.password_enter("Renu@ammu123");
		   Validation.enter_username("7993169534");
		   Validation.enter_password("Renu@ammu123");
		   Login.login_click();
		  
	}
	
	

}
