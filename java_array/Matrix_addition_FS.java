
package com.mycompany.farhansadikscreation2;

import java.util.Scanner;

public class Matrix_addition_FS {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int row, column;
        
        // Asking the user for the number of rows and columns
        System.out.print("Enter Row and Column for matrix: ");
        row = input.nextInt();
        column = input.nextInt();
        
        // Creating three matrices: two for input and one for storing the result
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] matrix3 = new int[row][column];
        
        // Taking input for the first matrix
        System.out.println("Enter Elements for Matrix1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("matrix1[%d][%d] = ", i, j);
                matrix1[i][j] = input.nextInt();
            }
        }
        
        // Taking input for the second matrix
        System.out.println("Enter Elements for Matrix2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("matrix2[%d][%d] = ", i, j);
                matrix2[i][j] = input.nextInt();
            }
        }
        
        // Printing the first matrix
        System.out.println("\n\nMatrix1 = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + matrix1[i][j]);
            }
            System.out.println(); // Move to the next line after each row
        }

        // Printing the second matrix
        System.out.println("\n\nMatrix2 = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + matrix2[i][j]);
            }
            System.out.println(); // Move to the next line after each row
        }
        
        // Performing matrix addition and storing the result in matrix3
        System.out.println("\n\nMatrix1 + Matrix2 = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j]; // Adding corresponding elements
                System.out.print(" " + matrix3[i][j]);
            }
            System.out.println(); // Move to the next line after each row
        }
        
        input.close(); // Closing the scanner to avoid memory leaks
    }
}
