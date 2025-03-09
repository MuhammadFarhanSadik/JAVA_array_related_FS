
package com.mycompany.farhansadikscreation2;

 import java.util.Scanner;
public class Matrix_Spiral_Order_Printing_FS {
    


    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number of rows and columns
        System.out.print("Enter number of rows and columns: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        // Taking input for the matrix elements
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("matrix[%d][%d] = ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
    
        // Displaying the matrix
        System.out.println("\nMatrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        
        // Initializing boundary pointers
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = cols - 1;
         
        System.out.println("\nSpiral Order Output: ");
        
        // Looping until all elements are printed in spiral order
        while (topRow <= bottomRow && leftCol <= rightCol) {
            
            // Print the top row from left to right
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;
            
            // Print the right column from top to bottom
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;
            
            // Print the bottom row from right to left (if it exists)
            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }
            
            // Print the left column from bottom to top (if it exists)
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                }
                leftCol++;
            }
        }
        
        input.close(); // Closing the scanner
    }
}

    

