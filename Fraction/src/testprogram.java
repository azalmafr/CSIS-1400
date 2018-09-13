
import java.util.Scanner;

public class testprogram {
    
public static void main(String[] args)
{  
   
Scanner input = new Scanner(System.in);

int choice = 0;

    //array that holds 5 test values
    Fraction[] fraction;
    fraction = new Fraction[5];
    fraction[0] = new Fraction(9, 13);
    fraction[1] = new Fraction(4, 65);
    fraction[2] = new Fraction(28, 66);
    fraction[3] = new Fraction(44, 99);
    fraction[4] = new Fraction(11, 3);
    
    //lets user choose which method want to test with
    System.out.println("Enter 1 to test the toString() method,\nEnter 2 to test the getdecimal() method.\n"
    + "Enter 3 to test the Reduce method.\nEnter 4 to test the toMixed() method or 5 to quit: ");
    choice = input.nextInt();
    
     //calls the method 
    while(choice != 5)
    {
    if(choice == 1)
    for(int i = 0; i < fraction.length; i++)
    {
    System.out.println(fraction[i].toString());
    }

    if(choice == 2)
    for(int i = 0; i < fraction.length; i++)
    {

    System.out.println(fraction[i].getDecimal());
    }

    if(choice == 3)
    for(int i = 0; i < fraction.length; i++)
    {
    fraction[i].reduce();
    }

    if(choice == 4)
    for(int i = 0; i < fraction.length; i++)
    {
    System.out.println(fraction[i].toMixed());
    }
    System.out.println("Enter 1 to test the toString() method.\n Enter 2 to test the getdecimal() method. \n "
    + "Enter 3 to test the Reduce method. \n Enter 4 to test the toMixed() method or 5 to quit: ");
    choice = input.nextInt();
    }

}
}


