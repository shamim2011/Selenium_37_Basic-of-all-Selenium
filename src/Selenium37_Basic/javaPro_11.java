package Selenium37_Basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaPro_11 {

	public static void main(String[] args) {
		try {
			WebDriver driver= new ChromeDriver();
			driver.get("https://iamsandesh23.github.io/selenium.github.io/");
			driver.manage().window().maximize();
			
			// getWindowHandles() - Handling the multiple windows
			driver.findElement(By.linkText("Open a popup window")).click();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itr = windows.iterator();
			
			// switchTo()
			System.out.println("------------------------------------");
			String mainWin = itr.next();
			String childWin = itr.next();
			driver.switchTo().window(childWin);
			Thread.sleep(5000);
			driver.switchTo().window(mainWin);
			Thread.sleep(5000);
//			String text = driver.findElement(By.xpath("//body/h2")).getText();        // Error
//			System.out.println(text);
			driver.quit();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
