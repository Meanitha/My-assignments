package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
                 String input1="god";
                 String input2="dog";
                 
 char[]x=input1.toCharArray();
 char[] y=input2.toCharArray();
 
 Arrays.sort(x);
 Arrays.sort(y);
 
 if(Arrays.equals(x,y))
 {
	 System.out.println("its an Anagram");
 }
 else
 {
	 System.out.println("it is not an anagram");
 }
 
	
	}

}
