package Selenium37_Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class javaPro_13 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/// Alert method
//		driver.findElement(By.id("alert1")).click();
//		Alert alert = driver.switchTo().alert();
//		String alertmsg = alert.getText();
//		System.out.println(alertmsg);
//		Thread.sleep(5000);
//		alert.accept();
//		driver.close();
		
		// Handling drop-down and Multi-Selection
//		driver.findElement(By.id("drop1")).sendKeys("doc 3");
//		
//		WebElement dropdownField = driver.findElement(By.id("drop1"));
//		Select select = new Select(dropdownField);
		
		
//		select.selectByVisibleText("doc 3");   // instead of sendKeys()
//		select.selectByIndex(3);   // instead of sendKeys()
//		select.deselectByVisibleText("doc3");
		
		
		//  Handling drop-down and Multi-Selection
		
		WebElement multiSelField = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelField);
//		select.selectByIndex(3);
//		select.selectByIndex(0);
		// instead of the above two lines
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		Thread.sleep(5000);
		select.deselectByVisibleText("Volvo");   // delete the selecting text
		System.out.println("------------------------------------");

	}
}
