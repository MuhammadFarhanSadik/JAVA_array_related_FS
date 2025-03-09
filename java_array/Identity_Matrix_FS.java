//An identity matrix is a square matrix in which all the diagonal elements are 1 and all the off-diagonal elements are 0.
package com.mycompany.farhansadikscreation2;

import java.util.Scanner;

public class Identity_Matrix_FS {
    
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        // Taking input for matrix dimensions
        System.out.print("Enter row and column number : ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        // Checking if the matrix is square (Identity matrix must be square)
        if (row != column) {
            System.out.println("\nIt is not an Identity matrix (Row and Column must be equal)");
            return; // Exit the program if the matrix is not square
        }
        
        // Declaring a 2D array (matrix)
        int[][] matrix = new int[row][column];
   
        // Taking input for matrix elements
        System.out.println("Enter the elements of Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Variable to check if the matrix is an identity matrix
        boolean identity = true;
        
        // Checking the identity matrix condition
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // The diagonal elements should be 1 and non-diagonal elements should be 0
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    identity = false;
                    break; // Exit inner loop if condition fails
                }
            }
        }
        
        // Displaying the result
        if (identity) {
            System.out.println("\nThe matrix is an Identity Matrix");
        } else {
            System.out.println("\nThe matrix is not an Identity Matrix");
        }
        
        input.close(); // Closing the Scanner to prevent memory leaks
    }
}

    

