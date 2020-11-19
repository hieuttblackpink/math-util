
package hieu.util.test;

import hieu.util.MathUtility;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilityTest 
{
    @Test //ki hieu cua JUnit dua ra, bien ham nay thanh ham sau thanh main. F6 chay main mac dinh, shift + F6 chay main o @Test
    public void getFactorial_RunsWell_IfVaildArgument() throws IllegalAccessException //day la 1 trong nhung quy tac dat ten ch ham test
    {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //Xanh chi dat khi tat ca deu xanh. Do khi chi can duy nhat 1 do --> all red
    //-->ham phai dung het, sai 1 cai la ham ko dang tin
    
    public MathUtilityTest() 
    {
        
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        
    }
    
    @Before
    public void setUp() 
    {
        
    }
    
    @After
    public void tearDown()
    {
        
    }

}
//Viet code de test code chinh
//Viet code dung thu vien Junit, Nunit, xUnit, Jasmine,... de test
//xem code chinh nay chay on ko trc khi dem cho k/hang trai nghiem
//va thu vien nay cung cap co che bao dung sai qua mau sac xanh do
//mat chi nhin 2 mau la du, khoi can so sanh expected va actual roi ket luan