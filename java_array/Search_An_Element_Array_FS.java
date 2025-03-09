
package com.mycompany.farhansadikscreation2;

 import java.util.Scanner;
public class Search_An_Element_Array_FS {
    
    public static void main(String[] args) {
        
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Initialize a 2D array with some values
        int[][] array = {{270, 540, 443, 404}, {53, 605, 57, 99}, {10, 438, 653, 600}};
        
        // Ask the user to input a number to search for
        System.out.print("Enter the number to find position: ");
        int number = input.nextInt();
        
        // Variable to track if the number is found
        boolean found = false;
        
        // Loop through each row of the array
        for (int row = 0; row < array.length; row++) {
            // Loop through each column of the current row
            for (int column = 0; column < array[row].length; column++) {
                
                // Check if the current number in the array matches the input number
                if (array[row][column] == number) {
                    // If found, print the position (row and column) of the number
                    System.out.println("Number " + number + " found at position: (" + row + " , " + column + ")");
                    found = true;  // Set found to true as the number was found
                }
            }
        }
        
        // If the number was not found in the array, print a message
        if (found == false) {
            System.out.println("Number " + number + " not found");
        }
        
        // Close the scanner to free up resources
        input.close();
    }
}

    

