package week1.Ass1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String text = "madam";
	 int len=text.length();
	 String rev = "";
	 
	 for(int i=len-1;i>=0;i--)
	 {
		 rev=rev+text.charAt(i);
		 				 
	 }
	 if(rev.equals(text))
	 {
		 System.out.println("Palindrome");
	 }
	 else
	 {
		 System.out.println("Not a Palindrome");
	 }
	 
		
		
		
	}

}
