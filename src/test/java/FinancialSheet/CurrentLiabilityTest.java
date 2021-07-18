package FinancialSheet;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CurrentLiabilityTest {
    CurrentLiability cl = null;
    double accountPayable = 0;
    @Before
    public void setUp(){
        cl = new CurrentLiability();
    }

    @Test
    public void nullResult(){
        assertNull(cl.validateTotal());
    }
    @Test
    public void notNullResult(){
        assertNotNull(accountPayable);
    }
}
