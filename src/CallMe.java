
public class CallMe 
{

	public static void main(String[] args)
	{
		final int numberOfCalls = 10;
		callMe(numberOfCalls);
		

	}
	
	private static void callMe(int numberOfCalls)
	{
		if(numberOfCalls <= 0) 
		{
			return;
		}
		System.out.println("Don't call me " + numberOfCalls);
		callMe(--numberOfCalls);
		System.out.println("Don't call me " + numberOfCalls);
	}

}
