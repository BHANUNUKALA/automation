package oopspack;

//class Parrent_class123{
//	private String name;
//	private int age;
//	Parrent_class123(String nm,int ae){
//		this.name=nm;
//		this.age=ae;
//	}
//	public void printing_values() {
//		System.out.println("parent name: "+name); 
//		System.out.println("parent age: "+age); 
//		
//	}
//	
//}
//
//
//class Child_class123 extends Parrent_class123 {
//	 
//	private String address;
//	private int salary;
//	 Child_class123(String add,int sal,String nam,int ag){
//		 super(nam,ag);
//		this.address=add;
//		this.salary=sal;
//		
//	 }
//	 public void child_vlues() {
//		 System.out.println("child address: "+address); 
//			System.out.println("child salary : "+salary);
//	 }
//}
//
//public class Debug_P {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 Child_class123 cc=new  Child_class123("hyderabd",50000,"charani",25);
//		 cc.child_vlues();
//		 cc.printing_values();
//	}}


//Abstract class representing a university person
//abstract class UniversityPerson {
//String name;
//int id;
//
//// Constructor
//public UniversityPerson(String name, int id) {
//   this.name = name;
//   this.id =id;
//}
//
//// Abstract method to display information about the person
//abstract void display();
//}
//
////Concrete class representing a professor
//class Professor extends UniversityPerson {
//String department;
//
//// Constructor
//public Professor(String name, int id, String department) {
//	 super(name,id);
//	this.department = department;
//   
//}
//
//// Implementation of the abstract method to display professor information
//void display() {
//   System.out.println("Professor - Name: " + name + ", ID: " + id + ", Department: " + department);
//}
//}
//
////Concrete class representing an administrative staff
//class AdministrativeStaff extends UniversityPerson {
//String role;
//
//// Constructor
//public AdministrativeStaff(String name, int id, String role) {
//   super(name,id);
//   
//}
//
//// Implementation of the abstract method to display staff information
//@Override
//void display() {
//   System.out.println("Administrative Staff - Name: " + name + ", ID: " + id + ", Role: " + role);
//}
//}
//
////Concrete class representing a student
//class Studentt extends UniversityPerson {
//String major;
//
//// Constructor
//public Studentt(String name, int id, String major) {
//	super(name,id);
//	this.major = major;
//   
//}
//
//// Implementation of the abstract method to display student information
//void display() {
//   System.out.println("Student - Name: " + name + ", ID: " + id + ", Major: " + major);
//}
//}
//
//public class Debug_P {
//public static void main(String[] args) {
//   // Creating objects of concrete classes
//	UniversityPerson professor = new Professor("prashanth",123, "electrical");
//   UniversityPerson staff = new AdministrativeStaff( "Admin Assistant", 201, "amit");
//   UniversityPerson student = new Studentt("bhanu", 234, "oops");
//
//   // Using abstraction to display information about university persons
//   professor.display();
//   staff.display();
//   student.display();
//}
//}


//third program
//class Rectangle 
//{
//// Declare instance variables as private in the class. 
//   private int length; 
//   private int breadth; 
//
//// Declare a constructor Rectangle and define parameters of constructor. 
// Rectangle(int breadth)
// { 
//  this.breadth = breadth; 
// } 
// 
// 
//// Create a getter method for each private variable. 
//
//public int getBreadth()
//{ 
// return breadth; 
//} 
////2 privete constuctor find the squre of numbers
//
//// Create a setter method for each private variable and define parameter. 
//public float setLength(int length)
//{ 
// return this.length = length; 
//}
//
//
//public void setBreadth(int i) {
//	// TODO Auto-generated method stub
//	
//} 
//
//}
//
//public class Debug_P 
//{ 
//public static void main(String[] args)
//{ 
//Rectangle rt = new Rectangle(30); 
//
//float lth = rt.setLength(33); 
//int bth = rt.getBreadth(); 
//
//
//float Area = lth * bth; 
//System.out.println("Area: " +Area); 
//
//rt.setBreadth(66); 
//
//float ln = rt.setLength(99); 
//int br = rt.getBreadth(); 
//float newArea = ln * br; 
//System.out.println("New area: " +newArea); 
//} 
//}


class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int h, int c) {
        return a + c + h;
    }

    public String add1(String a, String h) {
        return a+ h;
    }
}

public class Debug_P {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        System.out.println("Sum of two integers: " + mathOps.add(22,77));
        System.out.println("Sum of three integers: " + mathOps.add(22,44,78));
        System.out.println("Concatenation of two strings: " + mathOps.add1("Hello", " World"));
    }
}