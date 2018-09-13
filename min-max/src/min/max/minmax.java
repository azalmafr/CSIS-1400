
package min.max;


import javax.swing.JOptionPane;


public class minmax {

   
 public static void main(String[] args)
         
{    // declaration max and min  
    int maxNum = Integer.MAX_VALUE;
    int minNum = Integer.MIN_VALUE;
    // prompt the user to insert the number
    String number = JOptionPane.showInputDialog("Enter a Number ");
    //convert the string to intager
    maxNum = Integer.parseInt(number);
    minNum = Integer.parseInt(number);
    
    //Prompt the user to insert other number or end the program.
    String anothernum = JOptionPane.showInputDialog(" Would you like to input another number? Y/N");
    
    // process the numbers
    while(anothernum.equalsIgnoreCase("Y"))
    {
        String num1String = JOptionPane.showInputDialog("Enter a Numer: ");
        int num1 = Integer.parseInt(num1String);
        if(num1 > maxNum)
           {
               maxNum = num1;
           }
        if(num1 < minNum)
           {
               minNum = num1;
           }  
        //Repeat if the user want to enter other number
        anothernum = JOptionPane.showInputDialog(" Would you like to input another number? Y/N"); 
    }
    // display the result
     JOptionPane.showMessageDialog(null, "Largest Number: " + maxNum + "\n Smallest Number: " + minNum);

}
    
}
