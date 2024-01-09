 package oopspack;



//by changing the number of arguments	
class Adder{  
 static int add(int a,int b)
 {
	 return a+b;
	 }  
 static int add(int a,int b,int c)
 {
	 return a+b+c;
	 }
 static double multiply(double a, double b)
 {
 return a*b;
 }
}  
public class TestOverloading1{  
public static void main(String[] args){
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));
System.out.println(Adder.multiply(10.4,10.6));
} 
}
//Note: In this example, we are creating static methods so that we don’t need to create an instance for calling methods.

