package Selenium37_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaPro_04 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
	}
}
