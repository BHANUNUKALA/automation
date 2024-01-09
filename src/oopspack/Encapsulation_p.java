package oopspack;
class person{
	private int phone;
private String name;
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	

	}


public class Encapsulation_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
person myOBJ=new person();
myOBJ.setName("bhanu");
myOBJ.setPhone(9787787);
System.out.println(myOBJ.getPhone());
System.out.println(myOBJ.getName());
	}

}


//  class Student 
//{ 
//	// Step 1: Declare variables private in the class. 
//	  private String stdName; // private field. 
//	  private int stdRollNo; 
//	  private int stdId;
//	public String getStdName() {
//		return stdName;
//	}
//	public void setStdName(String stdName) {
//		this.stdName = stdName;
//	}
//	public int getStdRollNo() {
//		return stdRollNo;
//	}
//	public void setStdRollNo(int stdRollNo) {
//		this.stdRollNo = stdRollNo;
//	}
//	public int getStdId() {
//		return stdId;
//	}
//	public void setStdId(int stdId) {
//		this.stdId = stdId;
//	}} 
//	  
//  public class Encapsulation{
//	  
//	  	public static void main(String[] args) {  
//	  
//	  		Student obj = new Student();
//	  		obj.setStdName("bhanu"); 
//	  	   obj.setStdRollNo(234); 
//	  	   obj.setStdId(12345); 
//	  	   
//	  	 System.out.println("Student's Name: " +obj.getStdName()); 
//	     System.out.println("Student's Roll no.: " +obj.getStdRollNo()); 
//	     System.out.println("Student's Id: " +obj.getStdId());
//	
//	  	}}

class Bhanu {
	   private String accountNumber;
//	    private double balance=0;

	    public Bhanu(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
//	        this.balance = balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

//	    public double getBalance() {
//	        return balance;
//	    }

//	    public void deposit(double amount) {
//	        balance += amount;
//	    }
//
//	    public void withdraw(double amount) {
//	        balance -= amount;
//	    }
	  }

//	  class SavingsAccount extends Bhanu {
//	      private double interestRate;
//
//	      double balance;
//	      public SavingsAccount(String accountNumber, double balance, double interestRate) {
//	          super(accountNumber, balance);
//	          this.interestRate = interestRate;
//	          this.balance=balance;
//	      }
//
//	      public double getInterestRate() {
//	          return interestRate;
//	      }
//
//	      public void deposit(double amount) {
//	          balance += amount;
//	          balance += (amount * interestRate);
//	          System.out.println("updaated :::"+balance);
//	      }
//
//	      public void withdraw(double amount) {
//	          balance -= amount;
//	      }
//	  }
//
//	  public class Encapsulation_p {
//		  public static void main(String[] args) {
//		        SavingsAccount account1 = new SavingsAccount("123456", 5000,2.0);
//		        System.out.println("Account number: " + account1.getAccountNumber());
////		        System.out.println("Balance: " + account1.getBalance());
//		        System.out.println("Interest rate: " + account1.getInterestRate());
//
////		        System.out.println("Updated balance: " + account1.getBalance());
//
//		     account1.deposit(1000);
//		  }
//	  }



