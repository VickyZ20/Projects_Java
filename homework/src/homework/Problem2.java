package homework;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		String name1, name2, name3;
		int quantity1, quantity2, quantity3;
		double price1, price2, price3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name of item 1:");
		name1 = sc.nextLine();
		
		System.out.println("Input quantity of item 1:");
		quantity1 = sc.nextInt();
		
		System.out.println("Input price of item 1:");
		price1 = sc.nextDouble();
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input name of item 2:");
		name2 = sc1.nextLine();
		
		System.out.println("Input quantity of item 2:");
		quantity2 = sc1.nextInt();
		
		System.out.println("Input price of item 2:");
		price2 = sc1.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Input name of item 3:");
		name3 = sc3.nextLine();
		
		System.out.println("Input quantity of item 3:");
		quantity3 = sc3.nextInt();
		
		System.out.println("Input price of item 3:");
		price3 = sc3.nextDouble();
	
		
		double total1= quantity1 * price1;
		double total2= quantity2 * price2;
		double total3= quantity3 * price3;
		String s1 = "Item";
		String s2 = "Quantity";
		String s3 = "Price";
		String s4 = "Total";
		String s5 = "Subtotal";
		String s6 = "6.25 percent sales tax";

		double sub = total1 + total2 + total3;
		double tax = sub * 0.0625;
		double tol = sub + tax;
		
		System.out.println("Your bill:\n");
		System.out.printf("%-30s%-10s%-10s%-10s\n", s1, s2, s3, s4);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", name1, quantity1, price1, total1);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", name2, quantity2, price2, total2);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", name3, quantity3, price3, total3);
		System.out.printf("%-50s%.2f\n", s5, sub);
		System.out.printf("%-50s%.2f\n", s6, tax);
		System.out.printf("%-50s%.2f\n", s4, tol);
	}
}
