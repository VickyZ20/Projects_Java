package homework;

import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}

}
