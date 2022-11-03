package week1.day2;

public class Palindrome {
 
	  
	public static void main(String[] args) 
	{
		int num=36363;
		int revNo=0;
		int rem;
		int temp=num;
		
		while( num!=0)
			   
		{
			rem=num%10;
			revNo= (revNo*10)+rem;
			num=num/10;
		}
		
		if(temp==revNo)
		{
			System.out.println("the number "+temp+" is a palindrome");
		}
		else 
		{
	
			System.out.println("the number "+ temp+"is not a palindrome");
		}
	}

}
