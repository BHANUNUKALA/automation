package practicepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println("hi all");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
String titleofpage=driver.getTitle();
System.out.println(driver.getCurrentUrl());
System.out.println(titleofpage);
System.out.println(driver.getPageSource());
driver.navigate().to("https://www.amazon.in/");
Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	}

}
