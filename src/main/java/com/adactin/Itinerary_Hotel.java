package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary_Hotel {
	private WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement my_itinerary;

	public Itinerary_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
}
