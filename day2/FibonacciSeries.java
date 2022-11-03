package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{/*
		 * Goal: To find Fibonacci Series for a given range
		 * 
		 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		 
		 */
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

				// Print first number
				
				// Iterate from 1 to the range
				
				// add first and second number assign to sum

				// Assign second number to the first number

				// Assign sum to the second number
				
				// print sum
		
    int  range = 8; 
    int firstNum = 0; 
    int secNum = 1, sum ;
    for(int i=0;i<range;i++)
    {
    	
    	sum=firstNum+secNum;
    	System.out.println(sum);
    	secNum=sum;
    	
    	sum=secNum;
    	firstNum= secNum;
    	
    }
    
	
	}

}
