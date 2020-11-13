package homework;

class Container {
	
	// constructor
	public Container(double maxCapacity, double quantityOfLiquid) {
		this.setCapacity(maxCapacity);
		this.setQuantity(quantityOfLiquid);
	}
	
	//variables
	private double maxCapacity;
	private double quantityOfLiquid;
	
	//get()
	public double getCapacity() {
		return maxCapacity;
	}
	
	//set()
	public void setCapacity(double maxCapacity) {
		if (maxCapacity <= 0) {
			System.exit(1);
		}
		this.maxCapacity = maxCapacity;
	}
	
	public double getQuantity() {
		return quantity(quantityOfLiquid);
	}
	
	public void setQuantity(double quantityOfLiquid) {
		if (quantityOfLiquid < 0 || quantityOfLiquid > maxCapacity) {
			System.exit(1);
		}
		this.quantityOfLiquid = quantityOfLiquid;
	}
	
	//return the current quantity of liquid
	public double quantity(double quantityOfLiquid) {
		return quantityOfLiquid;
	}
	
	//show how much space the container has left
	public double leftOver() {
		return  maxCapacity - quantityOfLiquid;
	}
	
	//fill the container
	public double full() {
		return this.quantityOfLiquid = this.maxCapacity;
	}
	
	//empty the container
	public double empty() {
		return this.quantityOfLiquid = 0.0;
	}
	
	public void transfer(Container c, double amount) {
		//corner case
		if (amount > c.quantityOfLiquid) {
			System.out.println("Error");
		} 
		
		double liter1 = c.getQuantity() - amount;
		
		//update container c's quantity
		c.quantityOfLiquid = liter1;
		
		double liter2 = quantityOfLiquid + amount;
		if (liter2 > maxCapacity) {
			System.out.println("Error");
		} else {
			//update the container who calls transfer()'s quantity
		  quantityOfLiquid = liter2;
		}
		System.out.println(liter1);
		System.out.println(new Container(maxCapacity, liter2));
//		double s = c.getQuantity() - amount;
//		c.quantityOfLiquid = s;
//		
//		Container a = new Container(maxCapacity, quantityOfLiquid);
//		//a.transfer(c, amount);
//		a.quantityOfLiquid += s;
//		
//		System.out.println(s);
		
		
		}
	
	public String displayQuantity() {
		return "The current quantity is " + getQuantity() + "liters";
	}
	
	public String toString() {
		return "(" + maxCapacity + ", " + quantityOfLiquid + ")";
	}
}


//For testing part, because using differnt data to test, have to comment par of them out
// in order to test other cases.
public class ContainerTest {
	public static void main(String[] args) {
		Container c1 = new Container(100, 50);
		Container c2 = new Container(200, 150);
		//Container c3 = new Container(-2.93, -2);
		//System.out.println(c3);
		//c1.setCapacity(200);
		//System.out.println(c1.toString());
		//System.out.println(c2.leftOver());
		//System.out.println(c1.empty());
		//c1.transfer(c2, 300);
		//System.out.println(c1.leftOver());
		//System.out.println(c1);
		//System.out.println(c2.displayQuantity());
		c1.transfer(c2, 30);
		System.out.println(c1);
		System.out.println(c2.leftOver());
		System.out.println(c2.full());
		System.out.println(c2);
		System.out.println(c2.empty());
		System.out.println(c2);
		System.out.println(c2.getQuantity());
		c2.transfer(c1, 10);
		System.out.println(c2.getQuantity());
		System.out.println(c1.getQuantity());
	
		System.out.println(c1.getQuantity());
//		System.out.println(c1.displayQuantity());
//		System.out.println(c1.full());
		
	}

}
