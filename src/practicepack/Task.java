package practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu nukala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://formy-project.herokuapp.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

       Thread.sleep(2000);
		WebElement ref=driver.findElement(By.xpath("(//a[text()=\"Autocomplete\"])[2]"));
		ref.click();

		driver.get("https://formy-project.herokuapp.com/autocomplete");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("nagullanka");
		driver.findElement(By.xpath("//input[@id=\"street_number\"]")).sendKeys("4-104");
		driver.findElement(By.xpath("//input[@id=\"route\"]")).sendKeys("near lord hanuman temple");
		driver.findElement(By.xpath("//input[@id=\"locality\"]")).sendKeys("konaseema");
		driver.findElement(By.xpath("//input[@id=\"administrative_area_level_1\"]")).sendKeys("andhra");
		driver.findElement(By.xpath("//input[@id=\"postal_code\"]")).sendKeys("533249");
		driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("India");
		
		//Buttons
		driver.navigate().to("https://formy-project.herokuapp.com/buttons");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.xpath("//button[text()=\"Primary\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Success\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Info\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Warning\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Danger\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Left\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Middle\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Right\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"1\"]")).click();
	
		
     //DropDown
		driver.navigate().to("https://formy-project.herokuapp.com/dropdown");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]")).click();
		Thread.sleep(2000);
		
//		datepicker
		driver.navigate().to("https://formy-project.herokuapp.com/datepicker");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("11/01/2022");
		
//		checkbox
		driver.navigate().to("https://formy-project.herokuapp.com/checkbox");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id=\"checkbox-1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"checkbox-2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"checkbox-3\"]")).click();
		Thread.sleep(2000);

//		radio buttons
		driver.navigate().to("https://formy-project.herokuapp.com/radiobutton");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@value=\"option3\"]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
//WebElement links=driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div"));
//System.out.println(links.findElements(By.tagName("a")).size());
//List<WebElement> list_links=links.findElements(By.tagName("a"));
//for(WebElement link:list_links) {
//	Object i;
//	System.out.println(link.getText());
//	if(link.get(i).getText().equalsIgnoreCase("Radio Button")) {
//		link.click();
//	}
//}