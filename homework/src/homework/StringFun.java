package homework;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringFun {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		String s1 ="hi";
		String s2 = "hello";
		System.out.println(s1 + s2);
		System.out.println(s1.length());
		System.out.println(s2.charAt(1));
		System.out.println(s2.substring(2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String a = "abcd";
		String b = "efghk";
		System.out.println(b.compareTo(a));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(a.indexOf('b'));
		
	}

}
