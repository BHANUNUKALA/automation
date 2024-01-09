package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("bhanu");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("nukala");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("bhanu@gmail");
//		driver.findElement(By.xpath("//input[@id=\"gender-radio-1\"]")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"Mobile Number\"]")).sendKeys("9381222583");
//		WebElement ref=driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]"));
//		ref.clear();
//		ref.sendKeys("12 oct 2023");
		driver.findElement(By.cssSelector("textarea[placeholder=\"Current Address\"]")).sendKeys("4-104,nagullanka");
     	}

}
