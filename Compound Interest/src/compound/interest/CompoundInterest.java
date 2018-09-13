/*
 * Ahmed Almafrachi  
 * Randal Koziatek
 * CSIS-1400-SP 18
 * 1/29/2018
 */

package compound.interest;

import javax.swing.JOptionPane; // JOptionpane is in java.util package


public class CompoundInterest {

    public static void main(String[] args) 
        {
		//
		String dialoginput, formatinput;
                
		// Prompt the user to enter the rate of the tipthe annual percentage rate the account accrues. usuing the Dialoginput.
                dialoginput = JOptionPane.showInputDialog("Enter the monthly savings amount $");
                double monthamount = Double.parseDouble(dialoginput);
                
		
		// Prompt the user to enter the rate of the tipthe annual percentage rate the account accrues. usuing the Dialoginput
                dialoginput = JOptionPane.showInputDialog("Enter the annual percentage rate in % ");
		double annualpercent = Double.parseDouble(dialoginput);
                
                //display the monthly savig amount 
                formatinput = String.format("monthly savings amount $%.2f",monthamount);
                JOptionPane.showMessageDialog(null, formatinput);
                
                //display the annual percent
                formatinput = String.format("annual percentage rate %.0f",annualpercent);
                JOptionPane.showMessageDialog(null, formatinput+"%");
		
		// compute the monthly interest rate
		double monthlypercent = (annualpercent / 12) / 100;
                
                //Display the result and Format the output using format method 
                formatinput = String.format("monthly interest rate %.3f",monthlypercent);
                JOptionPane.showMessageDialog(null, formatinput);
                
		// compute the first month, the value in the account
		double fimonth = (monthamount) * (1 + monthlypercent);
                
                //Display the result and Format the output using format method 
                formatinput = String.format("first month, the value in the account $%.2f",fimonth);
                JOptionPane.showMessageDialog(null, formatinput);
                
                // compute the second month, the value in the account
                double semonth = (monthamount + fimonth) * (1 + monthlypercent);
                
                //Display the result and Format the output using format method 
                formatinput = String.format("the second month, the value in the account $%.2f",semonth);
                JOptionPane.showMessageDialog(null, formatinput);
                
                // compute the third month, the value in the account
                double thirdmonth = (monthamount + semonth) * (1 + monthlypercent);
                
                //Display the result and Format the output using format method 
                formatinput = String.format("the third month, the value in the account $%.2f",thirdmonth);
                JOptionPane.showMessageDialog(null, formatinput);
                
                // compute the fourth month, the value in the account
                double forthmonth = (monthamount + thirdmonth) * (1 + monthlypercent);
                
                //Display the result and Format the output using format method 
                formatinput = String.format("the fourth month, the value in the account $%.2f",forthmonth);
                JOptionPane.showMessageDialog(null, formatinput);
                
                // compute the fifth month, the value in the account
                double fithmonth = (monthamount + forthmonth) * (1 + monthlypercent);
                
                //Display the result and Format the output using format method 
                formatinput = String.format("the fifth month, the value in the account $%.2f",fithmonth);
                JOptionPane.showMessageDialog(null, formatinput);
                
                // compute the sixth month, the value in the account
                double sixmonth = (monthamount + fithmonth) * (1 + monthlypercent);
                
                //Display the result and Format the output using format method 
                formatinput = String.format("the sixth month, the value in the account $%.2f",sixmonth);
                JOptionPane.showMessageDialog(null, formatinput);
                
             
		
	}

   
   
    }
    
    

