package javaFullStack;
import java.util.Scanner;

public class ElementSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();

        int count = 0;
        boolean found = false;
        StringBuilder locations = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                count++;
                if (locations.length() > 0) {
                    locations.append(", ");
                }
                locations.append(i);
                found = true;
            }
        }

        if (found) {
            System.out.println("Element " + searchElement + " is present.");
            System.out.println("Locations: " + locations);
            System.out.println("Occurrences: " + count);
        } else {
            System.out.println("Element " + searchElement + " is not present in the array.");
        }
    }
}
