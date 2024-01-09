package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fb_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi all");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chrome-headless-shell-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("bhanu@234");
//		driver.findElement(By.name("pass")).sendKeys("123456");
//		driver.findElement(By.name("login")).click();
//		driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.findElement(By.partialLinkText("Forgotten ac")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys("bhanu@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("bhanu@123");
//		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
//		driver.quit();
	}

}
