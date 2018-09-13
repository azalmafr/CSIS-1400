/*
 Ahmed Almafrachi
CSIS 1430.
 */
package trianglemethods;

import java.util.Scanner;
public class TriangleMethods {

    public static void main(String[] args) {
       
       
        
        // scanner packge 
        Scanner input = new Scanner(System.in);
       
        //prompt the user to inter the a side
        System.out.print("Enter Side - a: ");
        double sidea = input.nextDouble();
        
        //prompt the user to inter the b side
        System.out.print("Enter side - b: ");
        double sideb = input.nextDouble();
        
        //prompt the user to inter the c side
        System.out.print("Enter Side - c: ");
        double sidec = input.nextDouble();
        
        //called isValid method
        System.out.print(isValid(sidea, sideb, sidec) ? "" :"Invalid trangle");
        
        // called the area method
        System.out.print("The area of the Triangle is " + area(sidea, sideb, sidec));
        
        // called the Trianglet Type method
        System.out.print("\nThe Trianglet Type is " + triangletType(sidea, sideb, sidec)+ "\n");
        
    }
    
    // method to find if the Trianglet valid 
    public static boolean isValid(double sidea, double sideb, double sidec){
        
        if(sidea + sideb > sidec && sideb + sidec > sidea && sidea + sidec > sideb)
            return true;
        else  
            return false;
    }
    // method to compute the area
    public static double area(double sidea, double sideb, double sidec){
        double area = 0;
        double s = (sidea + sideb + sidec)/2;
        area = Math.sqrt(s*(s - sidea)*(s - sideb)*(s - sidec));
        return area; 
    }
    // method to fine the Trianglet type
    public static String triangletType(double sidea, double sideb, double sidec){
        
        if(sidea == sidec)
            return "equilateral";
        else if(sidea == sideb || sideb == sidec)
            return "isosceles";
        else 
            return "secalene";
    }
    
    
} 
