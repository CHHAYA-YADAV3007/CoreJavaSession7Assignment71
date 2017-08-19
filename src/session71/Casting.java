/**
 * Casting.java 1.1  19/08/2017
 */
//package declaration
package session71;
/**
 * This class will illustrate the program to convert an int variable to String using an inbuilt function of String class.
 * version 1.1 
 * Compiled on 19 Aug 2017
 * @author chhaya yadav
 *
 */
//class declaration 
public class Casting {
	
//main method declaration
	public static void main(String[] args) {

//integer variable declaration
		
		int a = 10 ;
		
		int b = 20 ;
		
//String variable declaration and assignment by valueof function which converts the int variable to String variable.
		
		String s1 = String.valueOf(a);
	
		String s2 = String.valueOf(b);
		
//display the String variable post the conversion from integer to string variable
		
		System.out.println("Integer converted to String :" +s1);
		
//display the String variable via inbuilt function valueOf from integer to String variable		
		
		System.out.println("Converting Integer to String  by inbuilt function valueOf :" + String.valueOf(b));
		
//display the concatenated String by + operator		
		
		System.out.println("String Concatenation by plus operator " + s1 + s2);
		
//display the valueOf function and + operator to display the variable conversion and String concatenation
		
		System.out.println("String Concatenation by plus operator and inbuillt function valueOf : " + String.valueOf(b) + String.valueOf(a));
		
	
		
		

	}

}
