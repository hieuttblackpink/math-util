
package hieu.util;


public class MathUtility
{
    //JDK co class java.util.Math co 1 loat class static
    
    public static final double PI = 3.14;
    
    //ham tinh n!
    //chi tinh 20! --> MAX, 21! --> tran long
    //ko co am giai thua, neu n < 0 --> Exception
    
    public static long getFactorial(int n) throws IllegalAccessException
    {
        if (n < 0 || n > 20)
        {
            throw new IllegalAccessException("n must be between 1 .. 20");
        }
        if (n == 0 || n == 1)
        {
            return 1;
        }
        
        long result = 1;
        for (int i = 1; i <= n; i++) 
        {
            result *= i;
            
        }
        return result;
    }
}
