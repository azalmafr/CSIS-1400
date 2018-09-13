/*
 Ahmed Almafrachi
 */
package array;

import java.util.Scanner;
public class Array {

   
    public static void main(String[] args) {
       
        // create Scannet 
        Scanner Input = new Scanner(System.in);
        
         // prompte the uster to Enter how many number want to store
        System.out.print("How many numbers do you want to enter? = ");
        int numbers = Input.nextInt();
        
        // array represents an array of int values
        int [] array = new int[numbers];
        
        // prompt the user to enter each number and store these numbers into the array
        for(int i=0; i<numbers; i++){
            System.out.print("Enter the value of the number want to store  = ");
            array[i] = Input.nextInt(); 
        }
        
        // diplay the numbers in reverse order 
        System.out.println("The numbers you stored in reverse order ");
        for (int i = array.length-1; i >= 0; i--) {
        System.out.print("[" + array[i] + "]"+ " -> ");
        }
    }

}
