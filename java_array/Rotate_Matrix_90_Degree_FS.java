
package com.mycompany.farhansadikscreation2;

   import java.util.Scanner;
public class Rotate_Matrix_90_Degree_FS {
  
    public static void main(String[] args) {
        
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the number of rows and columns for the matrix
        System.out.print("Enter row and column number: ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        // Create a 2D array (matrix) with the specified rows and columns
        int[][] matrix = new int[row][column];
   
        // Input elements for the matrix
        System.out.println("Enter the elements of Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Display the original matrix
        System.out.println("\nOriginal Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        
        // Step 1: Transpose the matrix (flip rows and columns)
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                
                // Swap the elements at [i][j] and [j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse the rows of the transposed matrix (flip each row)
        for (int i = 0; i < row; i++) {
            
            int start = 0;
            int end = row - 1;
            
            // Reverse elements in the current row
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                
                // Move the pointers towards the center of the row
                start++;
                end--;
            }
        }
       
        // Display the matrix after 90-degree rotation
        System.out.println("\nAfter matrix 90 degree rotation: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        
        // Close the scanner to prevent memory leaks
        input.close();
    }
}

    

