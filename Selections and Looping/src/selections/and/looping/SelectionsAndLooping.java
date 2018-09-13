//Ahmed Almafrachi
package selections.and.looping;

import java.util.Scanner;

/*  This program inputs an ending number and displays all numbers between
 1 and the ending number that are evenly divisible by 3.
 */
public class SelectionsAndLooping
{

    public static void main(String[] args)
    {
        
         

        Scanner input = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        int end,count, base;
        
        System.out.println("Enter the ending number: ");
        end = input.nextInt();
        
        // input the ending number
        System.out.println("enter the divisor");
        count = x.nextInt();
        
        
        for( int counter = 1; counter <= end; counter++) {
			System.out.print(count * counter + " ");
		}
        System.out.println();

		
        
    }

}
