package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNo {

	public static void main(String[] args) {
		
				Integer[] data = {3,2,11,4,10,7};
				
			

				List<Integer> data1= new ArrayList<Integer>(Arrays.asList(data));
				
				Collections.sort(data1);
				
				System.out.println(data1);
				
				int i= data1.size()-2;
				System.out.println( "the second largest no. " +data1.get(i));
				
				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
	}

	}
