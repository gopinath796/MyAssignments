package day8_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare An array for {3,2,11,4,6,7};
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		Collections.sort(arr);
		int size = arr.size();
		System.out.println("The Second Largerst number in the List is:" + arr.get(size - 2));

	}

}
