package Task_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.google.errorprone.annotations.FormatString;

public class Mock_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		
	     String name="nukalabhanu79";
		 driver.findElement(By.id("username")).sendKeys("nukalabhanu79@gmail.com");
	      
	      driver.findElement(By.id("password")).sendKeys("Bhanu@234");
	      
	      driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
	      
	      WebElement msg=driver.findElement(By.xpath("//strong[text()=\"nukalabhanu79\"]"));
	      if (msg.isDisplayed()) {
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Login failed!");
	        }
	      System.out.println(msg.getText());
	    //strong[text()="nukalabhanu79"]
	      String user=msg.getText();
	      System.out.println("comapareTo");
		    System.out.println(user .compareTo(name));
		System.out.println("Bhanu");
	}
}
