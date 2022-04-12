package first;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class Base {
public static WebDriver driver;
public static WebDriver browser_Launch()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhi\\Desktop\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
}
public static void url(String url)
{
	driver.get(url);
}
public static void sendkeys(String send, WebElement element)
{
	element.sendKeys(send);
}
public static void close()
{
	driver.close();
}
public static void quit() {
driver.quit();
}
public static void navigate_To(String url)
{
	driver.navigate().to(url);
}
public static void navigate_Back() {
	driver.navigate().back();
}
public static void navigate_Forward() {
	driver.navigate().forward();
}
public static void navigate_Refresh() {
driver.navigate().refresh();
}
public static void alert_accept() {
	driver.switchTo().alert().accept();
}
public static void alert_dismiss() {
	driver.switchTo().alert().dismiss();
}
public static void alert_sendkeys(String input) {
	driver.switchTo().alert().sendKeys(input);
}
public static void clear_Text(WebElement element)
{
	element.clear();
}
public static void actions_Doubleclick(WebElement target) {
	Actions a=new Actions(driver);
	a.doubleClick(target).build().perform();
}
public static void actions_clickAndHold(WebElement target) {
	Actions a=new Actions(driver);
	a.clickAndHold(target).build().perform();
}
public static void actions_dragAndDrop(WebElement source, WebElement target) {
	Actions a=new Actions(driver);
	a.dragAndDrop(source, target).build().perform();
}
public static void actions_moveToElement(WebElement target) {
	Actions a=new Actions(driver);
	a.moveToElement(target).build().perform();
	}
public static void actions_contextClick(WebElement target) {
	Actions a=new Actions(driver);
	a.contextClick(target).build().perform();
}
public static void frames(WebElement element) {
	driver.switchTo().frame(element);
}
public static void robot() throws AWTException
{
Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
public static void drop_Down(WebElement element, String value, String drop) {
	Select s=new Select(element);
	if(value.equals("value"))
	{
	s.selectByValue(drop);
	}else if(value.equals("text"))
	{
		s.selectByVisibleText(drop);
	}else
	{
		int i=Integer.parseInt(drop);
		s.selectByIndex(i);
	}
}
public static void check_Box(WebElement element) {
	element.click();
}
public static void is_Enable(WebElement element) {
	element.isEnabled();
}
public static void is_Displayed(WebElement element) {
	element.isDisplayed();
}
public static void is_Selected(WebElement element) {
	element.isDisplayed();
}
//public static void get_Options(WebElement element) {
	//List<WebElement> list = ((Select) element).getOptions();
//}
public static void get_Title(String title) {
	driver.getTitle();
}
public static void get_Currect_Url(String url) {
	driver.getCurrentUrl();
}
public static void get_Text(WebElement element) {
	System.out.println(element.getText());
}
public static void get_Attribute(WebElement element) {
	element.getAttribute(null);
}
public static void wait_Time(Integer time) throws InterruptedException
{
	driver.wait(time);
}
public static void take_Screenshot() throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Abhi\\eclipse-workspace\\Selenium\\Pictures\\pic2.png");
}
public static void scroll_Up(Long value) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,value);");
}
public static void scroll_Down(Long value) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,value);");
}
public static void click(WebElement element) {
	element.click();
}
public static void radio_Button(WebElement element) {
	element.click();
}
public static void get_First_Selected_Options(WebElement option) {
	Select s=new Select(option);
	s.getFirstSelectedOption();
}
public static void get_All_Selected_Options(WebElement option) {
	Select s=new Select(option);
	s.getAllSelectedOptions();
}
public static void is_Multiple(WebElement option)
{
	Select s=new Select(option);
	s.isMultiple();
}
}