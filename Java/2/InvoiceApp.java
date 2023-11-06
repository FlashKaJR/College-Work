package SoftDev1;
import java.util.Scanner;
public class InvoiceApp {
	public static void main(String[] args) {
//		System.out.println (
//				"Welcome to the Invoice Total Calculator");
//		System.out.println();
//		
//		
//		Scanner sc = new Scanner (System.in);
//		System.out.print(("Enter subtotal:  "));
//		double subtotal = sc.nextDouble();
//		
//		
//		double discountPercent = .2;
//		double discountAmount = subtotal * discountPercent;
//		double invoiceTotal = subtotal - discountAmount;
//		
//		
//		
//		String message = "Discount percent: " +
//				discountPercent + "\n" +
//				"Discount amount: " +
//				discountAmount + "\n" +
//				"Invoice total:   " + invoiceTotal + "\n";
//		System.out.println(message);
//	}
//}
	System.out.println("Welcome to the Invoice Total Calculator");
	System.out.println();
	
	Scanner sc = new Scanner(System.in);
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter subtotal:   ");
		double subtotal = sc.nextDouble();
		double discountPercent = 0.0;
		if (subtotal >= 200)
			discountPercent = .2;
		else if (subtotal >= 100)
            discountPercent = .1;
        else
            discountPercent = 0.0;

        double discountAmount = 
            subtotal * discountPercent;
        double total = subtotal - discountAmount;

        String message = "Discount percent: "
                       + discountPercent + "\n"
                       + "Discount amount:  "
                       + discountAmount + "\n"
                       + "Invoice total:    "
                       + total + "\n";
        System.out.println(message);
        System.out.print("Continue? (y/n): ");
        choice = sc.next();
        System.out.println();
		}
	}
}


