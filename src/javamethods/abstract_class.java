package javamethods;

//abstract class cars {
//	public abstract void enginesound();
//	public void speed() {
//		System.out.println("ride with joy");
//		
//	}
//}
//		
//class trucks extends cars {
//	public void enginesound() { 
//		System.out.println("lot of sound");
//		
//	}
//}
//
//public class abstract_class {
//public static void main(String[] args) {
//	trucks truck = new trucks();
//	truck.enginesound();
//	truck.speed();
//}
//} 



//example 1 _____________________________________________________
// abstract class Hello 
//{ 
// 
//   public void msg1() 
//   { 
//      System.out.println("msg1-Hello"); 
//   } 
//   abstract public void msg2(); 
//} 
// class Test extends Hello 
//{ 
//// Overriding abstract method. 
//   public void msg2() 
//   { 
//      System.out.println("msg2-Test"); 
//   } }
//   public class abstract_class { 
//public static void main(String[] args)
//{ 
//  
//    Test obj = new Test(); 
//    obj.msg1(); 
//    obj.msg2(); 
//  } 
//}


// class Employee 
//{ 
//   private String name; 
//   private int id; 
// 
//   public Employee(String emname, int emid)
//   { 
//     this.name = emname; 
//     this.id = emid; 
//   } 
//// Declaration of concrete method. 
//   void m1()
//   { 
//      System.out.println("Name: " +name); 
//      System.out.println("Id: " +id); 
//   } 
//} 
//
// class Engineer extends Employee 
//{ 
//	 private String  company;
//	 private int salory;
//	 void m2()
//	   { 
//	      System.out.println("company: " +company); 
//	      System.out.println("salory: " +salory); 
//	   }
//   public Engineer(String enname, int enid,String encompany,int ensalory)
//   { 
//      super(enname, enid);
//      this.company =encompany;
//      this.salory =ensalory;
//   }}
//   public class abstract_class {
//public static void main(String[] args)
//{ 
//// Creating an object of the subclass of abstract class. 
//   Engineer e = new Engineer("Deep", 10202,"charani",20000); 
//   e.m1();
//   e.m2();
// } 
//}

//class Student{ 
//int rollNo;
//private String surname;
//private String name; 
//Student(String studentName, String studentSurname, int studentRollNo){ 
//	this.name= studentName; 
//	this.surname = studentSurname; 
//	this.rollNo= studentRollNo; 
//} 
//public void getStudentDetails(){ 
//	System.out.println("The name of the student is "+ this.name +" "+ this.surname); 
//	System.out.println("The roll no of the student is "+ this.rollNo); 
//} 
//} 
//public class abstract_class{ 
//public static void main(String args[]) { 
//	Student bha=new Student("bhanu", "nukala",234);
//	bha.getStudentDetails();
//} 
//}

//implementation of abstraction through abstract class


//today task ________________________________________________________________________________________________
abstract class Animal { 

	abstract void sound();
	abstract void eat();
	abstract void sleep();
} 

class Lion extends Animal { 
	Lion() { System.out.println("You have created a Lion"); } 
	void sound() { System.out.println("lion sound"); } 
	void eat() { System.out.println("lion eat"); }
	void sleep() { System.out.println("lion sleep"); }
} 

class Tiger extends Animal { 
	Tiger() 
	{ 
		System.out.println("You have created a Tiger"); 
	} 
	void sound() { System.out.println("tiger sound."); } 
	void eat() { System.out.println("tiger eat"); }
	void sleep() { System.out.println("tiger sleep"); }
} 
class Deer extends Animal {
	Deer() 
	{ 
		System.out.println("You have created a deer"); 
	} 
	void sound() { System.out.println("deer sound."); } 
	void eat() { System.out.println("deer eat"); }
	void sleep() { System.out.println("deer sleep"); }
}


abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;
    private double diameter;
    public Circle(double radius) {
        this.radius = radius;
        
    }

//    area of circle formula is A=πr2  A=area, π=PI,  r=radius
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

//    circumference of the circle formula is C=2πr  c=circumference, π=PI, r=radius 
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

//    Area = Square root of√s(s - a)(s - b)(s - c) where        s is half the perimeter, or (a + b + c)/2.
    public double calculateArea() {
        // Heron's formula for the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

//    P=a+b+c  perimeter formula for three sides of triangle
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}






abstract class BankAccount {
     double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account: Deposit of $" + amount + " successful.");
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Account: Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Savings Account: Insufficient funds for withdrawal.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account: Deposit of " + amount + " successful.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Current Account: Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Current Account: Insufficient funds for withdrawal.");
        }
    }
}

abstract class Shape3D{
	abstract double calculatevolume();
	abstract void calculateSurfaceArea();}
class Sphere extends Shape3D {
	  private double radius;

	  public Sphere(double radius) {
	    this.radius = radius;
	  }

	@Override
	public double calculatevolume() {
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}

	@Override
	void calculateSurfaceArea() {
		
	}
	}


public class abstract_class {
    public static void main(String[] args) {
    	Lion lion=new Lion();
		lion.sound();
		lion.eat();
    	lion.sleep();
		 Tiger tiger=new Tiger(); 
		 tiger.sound();
		 tiger.eat();
		 tiger.sleep();
		 Deer deer=new Deer();
		 deer.sound();
		 deer.eat();
		 deer.sleep();
		 System.out.println();
	        System.out.println();
	        
	        System.out.println("Area of the circle and triangle ");
	        
	        Circle circle = new Circle(5);
	        Triangle triangle = new Triangle(3, 4, 5);

	        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
	        System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
		 
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(2000, 500);
        System.out.println();
        System.out.println();
        System.out.println("bank account details");
        System.out.println("Initial Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Updated Savings Account Balance: " + savingsAccount.getBalance());

        System.out.println("\nInitial Current Account Balance: " + currentAccount.getBalance());
        currentAccount.deposit(1000);
        currentAccount.withdraw(2500);
        System.out.println("Updated Current Account Balance: " + currentAccount.getBalance());
        System.out.println();
        System.out.println();
        
       
    }
}




