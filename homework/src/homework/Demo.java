package homework;

public class Demo {
	public static void main(String[] args) {
		String s1 = "abc";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println((char)(ch[i]- 'a'));
		}
	}
}
