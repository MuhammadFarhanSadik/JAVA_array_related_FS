
package com.mycompany.farhansadikscreation2;

import java.util.Scanner;
public class Matrix_Diagonal_Sum_FS {
    


    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        // Asking the user for the number of rows and columns
        System.out.print("Enter row and column number: ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        // Creating a matrix (2D array)
        int[][] matrix = new int[row][column];
        int SumOfDiagonal = 0; // Variable to store the sum of diagonal elements
        
        // Taking input for the matrix elements
        System.out.println("Enter the elements of Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Adding diagonal elements (only when row index == column index)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) { // Diagonal elements condition
                    SumOfDiagonal = SumOfDiagonal + matrix[i][j];
                }
            }
        }
        
        // Printing the matrix
        System.out.println("\n\nMatrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println(); // Move to the next line
        }
        
        // Printing the sum of diagonal elements
        System.out.println("\nSum of Diagonal Elements = " + SumOfDiagonal);
        
        input.close(); // Closing scanner to prevent issues
    }
}

    

