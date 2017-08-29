package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusBookingPage {
	static WebElement element = null;

	public static WebElement noOfWaysRadioBtn(WebDriver driver) {
		element = driver.findElement(By.id("gi_search"));
		return element;
	}

	public static WebElement FromTextField(WebDriver driver) {
		element = driver.findElement(By.id("gi_source"));
		return element;
	}

	public static WebElement ToTextField(WebDriver driver) {
		element = driver.findElement(By.id("gi_destination"));
		return element;
	}

	public static WebElement DeptDatePicker(WebDriver driver) {
		element = driver.findElement(By.id("gi_onward_text"));
		return element;
	}

	public static WebElement ReturnDatePicker(WebDriver driver) {
		element = driver.findElement(By.id("gi_return_text"));
		return element;
	}
	
	public static WebElement SearchButton(WebDriver driver) {
		element = driver.findElement(By.id("gi_search_btn"));
		return element;
	}
}
