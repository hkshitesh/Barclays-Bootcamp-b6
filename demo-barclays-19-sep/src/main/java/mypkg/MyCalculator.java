package mypkg;

public class MyCalculator {
	public int sum(int a , int b)
	{
		return (a+b);		
	}
	public int diff(int a, int b)
	{
		return (a-b);
	}
	
	public String getFirstName()
	{
		return "Hitesh";		
	}

	public static void main(String[] args) {		
		MyCalculator ob = new MyCalculator();		
		System.out.println("Sum is :"+ob.sum(20, 10));
		System.out.println("Diff is :"+ob.diff(20, 10));
	}
}
