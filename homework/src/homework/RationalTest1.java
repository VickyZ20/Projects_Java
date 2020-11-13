package homework;

public class RationalTest1 {
	public static void main(String[] args) {
		Rational1 r = new Rational1(4, 6);
		Rational1 t = new Rational1(2);
		System.out.println(t);
		//Rational1 res = t.divide(r);
		Rational1 res = t.multiply(r);
		System.out.println(res + "res is");
		System.out.println(r);
		
		Line1 l = new Line1(new Rational1(2, 5), new Rational1(1,3));
		System.out.println(l.toString());
		boolean test = l.includes(new Rational1(2), new Rational1(1,2));
		System.out.println(test);
		
		Rational1 slope = new Rational1(-2);
		System.out.println(slope + "is s");
		Rational1 intercept = new Rational1(0);
		System.out.println(intercept + " inter");
		Line1 l3 = new Line1(slope, intercept);
		System.out.println(l3);
		boolean a = l3.includes(new Rational1(0), new Rational1(1));
		boolean b = l3.includes(new Rational1(-2), new Rational1(4));
		Rational1 x = slope.multiply(new Rational1(-2)).add(new Rational1(0));
		//System.out.println(x);
		//System.out.println(a + "a");
		System.out.println(b + "is b");
		System.out.println(l.equals(l3));
		
		slope = new Rational1(5);
		intercept = new Rational1(-5);
		Line1 l4 = new Line1(slope, intercept);
		boolean y = l4.includes(new Rational1(0), new Rational1(5));
		boolean w =l4.includes(new Rational1(1), new Rational1(0));
		System.out.println(y + "y");
		System.out.println(w + "w");
		System.out.println(l4.equals(l4));
		
		slope = new Rational1(0);
	    intercept = new Rational1(12);
		Line1 l5 = new Line1(slope, intercept);
		System.out.println(l5.toString() + "l5");
		boolean z = l5.includes(new Rational1(0), new Rational1(0)) ; 
		boolean v =l5.includes(new Rational1(-100), new Rational1(12)) ;
		System.out.println(z + "z");
		System.out.println(v);

	}
}


class Line1 {
	public Line1(Rational1 slope, Rational1 intercept) {
		this.setSlope(slope);
		this.setIntercept(intercept);
		
	}
	
	private Rational1 slope;
	private Rational1 intercept;
	
	public Rational1 getSlope() {
		return new Rational1(slope.getNumerator(), slope.getDenominator());
	}
	
	public void setSlope(Rational1 slope) {
		if (slope == null) {
			System.exit(1);
		} else {
			this.slope = slope;
		}
	}
	
	
	public Rational1 getIntercept() {
		return new Rational1(intercept.getNumerator(), intercept.getDenominator());
	}
	
	public void setIntercept(Rational1 intercept) {
		if (intercept == null) {
			System.exit(1);
		} else {
			this.intercept = intercept;
		}
	}
	
	public boolean includes(Rational1 a, Rational1 b) {
		Rational1 x = slope.multiply(a).add(intercept);
		
		if (a == null || b == null) {
			return false;
			
		} else if (x.equals(b)) {
			return true;
		}
		return false;
	}
	

	
	public String toString() {
		return "y = " + slope + " * x" +" + " + intercept;
	}
	
	public boolean equals(Line1 line) {
		if (line == null) {
			return false;
		} else if ((this.slope == line.slope) && (this.intercept == line.intercept)) {
			return true;
		}
		return false;
	}
}





class Rational1 {
	
	public Rational1(int numerator, int denominator) {
		this.setNumerator(numerator);
		this.setDenominator(denominator);
	 }
	
	public Rational1(int whole) {
	    this(whole, 1);
	}
	
	public Rational1() {
		this(0);
	}
	
	private int numerator;
	private int denominator;
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator =numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void normalize() {
		if (denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}
		if (numerator != 0) {
			int c = gcd(numerator, denominator);
			numerator /= c;
			denominator /= c;
		}
	}
	
	private int gcd(int a, int b) {
		return b == 0? a : gcd(b, a % b);
	}
	
	
	
	public String toString() {
		normalize();
		return this.numerator + ((this.denominator == 1)? "" : "/" + this.denominator);
	}
	
	 public boolean equals(Rational1 other) {

	        if (other == null) {
	        	return false;
	        } else if ((this.numerator == other.numerator) 
	        		&& (this.denominator == other.denominator)) {
	        	return true;
	        }
	        return false;
	        	
	        
	    }

	
	public Rational1 add(Rational1 b) {
		if (b == null) {
			System.exit(-1);
		}
		int commonDen = denominator * b.getDenominator();
		int num1 = numerator * b.getDenominator();
		int num2 = b.getNumerator() * denominator;
		int sum = num1 + num2;
		return new Rational1(sum, commonDen);
	}
	public Rational1 subtract(Rational1 b) {
		if (b == null) {
			System.exit(-1);
		}
		int commonDen = denominator * b.getDenominator();
		int num1 = numerator * b.getDenominator();
		int num2 = denominator * b.getNumerator();
		int diff = num1 - num2;
		return new Rational1(diff, commonDen);
	}
	
	public Rational1 multiply(Rational1 b) {
		if (b == null) {
			System.exit(-1);
		}
		int numerator = this.numerator * b.getNumerator();
		int denominator = this.denominator * b.getDenominator();
		return new Rational1(numerator, denominator);
	}
	
	public Rational1 divide(Rational1 b) {
		if (b == null) {
			System.exit(-1);
		}
		return multiply(new Rational1(b.getDenominator(), b.getNumerator()));
	}

}


