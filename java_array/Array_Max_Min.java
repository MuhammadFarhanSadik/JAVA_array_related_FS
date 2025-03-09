
package com.mycompany.farhansadikscreation2;


public class Array_Max_Min {
    public static void main(String[] args) {
        
        // Initializing a 2D array with fixed values
        int[][] array = {{10, 15, 13}, {5, 9, 13}, {11, 21, 31}};
        
        // Assuming the first element is the max and min
        int max = array[0][0];
        int min = array[0][0];
        
        // Looping through the array to find min and max
        for (int row = 0; row < 3; row++) {  // Loop through rows
            for (int col = 0; col < 3; col++) {  // Loop through columns
                if (max < array[row][col]) {  
                    max = array[row][col];  // Update max if found a bigger value
                }
                if (min > array[row][col]) {
                    min = array[row][col];  // Update min if found a smaller value
                }
            }
        }

        // Printing the minimum and maximum values
        System.out.println("Smallest number in 2D array = " + min);
        System.out.println("Largest number in 2D array = " + max);
    }
}

    

