package javamethods;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "BHANU";
		String myStr = "Bhanu";
		String myStr1 = "Bhanu";
		String myStr2 = "bhanu";
		String myStr3 = "nukala";
		char[] sport = {'c', 'r', 'i', 'c', 'k','e','t'};
		String sport1 = " ";
		String food ="chichen biryani";
		String love="    myself     ";
		
		
//		charAt
		 System.out.println("charAt");
		char result = myStr.charAt(0);
		System.out.println(result);
//		codePointAt
		 System.out.println("codePointAt");
		int result1 = myStr.codePointAt(0);
		System.out.println(result1);
//		codePointBefore
		 System.out.println("codePointBefore");
		int result2 = myStr.codePointBefore(1);
	    System.out.println(result2);
	    
//	    compareTo
	    System.out.println("comapareTo");
	    System.out.println(myStr.compareTo(myStr1));
	    
//	    compareToIgnorecase
	    System.out.println("compareToIgnoreCase");
	    System.out.println(myStr1.compareToIgnoreCase(myStr2));
	    
//	    concat
	    System.out.println("concat");
	    System.out.println(myStr.concat(myStr3));
	    
//	    contains
	    System.out.println("contains");
	    System.out.println(myStr.contains("han"));
	    
//	    contentEquals
	    System.out.println("contentEquals");
	    System.out.println(myStr.contentEquals("Bhanu"));
	    System.out.println(myStr.contentEquals("hanu"));
	    
//	    copyValueOf
	    System.out.println("copyValueOf");
	    sport1 = sport1.copyValueOf(sport,0,7);
	    System.out.println("Returned String: " + sport1);
	    
//	    endsWith
	    System.out.println("endsWith");
	    System.out.println(myStr.endsWith("Bha"));   // false
	    System.out.println(myStr.endsWith("hanu"));   // true
	    System.out.println(myStr.endsWith("u"));     // true
	    
//	    equals
	    System.out.println("equals");
	    System.out.println(myStr.equals(myStr1));
	    
//	    equalsIgnoreCase
	    System.out.println("equalsIgnoreCase");
	    System.out.println(name.equalsIgnoreCase(myStr2)); // true
	    System.out.println(name.equalsIgnoreCase(myStr3)); // false
	    
//	    hash code
	    System.out.println("hash code");
	    System.out.println(myStr.hashCode());
	    
//	    indexOf
	    System.out.println("indexOf");
	    System.out.println(myStr.indexOf("nu"));
	    
//	    isEmpty
	    System.out.println("isEmpty");
	    System.out.println(myStr1.isEmpty());
	    System.out.println(sport1.isEmpty());
	    
//	    lastIndexOf
	    System.out.println("lastIndexOf");
	    System.out.println(food.lastIndexOf("biryani"));
	    
//	    length
	    System.out.println("length");
	    System.out.println(food.length());
	    
//	    replace
	    System.out.println("replace");
	    System.out.println(myStr.replace('B', 'D'));
	    
//	    split
	    System.out.println("split");
	    System.out.println(food.split("\\s"));
	    
//	    startsWith
	    System.out.println("startsWith");
	    System.out.println(myStr.startsWith("Bha"));   
	    System.out.println(myStr.startsWith("nu"));
	    
//	    toLowerCase
	    System.out.println(food.toUpperCase());
	    System.out.println(food.toLowerCase());
	    
//	    trim
	    System.out.println(love);
	    System.out.println(love.trim()); 
	    
	}

}
