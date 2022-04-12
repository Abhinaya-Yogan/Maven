package second;

import org.openqa.selenium.WebDriver;


import first.Base;
import com.Prac_Maven.Pojo_Class;
import com.adactin.Pom_Of_Pom_Hotel;

public class Run_Pom_Of_Pom extends Base{
	public static WebDriver driver=browser_Launch();
	public static void main(String[] args) {
		url("https://adactinhotelapp.com/");
		Pom_Of_Pom_Hotel p=new Pom_Of_Pom_Hotel(driver);
		sendkeys("Abhinaya", p.getL().getUsername());
		sendkeys("abhinaya", p.getL().getPassword());
		click(p.getL().getLogin());
		drop_Down(p.getH().getLocation(), "text", "Paris");
		drop_Down(p.getH().getHotels(), "text", "Hotel Sunshine");
		drop_Down(p.getH().getRoom_type(), "text", "Deluxe");
		drop_Down(p.getH().getRoom_nos(), "text", "2 - Two");
		clear_Text(p.getH().getDatepick_in());
		sendkeys("10/04/2022", p.getH().getDatepick_in());
		clear_Text(p.getH().getDatepick_out());
		sendkeys("12/04/2022", p.getH().getDatepick_out());
		drop_Down(p.getH().getAdult_room(), "text", "3 - Three");
		click(p.getH().getSubmit());
		click(p.getC().getRadiobutton_0());
		click(p.getC().getCon());
		sendkeys("Abhinaya", p.getB().getFirst_name());
		sendkeys("Abhi", p.getB().getLast_name());
		sendkeys("213 Derrick Street Boston, MA 02130 USA", p.getB().getAddress());
		sendkeys("1234567891234567", p.getB().getCc_num());
		drop_Down(p.getB().getCc_type(), "text", "Master Card");
		drop_Down(p.getB().getCc_exp_month(), "text", "June");
		drop_Down(p.getB().getCc_exp_year(), "text", "2022");
		sendkeys("1234", p.getB().getCc_cvv());
		click(p.getB().getBook_now());
		click(p.getI().getMy_itinerary());
	}
}