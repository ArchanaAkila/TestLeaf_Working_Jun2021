package javaAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		int len1=text1.length();
		int len2=text2.length();
		if(len1==len2)
		{
			char ch1[]=text1.toCharArray();
			char ch2[]=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("It is an Anagram ");
			}
			else
			{
				System.out.println("Not an Anagram");
			}
		}
				
	}
}
	