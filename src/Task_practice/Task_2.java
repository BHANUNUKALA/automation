package Task_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
 class Registration {
	static  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://demo.nopcommerce.com/computers");
		driver.manage().window().maximize();
//		registration_________________________________________________________________________________-
		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("bhanu");
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("nukala");
		WebElement bhanu=driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
		Select bb=new Select(bhanu);
		bb.selectByValue("2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement bhanuElement=driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
		Select mul=new Select(bhanuElement);
		mul.selectByIndex(2);
		
		WebElement bhanuyear=driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
		Select bhanuy=new Select(bhanuyear);
		bhanuy.selectByValue("1997");
		
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("bhanunukala234@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Bhanu@12345");
		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Bhanu@12345");
		driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 class Login extends Registration{
	 static {
//	      login__________________________________________________________________________________________________
		 
	      driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
	      
	      driver.findElement(By.id("Email")).sendKeys("bhanunukala234@gmail.com");
	      
	      driver.findElement(By.id("Password")).sendKeys("Bhanu@12345");
	      
	      driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
	 }
 }
 class Computer extends Login{
	 public void speed() throws InterruptedException {
		 EdgeOptions options=new EdgeOptions();
		 WebDriver driver=new EdgeDriver(options); 
		 driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
         
         driver.findElement(By.xpath("(//a[text()=\"Desktops \"])[3]")).click();
    
         Thread.sleep(4000);
         
         driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg\"]")).click();
         
         Thread.sleep(3000);
         
         
//INSPECTING THE ELEMENT_________________________________________________________________________________
	      
	      WebElement com= driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));
         
         Select Processer=new Select(com);
         
         Processer.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
         
 //RAM________________________________________________________________________________________________________
         
          WebElement com1=driver.findElement(By.xpath("//select[@id=\"product_attribute_2\"]"));
          
          Select RAM=new Select(com1);
          
          RAM.selectByVisibleText("8GB [+$60.00]");
          
          Thread.sleep(2000);
          
          
          
 //HDD_______________________________________________________________________________
          
         driver.findElement(By.id("product_attribute_3_6")).click();
         
         Thread.sleep(2000);
         
         driver.findElement(By.id("product_attribute_3_7")).click();
         
         Thread.sleep(2000);
         
 //OS____________________________________________________________________________________
         
           driver.findElement(By.id("product_attribute_4_9")).click();
           
           Thread.sleep(2000);
           
           driver.findElement(By.id("product_attribute_4_8")).click();
           
           Thread.sleep(2000);
           
           
  //SOFTWARE___________________________________________________________________________________
           
           	driver.findElement(By.id("product_attribute_5_11")).click();
           	
           	Thread.sleep(2000);
           	
           	driver.findElement(By.id("product_attribute_5_12")).click();
           	
           	Thread.sleep(2000);
           	
           	driver.findElement(By.id("product_attribute_5_10")).click();
           	
        	Thread.sleep(2000);
           	
     //ADD TO CARD________________________________________________________________________________
           	
           	
           	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();
           	
           	Thread.sleep(2000); 	
           	
           	
 	//THIS ELEMENT IS NOTEBOOK 
           	
       //NOTEBOOK___________________________________________________________________________________________________
           	
//           	driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
          driver.navigate().back(); 
          driver.navigate().back();
    		Thread.sleep(2000);
//    		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[2]")).click();
//    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();
    		
    		Thread.sleep(2000);
    		
   //CPU TYPE___________________________________________________________________________________________________
    		
    		driver.findElement(By.id("attribute-option-6")).click();
    		
    		Thread.sleep(1000);
    		
    		driver.findElement(By.id("attribute-option-7")).click();
    		
    		Thread.sleep(2000);
            
	//MEMORY_________________________________________________________________________________________________________
    		
    		driver.findElement(By.id("attribute-option-8")).click();
    		
    		Thread.sleep(3000);
    		
    		driver.findElement(By.id("attribute-option-9")).click();
    		
    		Thread.sleep(3000);
    		
    		driver.findElement(By.id("attribute-option-10")).click();
    		
    		Thread.sleep(3000);
    		
    		
