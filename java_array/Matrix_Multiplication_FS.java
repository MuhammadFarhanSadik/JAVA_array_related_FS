
package com.mycompany.farhansadikscreation2;
import java.util.Scanner;

public class Matrix_Multiplication_FS {


    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int rowsA, rowsB, colsA, colsB, i, j, k, total=0;
        
        // Taking input for the first matrix
        System.out.print("Enter row for first Matrix: ");
        rowsA = input.nextInt();
        System.out.print("Enter column for first Matrix: ");
        colsA = input.nextInt();
        
        // Taking input for the second matrix
        System.out.print("Enter row for Second Matrix: ");
        rowsB = input.nextInt();
        System.out.print("Enter column for second Matrix: ");
        colsB = input.nextInt();
        
        // Checking if multiplication is possible (columns of A must match rows of B)
        while(colsA != rowsB){
            System.out.println("Error!! Column of first matrix must be equal to row of second matrix.");
            
            // Re-entering the values
            System.out.print("Enter row for first Matrix: ");
            rowsA = input.nextInt();
            System.out.print("Enter column for first Matrix: ");
            colsA = input.nextInt();
            System.out.print("Enter row for Second Matrix: ");
            rowsB = input.nextInt();
            System.out.print("Enter column for second Matrix: ");
            colsB = input.nextInt();
        }
        
        // Declaring matrices
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];
        
        // Taking input for Matrix A
        System.out.println("Enter elements for Matrix A: ");
        for(i = 0; i < rowsA; i++){
            for(j = 0; j < colsA; j++){
                System.out.printf("A[%d][%d] = ", i, j);
                matrixA[i][j] = input.nextInt();
            }
        }
        
        // Taking input for Matrix B
        System.out.println("Enter elements for Matrix B: ");
        for(i = 0; i < rowsB; i++){
            for(j = 0; j < colsB; j++){
                System.out.printf("B[%d][%d] = ", i, j);
                matrixB[i][j] = input.nextInt();
            }
        }
        
        // Performing matrix multiplication
        for(i = 0; i < rowsA; i++){
            for(j = 0; j < colsB; j++){
                for(k = 0; k < colsA; k++){
                    total = total + matrixA[i][k] * matrixB[k][j];
                }
                resultMatrix[i][j] = total;
                total = 0; // Reset sum for the next element
            }
        }
       
        // Printing Matrix A
        System.out.println("\n\nMatrix A:");
        for(i = 0; i < rowsA; i++){
            for(j = 0; j < colsA; j++){
                System.out.print(" " + matrixA[i][j]);
            }
            System.out.println();
        }
       
        // Printing Matrix B
        System.out.println("\n\nMatrix B:");
        for(i = 0; i < rowsB; i++){
            for(j = 0; j < colsB; j++){
                System.out.print(" " + matrixB[i][j]);
            }
            System.out.println();
        }
       
        // Printing the result of multiplication
        System.out.println("\n\nMatrix A X Matrix B:");
        for(i = 0; i < rowsA; i++){
            for(j = 0; j < colsB; j++){
                System.out.print("   " + resultMatrix[i][j]);
            }
            System.out.println();
        }
       
        input.close(); // Closing scanner
    }
}

    

