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
    public void given_three_double_when_calculateTotal_then_ok(){
    ae.addBusinessAccount(50.00);
    ae.addCapitalAccount(50.00);
    ae.addLoss(10.00);
    double business = ae.calculateTotalBusiness();
    double capital = ae.calculateTotalCapital();
    assertNotEquals(business,capital);
    }
    @Test
    public void when_validateTotal_then_ok(){
        ae.setLoss(100);
        ae.setCapitalAccount(300);
        ae.setBusinessAccount(300);
        ae.validateTotal();
        String control;
        if(ae.validateTotal()){
            control="Exito";
        }else{
            control=null;
        }
        assertNotNull(control);
    }
}
