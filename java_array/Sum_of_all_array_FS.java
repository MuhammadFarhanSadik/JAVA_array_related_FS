
package com.mycompany.farhansadikscreation2;


public class Sum_of_all_array_FS {
    
    public static void main(String[] args){
        
        // Create a 2D array with values
        int [][] array = {{1, 2, 67}, {4, 5, 76}, {70, 8, 9}};
        
        // Initialize a variable to store the sum of all elements
        int sum = 0;
        
        // Loop through each row of the array
        for(int row = 0; row < 3; row++){
            // Loop through each column of the current row
            for(int column = 0; column < 3; column++){
                // Add the current element of the array to sum
                sum = sum + array[row][column];
            }
        }
       
        // Print the total sum of all elements in the array
        System.out.println("Sum of all array elements = " + sum);   
    }
}

    

