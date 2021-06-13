package week1.day1;

public class Mobile {
	public String mobileModel="Samsung";
	public int mobileWeight=5;
	public boolean isFullcharge=true;
	public double mobileCost =6000.67;

	public void makecall()
	{
		System.out.println("Make a call");
	}
	
	public void sendmsg()
	{
		System.out.println("Send Message");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Mobile action = new Mobile();
		 action.makecall();
		 action.sendmsg();
		 System.out.println(action.mobileModel);
		 System.out.println(action.mobileWeight);
		 System.out.println(action.isFullcharge);
		 System.out.println(action.mobileCost);
	}

}
