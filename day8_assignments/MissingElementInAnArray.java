package day8_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		// int[] arr = {1,2,3,4,7,6,8};
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(7);
		arr.add(6);
		arr.add(8);
		Collections.sort(arr);
		int size = arr.size();

		for (int i = 0; i < size; i++) {
			int j = i + 1;
			if (arr.get(i) != j) {
				System.out.println("Missing Element is:" + j);
				break;
			}

		}

	}
}
