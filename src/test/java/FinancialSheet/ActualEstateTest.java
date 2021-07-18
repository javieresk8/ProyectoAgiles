package FinancialSheet;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class ActualEstateTest {
    ActualEstate ae = null;
    double capitalAccount = 0.0;
    double businessAccount = 0.0;
    double loss = 0;
    @Before
    public void setUp(){
        ae = new ActualEstate();
    }
    @Test
    public void isSameReferenceTest(){
    assertNotSame(capitalAccount,businessAccount);
    }


}
