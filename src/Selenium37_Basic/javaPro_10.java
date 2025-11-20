package Selenium37_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaPro_10 {
	public static void main(String[] args) {
		try {
			WebDriver driver= new ChromeDriver();
			driver.get("https://iamsandesh23.github.io/selenium.github.io/");
			driver.manage().window().maximize();
			
			// getCurrent URL - 10
			String attribute = driver.findElement(By.xpath("//*[@id='sidebar-right-1']/descendant::img")).getAttribute("width");
			System.out.println(attribute);
			
			// isDisplayed()
			boolean b = driver.findElement(By.id("but2")).isDisplayed();
			System.out.println(b); // return true if present
			boolean c = driver.findElement(By.id("hbutton")).isDisplayed();
			System.out.println(c); // return true if present
			System.out.println("------------------------------------");
			
			// isEnabled() method
			boolean e = driver.findElement(By.id("but2")).isEnabled();
			System.out.println(e); // return true if present
			boolean f = driver.findElement(By.id("but1")).isEnabled();
			System.out.println(f); // return false if not-present
			System.out.println("------------------------------------");
			
			// isSelected() method
			boolean s = driver.findElement(By.id("radio2")).isSelected();
			System.out.println(s); // return true if present
			boolean t = driver.findElement(By.id("checkbox1")).isSelected();
			System.out.println(t); // return false if not-present
			System.out.println("------------------------------------");
			
			// isSelected() method
			driver.findElement(By.linkText("onlytestingblog")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			driver.navigate().forward();
			// fullScreen() method
			driver.manage().window().fullscreen();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
