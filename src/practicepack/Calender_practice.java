package practicepack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://jqueryui.com/datepicker/");
//		driver.manage().window().maximize();
//		driver.switchTo().frame(0);
////		Approach-1
//		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2025");//mm/dd/yyyy
//
//		//Approach-2
//		String year="2025";
//		String month="April";
//		String Day="22";
//		
//		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//input://input[@id="datepicker"]
//		
//		//select month and year
//		while(true)
//		{
//			//current month
//			String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();////span[@class="ui-datepicker-month"]
//			//current year
//			String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();////span[@class="ui-datepicker-year"]
//			//checking the condition with the given data
//			if(yr.equals(year) && Mnth.equals(month)) //2023.equals(2025) && may.equals(april)
//			{
//				
//				break;
//			}
//			//next button
//			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
//			
//		}
//		//selecting day
//		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));////table[@class="ui-datepicker-calendar"]//td
//		for(WebElement dt:alldates) {
//			if(dt.getText().equals("8")) {
//				dt.click();
//				break;
//			}
//		}
		
		// Date and time calendar
		
				driver.get("https://demoqa.com/date-picker");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Click on date and time input box
				
				driver.findElement(By.id("dateAndTimePickerInput")).click();
				
				// Store expected date and time
				
				String exp_year="2024";
				String exp_month="February";
				String exp_day="4";
				String exp_time="06:15";
				
				// Get current month and year from calendar
				
				
				
				
				// Year and month
				
				while(true) {
					String cur_month_year=driver.findElement(By.xpath("//*[contains(@class,\"current-mont\")]")).getText();
					String[] bhanu_month_year_arr=cur_month_year.split(" ");
					String cur_month=bhanu_month_year_arr[0];
					String cur_year=bhanu_month_year_arr[1];
					
					if (exp_year.equals(cur_year) && exp_month.equals(cur_month)) {
						break;
					}
					
					driver.findElement(By.xpath("//button[text()=\"Next Month\"]")).click();
					
				}
				
				// day 
				
				List<WebElement> day_li=driver.findElements(By.xpath("//*[@class=\"react-datepicker__month\"]//div"));
				
				for(WebElement day:day_li) {
					if (day.getText().equals(exp_day)) {
						day.click();
						break;
					}
				}
				
				// Time //ul[@class="react-datepicker__time-list"]
				
				List<WebElement> times_li=driver.findElements(By.xpath("//ul[@class=\"react-datepicker__time-list\"]//li"));
				
				for(WebElement time:times_li) {
					
					if(time.getText().equals(exp_time)) {
						time.click();
						break;
					}
				}

	}

}
