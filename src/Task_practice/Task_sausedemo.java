package Task_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Task_sausedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("bhanu");
		WebElement ref=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		ref.sendKeys("bhanu@234");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	}

}
