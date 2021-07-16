package FinancialSheet;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CurrentAssetsTest {
     CurrentAssets ca =null;
     double  pettyCashValue = 1000;
     double inventoryValue = 20000;
    @Before
    public void setUp(){
        ca = new CurrentAssets();
    }

//    @BeforeClass
//    public static void setUpCurrentAssets(){
//        ca.setInventoryValue(inventoryValue);
//        ca.setPettyCashValue(pettyCashValue);
//    }

    @Test
    public void given_one_double_when_addPettyCashValue_then_ok(){
        double expected = 100;
        double actual = ca.addPettyCashValue(100);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void given_one_double_when_addInventoryValue_then_ok(){
        double expected = 300;
        double actual = ca.addInventoryValue(100);
        actual = ca.addInventoryValue(200);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void when_calculateTotal_then_ok(){
        ca.setInventoryValue(inventoryValue);
        ca.setPettyCashValue(pettyCashValue);
        assertEquals(21000, ca.calculateTotal(), 0 );
    }

    @Test
    public void when_validateTotal_then_ok(){
        ca.setPettyCashValue(pettyCashValue);
        ca.setInventoryValue(inventoryValue);
        assertTrue(ca.validateTotal());
    }





}