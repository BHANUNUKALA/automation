package practicepack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
//		Alert promptAlert = driver.switchTo().alert();
//		promptAlert.sendKeys("Selenium");
//		promptAlert.accept();

		driver.findElement(By.xpath("//a[@href=\"#OKTab\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"] ")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"] ")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"] ")).click();
		Thread.sleep(2000);
		Alert textAlert=driver.switchTo().alert();
		textAlert.sendKeys("bhanu");
		textAlert.accept();
		
		
		
		
	}

}
