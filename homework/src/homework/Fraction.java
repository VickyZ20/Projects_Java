package homework;

import java.util.Scanner;

class Frac {
    int numerator; 
    int denominator; 
	
    Frac(){
    }
 
    Frac(int a,int b){
        if(a == 0){
            numerator = 0;
            denominator = 1;
        }
        else{
            setNumeratorAndDenominator(a,b);
        }
    }
	
    void setNumeratorAndDenominator(int a, int b){  
        int c = f(Math.abs(a),Math.abs(b));        
        numerator = a / c;
        denominator = b / c;
        if(numerator<0 && denominator<0){
            numerator = - numerator;
            denominator = - denominator;
        }
    }
	
    int getNumerator(){
        return numerator;
    }
 
    int getDenominator(){
        return denominator;
    }
    
    int f(int a,int b){  // 求a和b的最大公约数
		if(a < b){
			int c = a;
			a = b;
			b = c;
		}
		int r = a % b;
		while(r != 0){
			a = b;
			b = r;;
			r = a % b;
		}
		return b;
	}

}

public class Fraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input your first fraction:");
        String data1 = input.next();

        System.out.println("input your second fraction:");
        String data2 = input.next();
			
        
        Fraction cal = new Fraction();
        System.out.println("The result is:" + data1+"," + data2);
       // cal.compute(data1, operation, data2);
        //	  }		
    }

} 