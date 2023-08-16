package javaFullStack;

public class FindElementArray {

	    public static void main(String[] args) {
	     
	        int[] array = {1, 2, 3, 4, 5};

	        int element = 3;

	      
	        int index = findElementInArray(array, element);
	        System.out.println("The index of the element is " + index);
	    }

	    private static int findElementInArray(int[] array, int element) {
	        int start = 0;
	        int end = array.length - 1;
	        while (start <= end) {
	          
	            int middle = (start + end) / 2;
	            if (array[middle] == element) {
	                return middle;
	            } else if (array[middle] < element) {
	                start = middle + 1;
	            } else {
	                end = middle - 1;
	            }
	        }

	        
	        return -1;
	    }
	}

