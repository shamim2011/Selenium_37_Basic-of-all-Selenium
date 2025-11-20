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
//			WebElement link = driver.findElement(By.linkText("onlytestingblog"));
//			link.click(); 
			
			// Clear method
			Thread.sleep(5000);
			driver.findElement(By.id("textbox1")).clear();
			
			// For getting the text like any line
			Thread.sleep(5000);
			String str = driver.findElement(By.id("pah")).getText();
			System.out.println(str);
			
			// getTitle method which will return title of the page
			Thread.sleep(5000);
			String title = driver.getTitle();
			System.out.println(title);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
