package week1.day2;

public class PostiveorNegative {

	public static void main(String[] args) 
	{
        
		int a=9;
		
		if (a>0)
		{
			System.out.println("the number "+a+" is postive");
		}
		else if(a<0)
		{
			System.out.println("the number " +a+" is negative");
		}
		else// (a==0)
			System.out.println("the number "+a +" is neither postive nor negative");
	}

}
