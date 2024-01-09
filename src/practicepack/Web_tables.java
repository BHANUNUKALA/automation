package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Web_tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 // 1) Find total number of rows 

			

			int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred

			
			System.out.println("Number of rows:"+ rows); //7

			

			

			//2) Find total number of columns

			

			int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();

			

			

			System.out.println("Number of columns:"+ cols); //4
             //3) Read specific row & column data

			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[2]")).getText();

			System.out.println(value); 

	        //4) Read data from all the rows & columns

			

			System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");

			

			

			for(int r=2;r<=rows;r++)

			{

				for(int c=1;c<=cols;c++)

				{

					String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();

					System.out.print(value1+"     "); 

				}

				System.out.println();

			}
//			requirement is same author but print the different book names
			System.out.println();
			System.out.println("     author and bookname");
			System.out.println();
			for(int r=2;r<=rows;r++) {
				String Ath=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				if(Ath.equals("Amit"))
				{
					String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println(Ath+"  "+Bookname);
				}
			}
			System.out.println();
			System.out.println("      subject and book price");
			System.out.println();
			for(int r=2;r<=rows;r++) {
				String subj=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[3]")).getText();
				if(subj.equalsIgnoreCase("javascript"))
				{
					String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
					System.out.println(subj+"  "+Price);
				}
			}
			int sum=0;
			for(int r=2;r<=rows;r++)
			{
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
				sum=sum+Integer.parseInt(price);//sum=0+300 =300+500=800
				
			}
			
			System.out.println("Total price of books:"+sum);
		
			}
	}


//https://cosmocode.io/automation-practice-webtable/
//https://qavbox.github.io/demo/webtable/
//https://demoqa.com/webtables