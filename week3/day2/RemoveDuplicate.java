package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String text="We learn java basics as part of java sessions in java week1";
		
		System.out.println(text);
		
		String[] split=text.split(" ");
		
		Set<String>text1=new LinkedHashSet<String>();
		
		for (int i=0; i<split.length; i++)
		{
		text1.add(split[i]);
		}
		
		System.out.println(text1);

	}

}
