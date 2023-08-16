package javaFullStack;

	import java.util.Arrays;
	import java.util.Scanner;

	public class ArraySorting {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        System.out.println("Select sorting order:");
	        System.out.println("1. Ascending");
	        System.out.println("2. Descending");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        if (choice == 1) {
	            Arrays.sort(array);  // Ascending order
	            System.out.println("Array sorted in ascending order: " + Arrays.toString(array));
	        } else if (choice == 2) {
	            Arrays.sort(array);
	            for (int i = 0; i < size / 2; i++) {
	                int temp = array[i];
	                array[i] = array[size - 1 - i];
	                array[size - 1 - i] = temp;
	            }
	            System.out.println("Array sorted in descending order: " + Arrays.toString(array));
	        } else {
	            System.out.println("Invalid choice.");
	        }
	    }
	}

