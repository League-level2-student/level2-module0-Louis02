package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] ArrayList = { "zero", "one", "two", "three", "four" };
		// 2. print the third element in the array
		System.out.println(ArrayList[2]);
		// 3. set the third element to a different value
		ArrayList[2] = "nine";
		// 4. print the third element again
		System.out.println(ArrayList[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < ArrayList.length; i++) {
			System.out.print(ArrayList[i] + " ");
		}

		// 6. make an array of 50 integers
		int[] IntegerList = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random r = new Random();

		for (int i = 0; i < IntegerList.length; i++) {
			IntegerList[i] = r.nextInt(50);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallest = 50;
		for (int i = 0; i < IntegerList.length; i++) {
			if (IntegerList[i] < smallest) {
				smallest = IntegerList[i];
				System.out.println(smallest);
			}
		}
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < IntegerList.length; i++) {
			System.out.print(IntegerList[i] + " ");

		}
		// 10. print the largest number in the array.
		int largest = 0;
		for (int i = 0; i < IntegerList.length; i++) {
			if (IntegerList[i] > largest) {
				largest = IntegerList[i];
				System.out.println(largest);
			}
		}
	}
}
