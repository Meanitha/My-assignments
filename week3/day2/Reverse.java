package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] color= {"Red","Green","Blue","Yellow","Brown"};
		
		List<String>lst = new ArrayList<String>(Arrays.asList(color));
		
		System.out.println("the given string  "+lst);
		
			Collections.reverse(lst);
		System.out.println("Reversed list   "+lst);

	}}
