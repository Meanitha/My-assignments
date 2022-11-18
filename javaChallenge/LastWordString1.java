package javaChallenge;

public class LastWordString1 {

	public static void main(String[] args) {
		
		String text=" fly me to moon";
		
		System.out.println("the given text = " + text);
		
		String text1[]= text.split(" ");
		
		int i= text1.length-1;
	
		System.out.println(" the last word is "+text1[i]);
		
		String last=text1[i];
		
		int lastSize=last.length();
		
		System.out.println("the length of the last string is  "+lastSize);
			
		
	}


}
