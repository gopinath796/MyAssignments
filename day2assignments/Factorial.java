package week2.day2assignments;

public class Factorial {

	public static void main(String[] args) {
		int i,fact=1;
		int input =5;
		for (i = 1; i <=input; i++) {
			fact=fact*i;
			
		}
		System.out.println("The Factorial number of " + input + " is: "+ fact);

	}

}
