
package com.mycompany.farhansadikscreation2;

import java.util.Scanner;


public class sum_row_column_FS {
    public static void main(String[] args) {
   
    // Create a scanner object to get user input
    Scanner input = new Scanner(System.in);
    
    // Ask user to enter the number of rows and columns for the 2D array
    System.out.print("Enter row and column number : ");
    int row = input.nextInt();
    int column = input.nextInt();
    
    // Create a 2D array with user-defined rows and columns
    int [][] array = new int[row][column];

    // Ask the user to enter the elements of the 2D array
    System.out.println("Enter the elements of 2D Array : ");
    for(int i=0; i<row; i++){
        for(int j=0; j<column; j++){
            // Taking input for each element in the 2D array
            System.out.printf("array[%d][%d] = ", i, j);
            array[i][j] = input.nextInt();
        }
    }

    // Print the entire 2D array
    System.out.println("\n\n2D Array : ");
    for(int i=0; i<row; i++){
        for(int j=0; j<column; j++){
            // Printing each element of the 2D array
            System.out.print(" " + array[i][j]);
        }
        System.out.println();
    }

    // Calculate and print the sum of each row
    System.out.println("\n\nSum of each row : ");
    for(int i=0; i<row; i++){
        int rowSum = 0;
        for(int j=0; j<column; j++){
            // Adding elements in the current row to get rowSum
            rowSum = rowSum + array[i][j];
        }
        // Print the sum for the current row
        System.out.println("Row " + (i + 1) + " = " + rowSum);
    }

    // Calculate and print the sum of each column
    System.out.println("\nSum of each column : ");
    for(int j=0; j<column; j++){
        int columnSum = 0;
        for(int i=0; i<row; i++){
            // Adding elements in the current column to get columnSum
            columnSum = columnSum + array[i][j];
        }
        // Print the sum for the current column
        System.out.println("Column " + (j + 1) + " = " + columnSum);
    }

    // Close the scanner after usage
    input.close();
}

}
