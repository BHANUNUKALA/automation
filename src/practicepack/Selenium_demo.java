package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"myTextInput\"]")).sendKeys("bhanu");
		driver.findElement(By.xpath("//textarea[@id=\"myTextarea\"]")).sendKeys("nukala");
		WebElement ref= driver.findElement(By.xpath("//input[@id=\"myTextInput2\"]"));
		ref.clear();
		ref.sendKeys("prakash");
		driver.findElement(By.xpath("//input[@id=\"radioButton2\"]")).click();
		driver.findElement(By.linkText("SeleniumBase on GitHub")).click();
//		driver.close();
		
	}

}
