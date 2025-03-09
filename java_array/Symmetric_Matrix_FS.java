
package com.mycompany.farhansadikscreation2;

import java.util.Scanner;


public class Symmetric_Matrix_FS {
    public static void main(String[] args) {
   
    // Create a scanner object to get user input
    Scanner input = new Scanner(System.in);
    
    // Ask the user to input the number of rows and columns for the matrix
    System.out.print("Enter row and column number : ");
    int row = input.nextInt();
    int column = input.nextInt();
    
    // Check if the number of rows and columns are equal. If not, it's not a symmetric matrix.
    if(row != column){
        System.out.println("It is not a symmetric matrix (Row and Column must be equal)");
        return; // Exit the program if it's not a square matrix
    }
    
    // Initialize the matrix with user-defined rows and columns
    int [][] matrix = new int[row][column];
    
    // Ask the user to enter the elements of the matrix
    System.out.println("Enter the elements of Matrix : ");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
            // Taking input for each element in the matrix
            System.out.printf("array[%d][%d] = ", i, j);
            matrix[i][j] = input.nextInt();
        }
    }
    
    // Assume the matrix is symmetric at first
    boolean symmetric = true;
    
    // Check if the matrix is symmetric by comparing elements across the diagonal
    for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
            // If any element doesn't match its symmetric counterpart, it's not symmetric
            if(matrix[i][j] != matrix[j][i]){
                symmetric = false; // Set symmetric to false
                break; // Break out of the loop since we've found it's not symmetric
            }
        }
        if(!symmetric){
            break; // Exit the outer loop as well
        }
    }
    
    // Print the original matrix
    System.out.println("\n\nOriginal Matrix : ");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
            System.out.print(" " + matrix[i][j]); // Print each element
        }
        System.out.println(); // Move to the next line after each row
    }
    
    // Check and print whether the matrix is symmetric or not
    if(symmetric){
        System.out.println("\n\nIt is a symmetric matrix.");
    }
    else{
        System.out.println("\n\nIt is not a symmetric matrix.");
    }
    
    // Close the scanner after use
    input.close();
}

    
}
