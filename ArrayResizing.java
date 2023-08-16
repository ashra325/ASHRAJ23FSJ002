package javaFullStack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayResizing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the original array: ");
        int originalSize = scanner.nextInt();

        int[] originalArray = new int[originalSize];
        System.out.println("Enter the elements of the original array:");
        for (int i = 0; i < originalSize; i++) {
            originalArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the new size of the array: ");
        int newSize = scanner.nextInt();

        int[] resizedArray = new int[newSize];
        int elementsToCopy = Math.min(originalSize, newSize);
        System.arraycopy(originalArray, 0, resizedArray, 0, elementsToCopy);

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Resized array: " + Arrays.toString(resizedArray));
    }
}
