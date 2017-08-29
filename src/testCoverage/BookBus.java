package testCoverage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import resources.HomePage;

public class BookBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "Resources//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.goibibo.com");
		HomePage.Bus(driver).click();
	}

}
