package day8_assignments;


import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// Declare An array for {3,2,11,4,6,7};
		List<Integer>arr=new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		//Declare another array for {1,2,8,4,9,7};
		List<Integer>arr1=new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(8);
		arr1.add(4);
		arr1.add(9);
		arr1.add(7);
		
		int size=arr.size();
		int size1=arr1.size();
		//Declare for loop iterator from 0 to array length
	for (int i = 0; i < size; i++) {
		//Declare a nested for another array from 0 to array length
		for (int j = 0; j < size1; j++) {
			//Compare Both the arrays using a condition statement
			if(arr.get(i)==arr1.get(j)) {
				//Print the first array (shoud match item in both arrays)
				System.out.println( "Duplicates are :"+ arr1.get(j));
			}
			
		}
		
	}
				

	}

}
