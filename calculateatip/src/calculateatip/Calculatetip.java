// Ahmed Almafrachi

package calculateatip;


import java.util.Scanner; // Scanner is in java.util package

public class Calculatetip
{
	
	public static void main(String[] args) 
        {
		
		// Careate Scanner object
		Scanner input =new Scanner(System.in);
		
		// Prompt the user to enter the rstaurant bill
		System.out.print("Enter the Restaurant bill $");
		int bill = input.nextInt();
		
		// Prompt the user to enter the rate of the tip
		System.out.print("Enter the gratuity rate in %");
		int gratuity = input.nextInt();
		
		// compute the amount of the tip
		int gratuityamount = (bill * gratuity) / 100 ;
		
		// compute the total chagre
		int totalbill = bill + gratuityamount;
		
		// Display the results
		
                System.out.printf(" The Restaueant bill is  %f ",  bill);
                System.out.printf(" The gratuity rate is  %f ", gratuity);
                System.out.printf(" The amount of the tip is  %f ", gratuityamount);
                System.out.printf(" The total charge is  %f ", totalbill);
            
               
	}

}