package javaAssignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int len=arr.length;
		for(int i=1;i<len;i++)
		{
			if(i!=arr[i])
			{
				System.out.println("Missing Element is " +i);
				continue;
			}
		}
		
	}

}
