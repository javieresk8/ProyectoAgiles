package FinancialSheet;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class FinancialStatementParametersTest {
    CurrentAssets assets;
    TangibleProperty tanProperty;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new CurrentAssets(0, 500),
                new TangibleProperty(0, 500)});
        objects.add(new Object[]{new CurrentAssets(600, 500),
                new TangibleProperty(0, 0)});
        objects.add(new Object[]{new CurrentAssets(50000, 500),
                new TangibleProperty(600, 0)});
        objects.add(new Object[]{new CurrentAssets(0, 0),
                new TangibleProperty(600, 500)});
        objects.add(new Object[]{new CurrentAssets(9999999, 9999999),
                new TangibleProperty(9999999, 9999999)});
        return objects;
    }

    public FinancialStatementParametersTest( CurrentAssets assets, TangibleProperty tanProperty) {
        this.assets = assets;
        this.tanProperty = tanProperty;
    }

    @Test(expected = AssertionError.class)
    public void given_parameters_when_addAsset_then_error(){
        FinancialStatement fs = new FinancialStatement();
        ArrayList<Asset> temp1 = (ArrayList<Asset>) fs.getAssets().clone();
        fs.addAsset(assets);
        fs.addAsset(tanProperty);
        ArrayList<Asset> temp2 = (ArrayList<Asset>) fs.getAssets().clone();
        assertArrayEquals(temp1.toArray(),temp2.toArray());
    }

}