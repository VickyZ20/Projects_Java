package homework;

//Person class

class Person {
 public Person(double height, int age) {
     this.setHeight(height);
     this.setAge(age);
 }

 // default constructor
 public Person() {
     this(0, 0);
 }

 private double height;
 private int age;

 public int getAge() {
     return age;
 }

 
 // setAge(int)
 public boolean setAge(int age) {
     if (age > 0) {
         this.age = age;
         return true;
     }
     return false;
 }

 // setAge(double)
 public boolean setAge(double age) {
     return setAge((int) age);
 }

 public double getHeight() {
     return height;
 }

 public void setHeight(double h) {
     if (h < 0) {
         System.out.println("Error, invalid height");
     }
     height = h;
 }

 public double multiply(double x, double y) {
     x++;
     y++;
     return x * y;
 }

 public boolean equals(Person other) {
     return this.age == other.age && this.height == other.height;
 }

 public String toString() {
     return "Person is of age " + this.age + ", and of height " + this.height;
 }
}

public class PersonTest {
 public static void main(String[] args) {
     Person p;
     p = new Person(44,-3);
     System.out.println(p);

     Person q = new Person();
     System.out.println(q);

     System.out.println(p.equals(q));
     // System.out.println("age is " + p.getAge());

     // {
     //     int x = 22;
     //     System.out.println("x is " + x);
     // }

     // double a = 2;
     // double b = 3;
     // double res = p.multiply(a, b);
     // System.out.println("a = " + a + ", b = " + b);
     // System.out.println("res is " + res);
  }
}