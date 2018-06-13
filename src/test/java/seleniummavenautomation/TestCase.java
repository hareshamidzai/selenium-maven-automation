package seleniummavenautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hhami\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dice.com");
		
		

	}

}
