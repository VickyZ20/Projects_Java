package homework;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date(4, 3, 2019);
		Date e = new Date(1, 1, 2019);
		System.out.println("day of d is : " + d.getDay());
		System.out.println(d);
		//System.out.println(Date.monthString(2));
		
		People p = new People("Mary", d, null);
		People q = new People(p);
		//System.out.println("line 13:" + q);
		//p.setName("alice");
		q.setName("alice");
		//System.out.println("line 16" + p);
		//System.out.println("line 17" + q);
		//System.out.println(p.getName());
		System.out.println(d + "19");
		d.setMonth(1);
		System.out.println(p.getBorn());
	}
}



class People {
	public People(String name, Date born, Date died) {
		this.name = name;
		this.born = new Date(born.getMonth(), born.getDay(), born.getYear());
		//this.born = born;
		if (died == null) {
			this.died = null;
		} else {
			this.died = new Date(died.getMonth(), died.getDay(), died.getYear());
		}
	}
	public People(People other) {
		this(other.name, other.born, other.died);
	}
	
	private String name;
	private Date born;
	private Date died;
	
	public String getName() {
		return this.name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	
	public Date getBorn() {
		return new Date(born);
	}
	
	public Date getDied() {
		if (died == null) {
			return null;
		}
		return new Date(died);
	}
	
	public String toString() {
		return getName() + getBorn() + getDied();
	}
}


class Date {
	
	public Date(int month, int day, int year) {
		if (dayCheck(month, day, year) == true) {
			
			this.month = month;
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Error: invalid date.");
			System.exit(1);
		}
	}
	
	public Date(Date other) {
		this(other.month, other.day, other.year);
	}
	
	private int day;
	private int month;
	private int year;
	public final static int MIN_YEAR = 1900;
	
	public int getDay() {
		return this.day;
	}
	public boolean setDay(int day) {
		if (dayCheck(month, day, year) == true) {
			this.day = day;
			return true;
		}
		return false;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public boolean setMonth(int month) {
		if (dayCheck(month, day, year) == true) {
			this.month = month;
			return true;
		}
		return false;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean setYear(int year) {
		if (dayCheck(month, day, year) == true) {
			this.year = year;
			return true;
		}
		return false;
	}
	
	public boolean dayCheck(int month, int day, int year) {
		//String name = null;
		//int number_of_days = 0;
		switch(month) {
		case 1 :
			//name = "January";
			if (day <= 31) return true;
			break;
			
		case 2 :
			//name = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				if (day <= 29) return true;
			} else {
				if (day <= 28) return true;
			}
			break;
			
			
		case 3 :
			//name = "March";
			if (day <= 31) return true;
			break;
			
		case 4 :
			//name = "April";
			if (day <= 30) return true;
			break;
			
			
		case 5:
			//name = "May";
			if (day <= 31) return true;
			
			break;
		case 6:
			//name = "June";
			if (day <= 30) return true;
			break;
			
		case 7:
			//name = "July";
			if (day <= 31) return true;
			break;
		case 8:
			//name = "August";
			if (day <= 31) return true;
			break;
		case 9 :
			//name = "September";
			if (day <= 30) return true;			
			break;
		case 10:
			//name = "October";
			if (day <= 31) return true;
			break;
			
		case 11:
			//name = "November";
			if (day <= 30) return true;
			break;
		case 12 :
			//name = "December";
			if (day <= 31) return true;
			break;
			
			default:
				day = 0;
				break;
					
			
		}
		
		return false;
		
	}
	
	public String toString() {
		return getMonth() + "/" + getDay() +"/" + getYear();
	}
	
	public boolean equals(Date others) {
		if (this.month == others.month 
				&& this.day == others.day 
				&& this.year == others.year) {
			return true;
		}
		return false;
	}
	
	public static String monthString(int m) {
		String str;
		switch(m) {
			case 1:
				str = "Jan";
				break;
			case 2:
				str = "Feb";
				break;
				default:
					str = "ERR";
					break;
		}
		return str;
	}
}

