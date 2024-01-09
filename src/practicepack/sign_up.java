package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class sign_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("bhanu");
		driver.findElement(By.name("lastname")).sendKeys("nukala");
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9785646785");
//		driver.findElement(By.name("pass")).send
		WebElement bhanu=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select day=new Select(bhanu);
		day.selectByValue("11");
		WebElement bhanuElement=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select month=new Select(bhanuElement);
		month.selectByVisibleText("Jul");
		WebElement bhanuElement1=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select year=new Select(bhanuElement1);
		year.selectByVisibleText("1997");
		driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
//		driver.findElement(By.xpath("(//input[@id=\"u_0_5_Nl\"]")).click();
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
//		new url
//		https://demo.automationtesting.in/Register.html
	}

}
