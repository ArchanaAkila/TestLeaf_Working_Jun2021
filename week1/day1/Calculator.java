package week1.day1;

public class Calculator {

	
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
		
	}
	public double sub(int a, int b)
	{
		double c = a-b;
		return c;
		
	}
	public double multiply(int a, int b)
	{
		double c = a*b;
		return c;
		
	}
	public int division(int a, int b)
	{
		int c = a/b;
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator val=new Calculator();
		
		System.out.println(val.add(10, 30));
		System.out.println(val.sub(30, 20));
		System.out.println(val.multiply(10, 30));
		System.out.println(val.division(30,10));
		
	}

}
