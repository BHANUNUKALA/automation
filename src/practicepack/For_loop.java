package practicepack;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if else condition
		
		int time = 15;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
//		for loop
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
	} 
		System.out.println(" showing last two cars:");
		String[] brands = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 2; i < brands.length; i++) {
		  System.out.println(brands[i]);
		}
		System.out.println("showing only mazda");
		String[] brands1 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 3; i < brands.length; i++) {
		  System.out.println(brands1[i]);
		}
		System.out.println("reverse order ");
		for (int i = 3; 0<=i; i--) {
		  System.out.println(brands1[i]);
//		  https://formy-project.herokuapp.com/radiobutton
		}
}
}



