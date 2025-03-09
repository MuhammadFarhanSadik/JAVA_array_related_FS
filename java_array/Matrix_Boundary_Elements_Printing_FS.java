
package com.mycompany.farhansadikscreation2;

  import java.util.Scanner;
public class Matrix_Boundary_Elements_Printing_FS {
    


    public static void main(String[] args) {
   
       

    
   
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the number of rows and columns
        System.out.print("Enter row and column number: ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        // Creating a 2D array (matrix) with the given size
        int[][] matrix = new int[row][column];
        
        // Taking input for the matrix elements
        System.out.println("Enter the elements of the Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
    
        // Display the full matrix
        System.out.println("\n\nMatrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        // Print only the boundary elements of the matrix
        System.out.println("\n\nBoundary Elements:");
        
        // Print the first row
        for (int i = 0; i < column; i++) {
            System.out.print(" " + matrix[0][i]);
        }
        
        // Print the last column (excluding first and last row to avoid duplicates)
        for (int i = 1; i < row - 1; i++) {
            System.out.print(" " + matrix[i][column - 1]);
        }
 
        // Print the last row in reverse order (only if the matrix has more than one row)
        if (row > 1) {
            for (int i = column - 1; i >= 0; i--) {
                System.out.print(" " + matrix[row - 1][i]);
            }
        }
       
        // Print the first column in reverse order (excluding first and last row to avoid duplicates)
        if (column > 1) {
            for (int i = row - 2; i > 0; i--) {
                System.out.print(" " + matrix[i][0]);
            }
        }
        
        input.close(); // Close the scanner to prevent memory leaks
    }
}
