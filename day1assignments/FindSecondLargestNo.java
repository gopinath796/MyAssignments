package week2.day1assignments;

import java.util.Arrays;

public class FindSecondLargestNo {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };
		// Find Total Length
		int length = data.length;
		System.out.println("Total Array length is:" + length);

		// Sorting the array in Ascending order
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println("Ascending order is:" + data[i]);
		}

		// Print second last element
		System.out.println("Second Last element is: " + data[length - 2]);

	}

}
