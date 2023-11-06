package Week3;

import java.util.Scanner;

public class ConditionalLogic {
	public static void main(String[] args) {
		
//		preAndPostDifference();
//		booleanLogicShortCircuitOps();
//		booleanBitwiseOps();
		compareStrings();
	}
	public static void ternaryOperator() {
		
	}
	public static void compareStrings() {
		Scanner sc = new Scanner (System.in);
		
		
//		System.out.print(("Enter s1:  "));
//		String s1 = sc.next();
//		
//		System.out.print(("Enter s2:  "));
//		String s2 = sc.next();
//		
//		System.out.println("Using == returns " + s1.equals(s2)); 
//
//		String name1 = "Sean";
//		String name2 = "Sean";
//		
//		System.out.println("Using == returns " + name1.equals(name2)); 
		
		String name3 = "John";
		String name4 = new String("John");	
		
		System.out.println("Using == returns " + name3 == name4);
	}
	public static void booleanBitwiseOps() {
		Scanner sc = new Scanner (System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print(("Enter num1:  "));
		num1 = sc.nextInt();
		
		System.out.print(("Enter num2:  "));
		num2 = sc.nextInt();
		{
		if(num1 < 0 & num2++ < 0){
			System.out.println("num2 is:  " + num2);
		}
		
		else if(num1 > 0 & num2++ > 0){	
			System.out.println("num2 is:  " + num2);
		}
		
		else if (num1 == 0 | num2++ == 0){
			System.out.println("num2 is:  " + num2);
		}
		
		else if (num1 < 0 | num2++ < 0){
			System.out.println("num2 is:  " + num2);
		}
	}	
		System.out.println("num1 is:  " + num1 +" num2 is:  " + num2);
	}
	public static void booleanLogicShortCircuitOps() {
		Scanner sc = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print(("Enter num1:  "));
		num1 = sc.nextInt();
		
		System.out.print(("Enter num2:  "));
		num2 = sc.nextInt();
		{
		if(num1 < 0 && num2++ < 0)
			System.out.println("num2 is:  " + num2);
		
		else if(num1 > 0 && num2++ > 0)		
			System.out.println("num2 is:  " + num2);
		
		else if (num1 == 0 || num2++ == 0)
			System.out.println("num2 is:  " + num2);
		
		else if (num1 < 0 || num2++ < 0)
			System.out.println("num2 is:  " + num2);
	}	
		System.out.println("num1 is:  " + num1 +" num2 is:  " + num2);
	}
	public static void preAndPostDifference() {
		int x = 5;
		int y = 10;
		
		System.out.println("The value of x is:    " + x); 
		System.out.println("The value of ++x is:  " + ++x);
		System.out.println("The value of x++ is:  " + x++);
		System.out.println("The value of x is:    " + x);
		
		System.out.println("The value of y is:    " + y);
		System.out.println("The value of ++y is:  " + ++y);
		System.out.println("The value of y++ is:  " + y++);
		System.out.println("The value of y is:    " + y);
		
		System.out.println("The value of x is:    " + x);
		System.out.println("The value of --x is:  " + --x);
		System.out.println("The value of x-- is:  " + x--);
		System.out.println("The value of x is:    " + x);
		
		System.out.println("The value of y is:    " + y);
		System.out.println("The value of --y is:  " + --y);
		System.out.println("The value of y-- is:  " + y--);
		System.out.println("The value of y is:    " + y);
	}
	public static boolean admitToFilm(int a, int b) {
		return false;
	}
}
