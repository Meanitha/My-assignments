package week3.day1;

public class ReverseName {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String name="Anitha";
		
		char[] rev = name.toCharArray();
		
		System.out.println(rev);
		
		//int length= name.length();
		
		for (int i=rev.length-1; i>=0; i--)
		{
		
		System.out.println(rev[i]);
		}
		
		
		
	}

}
