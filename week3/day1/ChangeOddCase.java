package week3.day1;

public class ChangeOddCase {

	public static void main(String[] args) {
		
		String a="changeme";
		
		char[] charArray=a.toCharArray();
		
		for(int i=0; i<charArray.length; i++)
		{
		 if (i%2==0)
		 {
			charArray[i]=Character.toUpperCase(charArray[i]);
		 }
		 System.out.print(charArray[i]);
		
	}
		}
	}


