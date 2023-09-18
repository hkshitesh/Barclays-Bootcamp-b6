package mypkg;

public class MyCalculator {
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) {

		MyCalculator ob = new MyCalculator();
		System.out.println("The sum is :"+ob.sum(20, 30));
	}
}
