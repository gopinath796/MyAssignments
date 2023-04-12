package day9_assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String str ="";
		String[] splitArray=text.split(" ");
		Set<String>str1=new LinkedHashSet<String>();
		for (String ac : splitArray) {
			str1.add(ac);
					
		}
		System.out.println("Set without Duplicates"+ " "+ str1);
		for (String str2 : str1) {
			str = str+" "+str2;
						
		}
		System.out.println("After Removal of Duplicate words:"+ str);
	
		
	}

}
