package week1.day1;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =13;
		boolean var=false;
		for(int i = 2;i<=(input/2);i++)
		{
			if(input%i==0)
			{
			
				var=true;
				break;
			}
			
		}	
		if(var==false)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not a Prime Number");
		}
	}

}
