package week1.day1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input =153;
		int calculated=0;
		int rem,original ;
		original=input;
		while(input>0)
		{
			rem=input%10;
			input=input/10;
			calculated=calculated+(rem*rem*rem);
					
		}
		if(original==calculated)
		{
			System.out.println("It is Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
	
	
			

	}

}
