package practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cal_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
//		Approach-1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2025");//mm/dd/yyyy

		//Approach-2
		String year="2026";
		int bhanu=Integer.parseInt(year);
//		Integer.par
		String month="April";
		String Day="22";
		int current_year=2023;
			
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//input://input[@id="datepicker"]
		
		//select month and year
		while(true)
		{
			//current month
			String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();////span[@class="ui-datepicker-month"]
			//current year
			String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();////span[@class="ui-datepicker-year"]
			//checking the condition with the given data
			if(yr.equals(year) && Mnth.equals(month)) //2023.equals(2025) && may.equals(april)
			{
				
				break;
			}
			//next button
			
			
			if(current_year<bhanu){
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
			}
			else {
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click(); // Click on the "Previous" button
				
			}
		}
		//selecting day
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));////table[@class="ui-datepicker-calendar"]//td
		for(WebElement dt:alldates) {
			if(dt.getText().equals(Day)) {
				dt.click();
				break;
			}
		}
	
	}
}
