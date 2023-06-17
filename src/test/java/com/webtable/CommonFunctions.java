package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {
		
	WebDriver driver = null;
	
	public CommonFunctions() {
		//TODO Auto-generated constructor stub
		System.setProperty("webDriver.chrome.driver", "./executables/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	/**
	 * <p>Navigates to specifiied url</p>
	 * @param url
	 */
	public void navigate(String url) {
		driver.get(url);
	}
	/**
	 * Clicks on provided webElement
	 * @param elem
	 */
	
	public void clickElement(WebElement elem) {
		elem.click();
	}
	/**
	 * <p>Fetches content within a webElement
	 * @param elem
	 */
	public String getElementText(WebElement elem) {
		return elem.getText();
	}
	
	public String getElementText(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public int getCount(String xpath) {
		return driver.findElements(By.xpath(xpath)).size();
	}
	
	public void closeBrowser() {
		driver.close();
		driver.quit();
		
	}
}
