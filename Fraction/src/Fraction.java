

/**
 * @author Ahmed Almafrachi
 * CSIS-1400-Sp18-Koziatek
 */
public class Fraction {
    
    
    
private int numerator;
private int denominator;

//returns the fraction 
public Fraction(int a, int b) 
{
    numerator = a;
    denominator = b;
}

public Fraction() 
{
    numerator = 1;
    denominator = 1;
}
//return fraction into String
public String toString()
{
    return numerator + "/" + denominator;
}
//return fraction into decimal
public double getDecimal()
{
    double decimal = ((double)numerator / denominator);
    return decimal;
}
//fraction into Reduce void method
public void reduce()
{ 
    int n = numerator;
    int d = denominator;

    while(n != d)
        {
            if(n > d)
            n = n - d;

            if(d > n)
            d = d - n;
        }
            System.out.print(n + "/" + d +"\n");
}
//return fraction into Mixed
public String toMixed()
{
    int a = numerator;
    int b = denominator;
    int whole = numerator / denominator;

    while(a != b)
    {
            if(a > b)
            a = a - b;
            if(b > a)
            b = b - a;
    }
            Fraction g = new Fraction(numerator % denominator / b, denominator / b);
            if(whole > 0)
            return whole + " " + g.toString();
            else
            return g.toString();
    }
}
  