package day9_assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "Thala Dhooni";
		String empty = "";
		char[] nameArray= name.toCharArray();
		Set<Character>unique=new LinkedHashSet<Character>();
		for (Character Char : nameArray) {
			unique.add(Char);
					
		}
		System.out.println("Set without Duplicates"+ " "+ name);
		for (Character Char : unique) {
			empty=empty+Char;
						
		}
		System.out.println("After Removal of Duplicate words:"+empty);

	}

}
