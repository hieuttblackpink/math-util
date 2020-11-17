
package math.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MathUtil 
{

    public static void main(String[] args)
    {
        try 
        {
            System.out.println("5! = " + hieu.util.MathUtility.getFactorial(5));
            
            //goi ham 5! hy vong tra ve 120
            //sau khi chay, coi thuc te la bao nhieu - ACTURAL
            //so sanh voi cai hy vong truoc khi tinh - EXPECTED 120
            //new ACTURAL = EXCEPTED --> ham chay dung tinh nang --> test case 
            
            System.out.println("0! = " + hieu.util.MathUtility.getFactorial(0));
            
            //EXCEPTED = 1
            
            System.out.println("-5! = " + hieu.util.MathUtility.getFactorial(-5));
            System.out.println("");
            //EXCEPTED: hien exception ILLEGALARGUMENTEXCEPTION
        } 
        catch (IllegalAccessException ex) 
        {
            System.out.println(ex);
        }
        
        //cach test nay goi la MANUAL vi phai nhi bang mat de luan ket qua
        
        //cach hay hon: ta dung mau sac xanh do de luan ket qua dung sai cua ham
        //cach nay goi la test automation
    }
    
}
