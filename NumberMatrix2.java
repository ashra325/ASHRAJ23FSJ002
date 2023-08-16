package javaFullStack;
public class NumberMatrix2 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the matrix
        int[][] matrix = new int[rows][];

        int num = 1;
        for (int i = 0; i < rows; i++) {
            matrix[i] = new int[i + 1]; // Number of columns in each row
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = num++;
            }
        }

        // Display the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
