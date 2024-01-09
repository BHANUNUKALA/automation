package practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Pophot_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
//		driver.manage().window().maximize();
//		WebElement bhanu=driver.findElement(By.xpath("//select[@name=\"country\"]"));
//		Select bb=new Select(bhanu);
//		String[] countries = {"United States", "Canada", "India"};
//		 for (String country : countries) {
//			 bb.selectByVisibleText("india");
//			 WebElement stateDropdown = driver.findElement(By.id("state"));
//			 Select stateSelect = new Select(stateDropdown);
//			 stateSelect.selectByVisibleText("Andhra Pradesh");
//			 bb = new Select(driver.findElement(By.id("country")));
//	        }
//		 }
//}

driver.get("https://in.bookmyshow.com/explore/upcoming-movies-hyderabad?referrerBase=movies");

driver.findElement(By.xpath("//span[@class=\"bwc__sc-1nbn7v6-10 cntvL ellipsis\"]")).click();
List<WebElement> Cities= driver.findElements(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]/li"));
System.out.println("No.of Cities :"+Cities.size());
for (WebElement City : Cities)
{
	String Req_City="Bengaluru";
	if(City.getText().equals(Req_City))
	{
		City.click();
		break;
	}
}
	}}
