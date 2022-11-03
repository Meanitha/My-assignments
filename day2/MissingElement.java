package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			int temp = i+1;
			
			if (arr[i]!=temp)
			{
				System.out.println("missing no is" + temp);
				break;
			}
		}

	}

}
