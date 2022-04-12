package com.Prac_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_Class {
	private WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(id="datepick_in")
	private WebElement datepick_in;
	
	@FindBy(id="datepick_out")
	private WebElement datepick_out;
	
	@FindBy(id="adult_room")
	private WebElement adult_room;
	
	@FindBy(id="Submit")
	private WebElement Submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id="continue")
	private WebElement con;
	
	@FindBy(id="first_name")
	private WebElement first_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cc_num;
	
	@FindBy(id="cc_type")
	private WebElement cc_type;
	
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	
	@FindBy(id="book_now")
	private WebElement book_now;
	
	@FindBy(id="my_itinerary")
	private WebElement my_itinerary;
	
	public Pojo_Class(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}
	
	public WebElement getdatepick_out() {
		return datepick_out;
	}
	
	public WebElement getadult_room() {
		return adult_room;		
	}
	
	public WebElement getSubmit() {
		return Submit;		
	}
	
	public WebElement getradiobutton_0() {
		return radiobutton_0;
	}
	
	public WebElement getcon() {
		return con;
	}
	
	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}
	
	public WebElement getcc_type() {
		return cc_type;
	}
	
	public WebElement getcc_exp_month() {
		return cc_exp_month;
	}
	
	public WebElement getcc_exp_year() {
		return cc_exp_year;
	}
	
	public WebElement getcc_cvv() {
		return cc_cvv;
	}
	
	public WebElement getbook_now() {
		return book_now;
	}
	
	public WebElement getmy_itinerary() {
		return my_itinerary;
	}
}