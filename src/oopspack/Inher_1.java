package oopspack;

public class Inher_1  {
public String brand="yamaha";
	public void speed() {
		System.out.println("no one can beat");
	}
	  Inher_1() {         
	      System.out.println("Class A constructor");    
	   } 
	// Declare a static block.     
	   static {         
	      System.out.println("Class A SIB"); 
	   } 
	// Declare an instance block.      
	   {          
	      System.out.println("Class A IIB");      
	   } 	

	}


