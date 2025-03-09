
package com.mycompany.farhansadikscreation2;

import java.util.Scanner;


public class Zigzag_Traversal_Matrix_FS {
    public static void main(String[] args) {
   
    // Create a scanner to get input from the user
    Scanner input = new Scanner(System.in);
    
    // Ask the user to input the number of rows and columns for the matrix
    System.out.print("Enter row and column number : ");
    int row = input.nextInt();
    int column = input.nextInt();
    
    // Create a 2D matrix of the size entered by the user
    int [][] matrix = new int[row][column];
   
    // Ask the user to enter the elements of the matrix
    System.out.println("Enter the elements of Matrix : ");
    for(int i=0; i<row; i++){
        for(int j=0; j<column; j++){
            // Get the value for each matrix element
            System.out.printf("array[%d][%d] = ",i,j);
            matrix[i][j] = input.nextInt();
        }
    }
    
    // Print the matrix in Zigzag format
    System.out.println("\n\nZigzag Matrix : ");
    
    for(int i=0; i<row; i++){
        // If the row number is even, print from left to right
        if(i%2==0){
            for(int j=0; j<column; j++){
                System.out.print(" "+matrix[i][j]);
            }
        }
        // If the row number is odd, print from right to left
        else{
            for(int j=column-1; j>=0; j--){
                System.out.print(" "+matrix[i][j]);
            }
        }
        System.out.println(); // Move to the next line after printing the row
    }
    
    // Close the scanner after use
    input.close();
}

    
}
