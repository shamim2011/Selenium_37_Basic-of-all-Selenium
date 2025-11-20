package Selenium37_Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaPro_04 {
	public static void main(String[] args) {
		try {
			WebDriver driver= new ChromeDriver();
			driver.get("https://iamsandesh23.github.io/selenium.github.io/");
			driver.manage().window().maximize();
//			WebElement element = driver.findElement(By.name("q"));
//			Thread.sleep(5000);
//			element.sendKeys("Kodnest");
			WebElement link = driver.findElement(By.linkText("onlytestingblog"));
			link.click(); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
