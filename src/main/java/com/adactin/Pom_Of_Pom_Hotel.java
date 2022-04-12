package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom_Of_Pom_Hotel {
private WebDriver driver;

private Login_Hotel l;
private Homepage_Hotel h;
private Continue_Hotel c;
private Booknow_Hotel b;
private Itinerary_Hotel i;

public Pom_Of_Pom_Hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
public WebDriver getDriver() {
	return driver;
}
public Login_Hotel getL() {
	l=new Login_Hotel(driver);
	return l;
}
public Homepage_Hotel getH() {
	h=new Homepage_Hotel(driver);
	return h;
}
public Continue_Hotel getC() {
	c=new Continue_Hotel(driver);
	return c;
}
public Booknow_Hotel getB() {
	b=new Booknow_Hotel(driver);
	return b;
}
public Itinerary_Hotel getI() {
	i=new Itinerary_Hotel(driver);
	return i;
}
}