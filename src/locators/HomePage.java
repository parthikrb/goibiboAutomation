/**
 * 
 */
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author parthiban.baskar
 *
 */
public class HomePage {

	static WebElement element = null;

	public static WebElement Flights(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='header']/div[1]/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement Hotels(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='header']/div[1]/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement Bus(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='header']/div[1]/ul/li[4]/a"));
		return element;
	}
	
	public static WebElement Trains(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='header']/div[1]/ul/li[5]/a"));
		return element;
	}

}
