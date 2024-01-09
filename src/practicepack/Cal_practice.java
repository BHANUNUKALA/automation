package practicepack;

import java.time.Duration;
import java.time.MonthDay;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Cal_practice {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		drop down calander
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click on input date box
		
				driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
				
				// select month
				
				WebElement el_month=driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[1]"));
				Select se_month=new Select(el_month);
				se_month.selectByIndex(1); 
				
				// select year
				WebElement el_year=driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[2]"));
				Select se_year=new Select(el_year);
				se_year.selectByVisibleText("2018");
				
//                select day
				List<WebElement> all=driver.findElements(By.xpath("//table//tr//td"));
				for(WebElement date:all) {
					if(date.getText().equals("4")) {
						date.click();
						break;
	}

	}
	}
}


