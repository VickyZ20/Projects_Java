package homework;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt();
		System.out.println("Enter the x-value of the first point :" + x1);
		y1 = sc.nextInt();
		System.out.println("Enter the y-value of the first point :" + y1);
		x2 = sc.nextInt();
		System.out.println("Enter the x-value of the second point :" + x2);
		y2 = sc.nextInt();
		System.out.println("Enter the y-value of the second point :" + x2);
		if (x1 == x2) {
			System.out.println("The line is vertical !");
		}
		double slope = (double)(y2 - y1) / (x2 - x1);
		System.out.println("The slope of the line is :" + slope);
	}
}
   