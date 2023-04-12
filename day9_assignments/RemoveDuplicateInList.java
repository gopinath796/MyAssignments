package day9_assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInList {

	public static void main(String[] args) {
		String str = "PayPal India";
		char ch[] = str.toCharArray();
		List<Character> lsname = new ArrayList<Character>();
		for (Character c : ch) {
			lsname.add(c);

		}
		Set<Character> setname = new LinkedHashSet<Character>(lsname);
		List<Character> listname1 = new ArrayList<Character>(setname);
		for (int i = 0; i < listname1.size(); i++) {
			System.out.println("After Removal of Duplicate words:" + listname1.get(i));

		}

	}

}
