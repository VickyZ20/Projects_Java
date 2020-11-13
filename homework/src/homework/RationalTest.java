package homework;

class Line {
	public Line(Rational r1, Rational r2) {
		
	}
	
	private Rational slope;
	private Rational intercept;
	
	public Rational getSlope() {
		return new Rational(slope.getNumerator(), slope.getDenominator());
	}
	
	public void setSlope(Rational slople) {
		this.slope = slope;
	}
}


class Rational {
	private int numerator;
	private int denominator;
	
//	public Rational(int numerator, int denominator) {
//		normalize(this.numerator, this.denominator);
//		
//	}
	
	public Rational (int numer, int denom)
	   {
	      if (denom == 0)
	         denom = 1;
	      	

	      // Make the numerator "store" the sign
	      if (denom < 0)
	      {
	         numer = numer * -1;
	         denom = denom * -1;
	      }

	      numerator = numer;
	      denominator = denom;

	      reduce();
	   }
	
	public Rational(int whole) {
		this(whole,1);
	}
	
	public Rational() {
		this(0, 0);
	}
	
	public int getNumerator() {
		return numerator;
	}
//	public boolean setNumerator(int numerator) {
//		if (normalize(numerator, denominator) == true) {
//			this.numerator = numerator;
//			return true;
//		}
//		return false;
//	}
	public int getDenominator() {
		return denominator;
	}
	
//	public boolean setDenominator(int denominator) {
//		if (normalize(numerator, denominator) == true) {
//			this.denominator = denominator;
//			return true;
//		}
//		return false;
//	}
	
//	private void normalize(int numer, int denom) {
//		if(denom == 0) {
//			denom = 1;
//			//return true;
//		}
//		if (denom < 0) {
//			numer *= -1;
//			denom *= -1;
//			//return true;
//		}
//		reduce();
//		//return true;
//	}
	
	private void reduce() {
		if (numerator != 0) {
			int common = gcd(Math.abs(numerator), denominator);
			numerator /= common;
			denominator /= common;
		}
	}
	
	private int gcd(int a, int b) {
		return b == 0? a : gcd(b, a% b);
	}
	
	public boolean equals(Rational others) {
		return (numerator == others.getNumerator() 
				&& denominator == others.getDenominator());
	}
	
	public String toString() {
		String result;
		if (numerator == 0) {
			result = "0";
		} else if (denominator == 1) {
			result = numerator +  "";
		} else {
			result = numerator + "/" + denominator;
		}
		return result;
	}
	
	public Rational reciprocal() {
		return new Rational(denominator, numerator);
	}
	
	public Rational add(Rational b) {
		if (b == null) {
			System.exit(-1);
		}
		int commonDenom = denominator * b.getDenominator();
		int num1 = numerator * b.getDenominator();
		int num2 = b.getNumerator() * denominator;
		int sum = num1 + num2;
		return new Rational(sum, commonDenom);
	}
	
	public Rational subtract(Rational b) {
		int commonDenom = denominator * b.getDenominator();
		int num1 = numerator * b.getDenominator();
		int num2 = denominator * b.getNumerator();
		int diff = num1 - num2;
		return new Rational(diff, commonDenom);
	}
	
	public Rational multiply(Rational b) {
		int numer = numerator * b.getNumerator();
		int denom = denominator * b.getDenominator();
		return new Rational(numer, denom);
	}
	
	public Rational divide(Rational b) {
		return multiply(b.reciprocal());
	}
}

public class RationalTest {
	public static void main(String[] args) {
		Rational x, y, z;
		x = new Rational(2);
		y = new Rational(1, 3);
		z = x.multiply(y);
		System.out.println(x);
		
	 
		
	}
}
