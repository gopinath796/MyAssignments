package week2.day1assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		// Total lenght is
		int length = arr.length;
		System.out.println("Total Array Length is: " + length);

		// sort the Array
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (arr[i] != j) {
				System.out.println("Missing element is: " + j);
				break;
			}

		}

	}

}
