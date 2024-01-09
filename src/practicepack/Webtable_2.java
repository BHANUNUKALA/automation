package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Webtable_2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
		System.out.println("number of rows::"+rows);
		int cols=driver.findElements(By.xpath("//table[@id=\"countries\"]//td")).size();
		System.out.println("number of cols::"+cols);
		for(int r=2;r<=rows;r++) {
			String lang=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[5]")).getText();
			
			if(lang.equals("English"))
			{
				driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td//input")).click();
				String country=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[2]")).getText();
				System.out.println(lang+"  :  "+country);
			}
		}

		}
	}


