
package com.mycompany.farhansadikscreation2;


public class Printing_2D_Array_FS {
    public static void main(String[] args){
        
        // Initializing a 2D array with some values
        int[][] array = {{1, 2, 3}, {5, 5, 6}, {7, 7, 9}};
        
        // Printing the heading
        System.out.println("2D Array Elements: ");
        
        // Loop through each row
        for (int row = 0; row < 3; row++) {
            // Loop through each column in the current row
            for (int column = 0; column < 3; column++) {
                // Print the value at the current position
                System.out.print(" " + array[row][column]);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        
    }
}
    

