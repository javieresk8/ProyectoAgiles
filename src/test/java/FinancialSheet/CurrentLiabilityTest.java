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
    public void given_two_double_when_calculateTotal_then_ok(){
        cl.addLiability(10.00);
        cl.addLiability(30.00);
        double total = 0.00;
        total = cl.calculateTotal();
        String report = null;
        if(total !=  0.00){
            report = null;
        }else {
            report = "Con exito";
        }

        assertNull(report);
    }

}
