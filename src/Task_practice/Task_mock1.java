package Task_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Task_mock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
	      
	      driver.findElement(By.linkText("Create an Account")).click();
driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("nukala");
	      
	      driver.findElement(By.id("lastname")).sendKeys("Bhanu");
driver.findElement(By.xpath("//input[@id=\"email_address\"]")).sendKeys("bhanu79@gmail.com");
	      
	      driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Bhanu@234");
	      driver.findElement(By.xpath("//input[@name=\"password_confirmation\"]")).sendKeys("Bhanu@234");  
	      driver.findElement(By.xpath("//button[@title=\"Create an Account\"]")).click();
	      WebElement msg=driver.findElement(By.xpath("//p[text()=\"bhanu79@gmail.com\"]"));
	      if (msg.isDisplayed()) {
	            System.out.println("show email");
	        } else {
	            System.out.println("email not showing");
	        }
	}

}
