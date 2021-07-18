package FinancialSheet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

@RunWith(value = Parameterized.class)
public class FinancialStatementParametersTest2 {
    ActualEstate tanEstate;
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new ActualEstate(500, 500, 300),
                });
        objects.add(new Object[]{new ActualEstate(600, 600, 250),
                });
        objects.add(new Object[]{new ActualEstate(5000, 5000, 950),
                });
        objects.add(new Object[]{new ActualEstate(100, 100, 300)
                });
        objects.add(new Object[]{new ActualEstate(99999, 999999, 999)
                });

        return objects;
    }
    public FinancialStatementParametersTest2(ActualEstate actualEstate) {
        this.tanEstate = actualEstate;
    }
    @Test(expected = AssertionError.class)
    public void given_parameters_when_addAsset_then_error(){
        FinancialStatement fs = new FinancialStatement();
        ArrayList<Estate> temp1 = (ArrayList<Estate>) fs.getEstates().clone();
        System.out.println(temp1);
        fs.addEstate(tanEstate);
        ArrayList<Estate> temp2 = (ArrayList<Estate>) fs.getEstates().clone();
        assertArrayEquals(temp1.toArray(),temp2.toArray());
    }

}