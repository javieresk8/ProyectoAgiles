package FinancialSheet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TangiblePropertyTest {
    TangibleProperty tp = null;
    double furnitureValue = 100;
    double vehiclesValue = 500;

    @Before
    public void setUp() {
        tp = new TangibleProperty();
    }

    @Test
    public void given_one_double_when_addVehiclesValue_then_ok(){
        assertEquals(100, tp.addVehiclesValue(100), 0);
    }

    @Test
    public void given_one_double_when_addFurnitureValue_then_ok(){
        assertEquals(100, tp.addFurnitureValue(100), 0);
    }

    @Test
    public void when_calculateTotal_then_ok(){
        tp.setFurnitureValue(furnitureValue);
        tp.setVehiclesValue(vehiclesValue);
        assertEquals(600, tp.calculateTotal(), 0);
    }

    @Test
    public void when_validateTotal_then_ok(){
        tp.setVehiclesValue(vehiclesValue);
        tp.setFurnitureValue(furnitureValue);
        assertTrue(tp.validateTotal());
    }
}