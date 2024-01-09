package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("bhanu");
		driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("nukala");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("4-104,nagullanka,p.gannavaram,ap");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("bhanu@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("9381222583");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
//		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).sendKeys("english");
		
		WebElement skill=driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select prSelect=new Select(skill);
		prSelect.selectByValue("Java");
		
		WebElement country=driver.findElement(By.xpath("//select[@id=\"countries\"]"));
		Select name=new Select(country);
		name.selectByVisibleText("Select Country");
		
		WebElement country1=driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select nameSelect=new Select(country1);
		nameSelect.selectByValue("India");
		
		WebElement bhanuElement1=driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		Select year=new Select(bhanuElement1);
		year.selectByVisibleText("1999");
		
		WebElement bhanuElement=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Select month=new Select(bhanuElement);
		month.selectByVisibleText("February");
		
		WebElement bhanu=driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		Select day=new Select(bhanu);
		day.selectByValue("4");
//		https://www.ascdegreecollege.ac.in/degree-application-form/
	}

}
