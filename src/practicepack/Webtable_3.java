package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Webtable_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@id=\"table01\"]//tr")).size();
		System.out.println("number of rows::"+rows);
		int cols=driver.findElements(By.xpath("//table[@id=\"table01\"]//td")).size();
		System.out.println("number of cols::"+cols);
		driver.findElement(By.xpath("//table[@id=\"table01\"]//tr[1]//td[5]//input")).click();
		driver.findElement(By.xpath("//table[@id=\"table01\"]//tr[2]//td[1]//input")).click();
		driver.findElement(By.xpath("//table[@id=\"table01\"]//tr[3]//td[5]//input")).click();
		
		int rows1=driver.findElements(By.xpath("//table[@id=\"table02\"]//tr")).size();
		System.out.println("number of rows::"+rows1);
		int cols1=driver.findElements(By.xpath("//table[@id=\"table02\"]//th")).size();
		System.out.println("number of cols::"+cols1);
		for(int r=2;r<=rows1;r++) {
			String location=driver.findElement(By.xpath("//table[@id=\"table02\"]//tr["+r+"]//td[5]")).getText();
			
			if(location.equalsIgnoreCase("Tokyo"))
			{
				String office=driver.findElement(By.xpath("table[@id=\"table02\"]//tr["+r+"]//td[1]")).getText();
				String salary=driver.findElement(By.xpath("table[@id=\"table02\"]//tr["+r+"]//td[6]")).getText();
				
				System.out.println(office+"  :  "+location+"  :   "+salary);
			}
		}
		
	}

}
