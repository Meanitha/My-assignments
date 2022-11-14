package week3.day1;

//import java.util.Arrays;

public class Palindrome 
  {
	public static void main(String[] args) {
		

	String value1 ="madam";
	
 String revstr="";
	

	char[]x=value1.toCharArray();
	
	
	for (int i=x.length-1; i>=0; i--)
	{
	 char rev = x[i];
	 revstr=revstr+rev;
	 System.out.println(revstr);
	
	
	}	

			
			if (revstr.equals(value1))
			{
				System.out.println("its a palindrome");
			}
			else
			{
				System.out.println("its not a palindome");
			}
	
	}
	}
	

