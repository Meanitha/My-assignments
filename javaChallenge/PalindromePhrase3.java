package javaChallenge;

public class PalindromePhrase3 {

	public static void main(String[] args) {
		String text="A man, a plan,a canal:Panama";
		
		System.out.println("given string : "+text);
		
		String text1=text.toLowerCase();
		
		String text2=text1.replaceAll("[^a-z]", "");
		
		System.out.println("replaced string : "+text2);
		
		String revstr="";
		
		char[]x=text2.toCharArray();
			
		for (int i=x.length-1; i>=0; i--)
			
			{
			 char rev = x[i];
			 revstr=revstr+rev;
			// System.out.println(revstr);
			
			
			}	

			if (revstr.equals(text2))
					{
						System.out.println("its a palindrome");
					}
			else
					{
						System.out.println("its not a palindome");
					}
		

	}

}
