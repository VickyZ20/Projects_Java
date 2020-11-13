package homework;

public class Converter {
	private static double calculate(long a) {
		long GiB = 1024 * 1024 * 1024;
		long GB = 1000 * 1000 * 1000;
		double m = (double)GB / GiB;
		return a * m;
	}
	public static void main(String[] args) {
		long GB = 500;
		calculate(500);
		System.out.println(GB + "GB = " +  calculate(500) + " GiB");
		
	}
}
