
package com.mycompany.farhansadikscreation2;

import java.util.Scanner;


public class Transpose_Matrix_FS {
    public static void main(String[] args) {
   
    // Create a scanner object to get user input
    Scanner input = new Scanner(System.in);
    
    // Ask the user to enter the number of rows and columns for the matrix
    System.out.print("Enter row and column number : ");
    int row = input.nextInt();
    int column = input.nextInt();
    
    // Create a matrix based on the user's input for rows and columns
    int [][] matrix = new int[row][column];
    
    // Ask the user to enter the elements of the matrix
    System.out.println("Enter the elements of Matrix : ");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
            // Getting input for each element of the matrix
            System.out.printf("array[%d][%d] = ", i, j);
            matrix[i][j] = input.nextInt();
        }
    }
    
    // Create another matrix to store the transpose of the original matrix
    int [][] transpose = new int[column][row];
    
    // Loop to calculate the transpose of the matrix
    for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
            // Assigning the transpose of the matrix (row and column are swapped)
            transpose[j][i] = matrix[i][j];
        }
    }
    
    // Print the original matrix
    System.out.println("\n\nOriginal Matrix : ");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
            // Print each element of the original matrix
            System.out.print(" " + matrix[i][j]);
        }
        System.out.println(); // Move to the next line after each row
    }
    
    // Print the transpose of the matrix
    System.out.println("\nTranspose of the matrix : ");
    for(int i = 0; i < column; i++){
        for(int j = 0; j < row; j++){
            // Print each element of the transposed matrix
            System.out.print(" " + transpose[i][j]);
        }
        System.out.println(); // Move to the next line after each row of transpose
    }
    
    // Close the scanner after use
    input.close();
}

    
}
