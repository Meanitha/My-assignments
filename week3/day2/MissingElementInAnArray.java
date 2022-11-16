package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
	
				Integer[] arr = {1,2,3,4,7,6,8};
			
				
				List<Integer> arr1 = new ArrayList<Integer>();
				
				
				Collections.sort(arr1);
				
				for(int i=0; i<arr.length;i++)
				{
				int miss=i+1;
				
				if (arr[i]!=miss)
				{
					System.out.println("the missing no is "+miss);
					
					break;
				}
				

				
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
						
	}

}}
