package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=6;
		boolean flag=false;
		
		for(int i=2;i<n/2;i++)
		{
			if(n%2==0)
			{
			flag=true;
			break;
			}
		}	
  if (!flag)
  {
	  System.out.println("it is a prime number");
  }
  else
  { 
	  System.out.println("it is not a prime number");
  }
	}

}
