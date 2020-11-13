package homework;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Scanner;
	 
	
	public class Mainer {
		char ciphertext[]; 
		int key;
		char plaintext[]; 
		StringBuffer plaintextStr = new StringBuffer("");
		StringBuffer ciphertextStr = new StringBuffer("");
		final int max = 500; 
	 
		public static void main(String[] args) {
			Mainer m = new Mainer();
			 m.getPlaintext();
			 System.out.println("-- Enter E for Encryption, D for Decryption, X to exit: ");
			 Scanner sc = new Scanner(System.in);
			 String s1 = sc.nextLine();
			 if (s1.equals("E")) {
				 m.encryption();
			 } else if (s1.equals("D")) {
				 m.deciphering();
			 } else if (s1.equals("X")) {
				return;
			 }
//			 m.setKey();
//			 m.encryption();
//			 m.deciphering();
			 m.display();
		}
	 
		
		int setKey() {
			System.out.println("-- Enter key: ");
			while (true) {
				Scanner sc = new Scanner(System.in);
				try {
					key = sc.nextInt() % 26;
					return key;
				} catch (Exception e) {
					System.out.println("ERROR__");
				}
			}
		}
	 
	
		void getPlaintext() {
			plaintext = new char[max];
			for (int j = 0; j < max; j++) {
				plaintext[j] = '★'; 
			}
			int i = 0;
			char ch = ' ';
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("-- Enter the text below");
			try {
				ch=(char) bf.read();
				while(ch!='\r'&&ch!='\n'){
		    		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch==' '||ch==','||ch=='.'||ch=='!'){
		        		plaintext[i]=ch;
		        		i++;
		        	}
		    		else{
		    			System.out.println("-- Input not recognized. Try again.");
		    			break;
		    		}
		    		try{
		    			ch=(char) bf.read();
		    		}
		    		catch(Exception e1){
		    			
		    		}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
		
		void encryption() {
			ciphertext = new char[max];
			for (int j = 0; j < max; j++) {
				ciphertext[j] = '★'; 
			}
	 
			int temp = 0;
			for (int i = 0; i < plaintext.length; i++) {
				if (plaintext[i] != '★') {
					temp = plaintext[i] + key;
					if (plaintext[i] == ' ' || plaintext[i] == ',' || plaintext[i] == '.' || plaintext[i] == '!') {
						ciphertext[i] = (char) (plaintext[i]);
					}
					
					if (plaintext[i] >= 'a' && plaintext[i] <= 'z') {
						if (temp > 122)
							ciphertext[i] = (char) (97 + temp - 123);
						else {
							ciphertext[i] = (char) temp;
						}
					}
					if (plaintext[i] >= 'A' && plaintext[i] <= 'Z') {
						if ((plaintext[i] + key) > 90)
							ciphertext[i] = (char) (65 + temp - 91);
						else {
							ciphertext[i] = (char) temp;
						}
					}
					ciphertextStr.append(ciphertext[i]);
				} else {
					break;
				}
			}
		}
	 
		void deciphering() {
			char c = ' ';
			int temp = 0;
			for (int i = 0; i < ciphertext.length; i++) {
				temp = ciphertext[i] - key;
				if (ciphertext[i] != '★') {
					if (plaintext[i] == ' ' || plaintext[i] == ',' || plaintext[i] == '.' || plaintext[i] == '!') {
						c = (char) (ciphertext[i]);
					}
					if (ciphertext[i] >= 97 && ciphertext[i] <= 122) {
						c = (char) (temp);
						if (temp < 97) {
							c = (char) (26 + temp);
						}
					}
					if (ciphertext[i] >= 65 && ciphertext[i] <= 90) {
						c = (char) (temp);
						if (temp < 65) {
							c = (char) (26 + temp);
						}
					}
					plaintextStr.append(c);
				} else {
					break;
				}
			}
		}
	 
		
		void display() {
			System.out.println("compare:");
			System.out.println(  ciphertextStr);
			System.out.println( plaintextStr);
		}


}
