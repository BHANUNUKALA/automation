package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.ascdegreecollege.ac.in/degree-application-form/");
		driver.manage().window().maximize();
		
		WebElement bhanuElement=driver.findElement(By.xpath("//select[@id=\"wpforms-11388-field_3\"]"));
		Select courseSelect=new Select(bhanuElement);
		courseSelect.selectByVisibleText("B.Com");
		
		driver.findElement(By.name("wpforms[fields][0][first]")).sendKeys("bhanu");
		driver.findElement(By.name("wpforms[fields][0][middle]")).sendKeys("prakash");
		driver.findElement(By.name("wpforms[fields][0][last]")).sendKeys("nukala");
		
		WebElement bhanuElement2=driver.findElement(By.xpath("//select[@id=\"wpforms-11388-field_4\"]"));
		Select gender=new Select(bhanuElement2);
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.name("wpforms[fields][5]")).sendKeys("04-02-1998");
		
//		WebElement ref=driver.findElement(By.xpath("//input[@placeholder=\"Vijayanagar, Bangalore\"]"));
//		ref.clear();
//		ref.sendKeys("tatipaka,konaseema");
		
//		driver.findElement(By.xpath("//input[@name=\"wpforms[fields][7]\"]")).sendKeys("india");
		
//		driver.findElement(By.id("wpforms-11388-field_7")).sendKeys("india");
		
//		driver.findElement(By.id("wpforms-11388-field_8")).sendKeys("hindu,oc");
		
		
		WebElement bhanuElement21=driver.findElement(By.xpath("//select[@id=\"wpforms-11388-field_16\"]"));
		Select gender1=new Select(bhanuElement21);
		gender1.selectByVisibleText("General");
//		https://demoqa.com/alerts
	}

}
