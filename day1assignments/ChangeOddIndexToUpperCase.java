package week2.day1assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 == 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
				System.out.println(charArray[i]);
			} else if (i % 2 == 1) {
				System.out.print(charArray[i]);
			}

		}

	}

}
