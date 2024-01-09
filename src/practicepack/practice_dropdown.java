package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class practice_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://formstone.it/components/dropdown/demo/");
		driver.manage().window().maximize();
//		WebElement drop_d=driver.findElement(By.xpath("//select[@id=\"first\"]"));
//		Select sc=new Select(drop_d);
//		sc.selectByIndex(1);
//		Thread.sleep(2000);
//		sc.selectByValue("Apple");
//		Thread.sleep(2000);
//		sc.selectByVisibleText("Yahoo");
//		WebElement sec=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
//		Select any=new Select(sec);
//		any.selectByIndex(1);
//		Thread.sleep(2000);
//		any.selectByValue("babycat");
//		Thread.sleep(2000);
//		any.selectByVisibleText("Big Baby Cat");
//		WebElement food=driver.findElement(By.xpath("//select[@id=\"second\"]"));
//		Select fd=new Select(food);
//		fd.selectByIndex(0);
//		fd.selectByValue("donut");
//		fd.selectByVisibleText("Burger");
//		Thread.sleep(2000);
//        fd.deselectByIndex(1);
	    WebElement bhanu=driver.findElement(By.xpath("//select[@id=\"demo_basic\"]"));
		Select bb=new Select(bhanu);
		bb.selectByIndex(0);
		Thread.sleep(2000);
		bb.selectByValue("2");
		Thread.sleep(2000);
		bb.selectByVisibleText("One");
		WebElement bhanuElement=driver.findElement(By.xpath("//select[@id=\"demo_multiple\"]"));
		Select mul=new Select(bhanuElement);
		mul.selectByValue("4");
		mul.selectByIndex(1);
			}

}
