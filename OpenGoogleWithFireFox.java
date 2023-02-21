package Selenium;

import org.openqa.selenium.WebDriver;

public class OpenGoogleWithFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("name", "location");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
	}

}
