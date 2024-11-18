//A-2 Ques8

// Java program to demonstrate
// method Hiding in java

// Base Class
class Complex {
	public static void f1()
	{
		System.out.println(
			"f1 method of the Complex class is executed.");
	}
}

// class child extend Demo class
class Sample extends Complex {
	public static void f1()
	{
		System.out.println(
			"f1 of the Sample class is executed.");
	}
}
public class Main {

	public static void main(String args[])
	{
		Complex d1 = new Complex();


		Complex d2 = new Sample();

		d1.f1();
		d2.f1();
	}
}
