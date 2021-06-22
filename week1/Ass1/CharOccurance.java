package week1.Ass1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char search='e';
		int count=0;
		char ch[]=str.toCharArray();
		int len=ch.length;
		for(int i=0;i<len;i++)
		{
			if(search==(ch[i]))
			{
				count=count+1;
			}
	
		}
		System.out.println(count);
	

	}

}
