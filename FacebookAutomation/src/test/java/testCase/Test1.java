package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.LoginPage;

public class Test1 {
public static void main(String[] args)  {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	
	
	
	
	//1st Test case
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	LoginPage lp = new LoginPage(driver);
	lp.sendUsername();
	lp.sendPassword();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	lp.clickOnLoginButton();
	
	
}
}