//SORT BYY______________________________________________________________________________________________________________
    WebElement	s1=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
    
    		Select Sortby=new Select(s1);
    		
    		Sortby.selectByVisibleText("Created on");
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000030_hp-envy-6-1180ca-156-inch-sleekbook_415.jpeg\"]")).click();
    		
    		Thread.sleep(3000);
    		
    		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();
    		
    		Thread.sleep(3000);
    		
    		
    		
  //NUMBER THREE ELEMENT SOFTWARE______________________________________________________________________
    		
    		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
           	
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
    		Thread.sleep(2000);
    	
    		//SORT BYE_______________________________________________________________________________________ 
    		
    	           WebElement A1= driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
    	
    	           Select Sortby1=new Select(A1);
    	           
    	           Thread.sleep(2000);
    	           
    	           Sortby1.selectByVisibleText("Created on");
    	           
    	           Thread.sleep(1000);
    	           
    	           driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]")).click();
    	           
    	           Thread.sleep(2000);
    	           
    	           driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-12\"]")).click();
    	           
    	           Thread.sleep(2000);
    	           
    	           driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();
    	           
    	           Thread.sleep(3000);
    	           
    	           driver.findElement(By.id("FriendEmail")).sendKeys("bhanu99@gmail.com");
    	           
    	           Thread.sleep(2000);
    	           
    	           driver.findElement(By.id("YourEmailAddress"));
    	           
    	           Thread.sleep(2000);
    	           
    	           driver.findElement(By.id("PersonalMessage")).sendKeys("first sigment is done");
    	           
    	           Thread.sleep(2000);
    	           
    	           driver.findElement(By.name("send-email")).click();
		}
 }
public class Task_2 extends Computer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://demo.nopcommerce.com/apparel");
		driver.manage().window().maximize();
//		sheos element__________________________________________________________________________________________________________
	    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
         
        Thread.sleep(1000);
         
        driver.findElement(By.xpath("//*[@id=\"attribute-option-16\"]")).click();
         
        Thread.sleep(1000);
//        sort by_____________________________________________________________________________________________________
        WebElement	s1=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
        
 		Select Sortby=new Select(s1);
 		
 		Sortby.selectByVisibleText("Created on");
 		
 		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/a/img")).click();
         
        Thread.sleep(1000);
        WebElement	size1=	driver.findElement(By.xpath("//select[@name=\"product_attribute_9\"]"));
      
		Select Sortby1=new Select(size1);
		
		Sortby1.selectByVisibleText("8");
        driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
     	
     	Thread.sleep(1000);
     	driver.navigate().back();
     	driver.navigate().back();
//     	clothing element______________________________________________________________________________________________________________
     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000011_clothing_450.jpeg\"]")).click();
//    	sort by_____________________________________________________________________________________________-
        WebElement	s11=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
        
 		Select Sortby11=new Select(s11);
 		
 		Sortby11.selectByVisibleText("Created on");
		
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000060_levis-511-jeans_415.jpg\"]")).click();
  		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-30\"]")).click();

     	Thread.sleep(2000);
  		driver.navigate().back();
     	driver.navigate().back();
//     	accesories element__________________________________________________________________________________________________________
     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000012_apparel-accessories_450.jpg\"]")).click();
     	
     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000064_ray-ban-aviator-sunglasses_415.jpg\"]")).click();
  		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
  		
//  		digital downloads element____________________________________________________________________________________________
     	driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000067_science-faith_415.jpeg\"]")).click();
     	WebElement pric=driver.findElement(By.xpath("//input[@class=\"enter-price-input\"]"));
     	pric.clear();
     	pric.sendKeys("100");
     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-36\"]")).click();

//        books element_____________________________________________________________________________
     	driver.navigate().to("https://demo.nopcommerce.com/books");
     	 WebElement	s111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
         
  		Select Sortby111=new Select(s111);
  		
  		Sortby111.selectByVisibleText("Created on");
  		Thread.sleep(2000);
     	driver.findElement(By.xpath("//img[@alt=\"Picture of Pride and Prejudice\"]")).click();
     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-39\"]")).click();
     	
//     	jewelry element___________________________________________________________________________
     	driver.navigate().to("https://demo.nopcommerce.com/jewelry");
    	 WebElement	s1111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
        
 		Select Sortby1111=new Select(s1111);
 		
 		Sortby1111.selectByVisibleText("Created on");
 		Thread.sleep(2000);
     	driver.findElement(By.xpath("//img[@alt=\"Picture of Vintage Style Engagement Ring\"]")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-42\"]")).click();
     	
//     	gift card element___________________________________________________________________________
     	driver.navigate().to("https://demo.nopcommerce.com/gift-cards");
   	 WebElement	s11111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
       
		Select Sortby11111=new Select(s11111);
		
		Sortby11111.selectByVisibleText("Created on");
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//img[@alt=\"Picture of $50 Physical Gift Card\"]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("p");
    	driver.findElement(By.xpath("//input[@class=\"sender-name\"]")).sendKeys("bhanu");
    	driver.findElement(By.xpath("//textarea[@id=\"giftcard_44_Message\"]")).sendKeys("My heart stops when ever you look at me");
    	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();
   }

}
