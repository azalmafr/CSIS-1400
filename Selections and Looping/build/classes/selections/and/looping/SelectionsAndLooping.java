package selections.and.looping;

import java.util.Scanner;

/*  This program inputs an ending number and displays all numbers between
 1 and the ending number that are evenly divisible by 3.
 */
public class SelectionsAndLooping
{

    public static void main(String[] args)
    {
        int n;
        int count;
        Scanner input;

        input = new Scanner(System.in);
        count = 3;

        // input the ending number
        System.out.println("Enter the ending number: ");
        n = input.nextInt();
        System.out.println("Below are all the numbers that are evenly divisible by " + count + " from 1 up to " + n);

        while (count <= n)
        {
            System.out.print(count + "  ");
            count += 3;  // this is the same as: count = count + 3;
        }
        System.out.println();

    }

}
