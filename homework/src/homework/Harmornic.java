package homework;

import java.util.Scanner;

public class Harmornic {
	
	private static double sum(int n) {
		double res = 0;
		for (int i = 1; i <= n; i++) {
			res += 1.0 / i;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		System.out.println("-- Enter n:");
		while(true) {
			Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			System.out.println(sum(a));
		} catch (Exception e) {
			System.out.println("Enter again:");
		}
		
	}
  }
}
