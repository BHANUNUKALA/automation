package javamethods;

public class Java_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String word="today ind vs nz semifinal match";
int x=8;
int y=4;

//add two numbers
int add=x+y;
System.out.println(add);

//even or odd number
if(add % 2==0) {
	System.out.println(add+"is even");
}else {
	System.out.println(add+"is odd");
}

//count words
int countwords=word.split(" ").length;
System.out.println(countwords);
	}

}
