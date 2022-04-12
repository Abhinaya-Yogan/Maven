package second;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Prac_Maven.Pojo_Class;

import first.Base;

public class Runner extends Base{
	public static WebDriver driver=browser_Launch();
public static void main(String[] args) throws InterruptedException {
	url("https://adactinhotelapp.com/");
	Pojo_Class p=new Pojo_Class(driver);
	sendkeys("Abhinaya", p.getUsername());
	sendkeys("abhinaya", p.getPassword());
	click(p.getLogin());
	drop_Down(p.getLocation(), "text", "Paris");
	drop_Down(p.getHotels(), "text", "Hotel Sunshine");
	drop_Down(p.getRoom_type(), "text", "Deluxe");
	drop_Down(p.getRoom_nos(), "text", "2 - Two");
	clear_Text(p.getDatepick_in());
	sendkeys("10/04/2022", p.getDatepick_in());
	clear_Text(p.getdatepick_out());
	sendkeys("12/04/2022", p.getdatepick_out());
	drop_Down(p.getadult_room(), "text", "3 - Three");
	click(p.getSubmit());
	check_Box(p.getradiobutton_0());
	click(p.getcon());
	sendkeys("Abhinaya", p.getFirst_name());
	sendkeys("Abhi", p.getLast_name());
	sendkeys("213 Derrick Street Boston, MA 02130 USA", p.getAddress());
	sendkeys("1234567891234567", p.getCc_num());
	drop_Down(p.getcc_type(), "text", "Master Card");
	drop_Down(p.getcc_exp_month(), "text", "June");
	drop_Down(p.getcc_exp_year(), "text", "2022");
	sendkeys("1234", p.getcc_cvv());
	click(p.getbook_now());
	click(p.getmy_itinerary());
}
}