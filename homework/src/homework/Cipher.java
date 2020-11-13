package homework;

import java.util.Scanner;

public class Cipher {
	static int k;
	public static String CaesarEncript(String origin) {

        String encripted = "";

        char[] charArray = origin.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

           if(charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) ((charArray[i] - 'a' + k ) % 26 + 'a');

             } else if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
            	 charArray[i] = (char) ((charArray[i] - 'A' + k ) % 26 + 'A');
            }
            encripted+=charArray[i];
        }
	
        return encripted;
    }
	public static String  CaesarDecript(String encripted) {

        String decripted = "";

        char[] charArray = encripted.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if(charArray[i] >= 'a' && charArray[i] <= 'z') {
               // charArray[i] = (char) ('z'-('z'+k-charArray[i])%26);
            	charArray[i] = (char) ((charArray[i]- 'a' - k)%26 + 'a');
            } else if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
            	 charArray[i] = (char) ('Z'-('Z'+k-charArray[i])%26);
            }
            decripted+=charArray[i];
        }

        return decripted;
    }
	int setKey() {
		System.out.println("-- Enter key: ");
		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				k = sc.nextInt() % 26;
				return k;
			} catch (Exception e) {
				System.out.println("ERROR__");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Cipher c = new Cipher();
		System.out.println("-- Enter the text: ");
		Scanner s = new Scanner(System.in);
		String ss = s.nextLine();
		System.out.println("-- Enter E for Encryption, D for Decryption, X to exit: ");
		 String s1 = s.nextLine();
		 c.setKey();
		 if (s1.equals("E")) {
			 System.out.println("The encrypted text is : " + c.CaesarEncript(ss));
		 } else if (s1.equals("D")) {
			 System.out.println("The decrypted text is : " + c.CaesarDecript(ss));
		 } else if (s.equals("X")) {
			return;
		 } else {
			 System.out.println("Try again.");
		 }
	}

}
