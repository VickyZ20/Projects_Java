package homework;

class Country {
	String name;
	int population;
	int seniority;
	private static int NumberOfCountries = 0;
	
	public Country(String name, int population) {
		this.name = name;
		this.population = population;
		NumberOfCountries++;
		this.seniority = NumberOfCountries;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public int getSeniority() {
		return this.seniority;
	}
	
	
	public int getNumberofCountries() {
		return NumberOfCountries;
	}
}

public class CountryTest {
	public static void main(String[] args) {
		Country c = new Country("A", 1000);
		Country c2 = new Country("B", 500);
		Country c3 = new Country("C", 2000);
		System.out.println(c.getNumberofCountries());
		System.out.println(c2.getSeniority());
		
	}
}
