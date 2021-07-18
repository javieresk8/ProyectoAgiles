package FinancialSheet;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;

public class FinancialStatementTest {
    FinancialStatement fs = null;
    CurrentAssets assets;
    TangibleProperty tanProperty;
    CurrentLiability tanLiability;
    ActualEstate tanEstate;
    Estate estate;
    @Before
    public void setUp(){
        fs = new FinancialStatement();
        assets = new CurrentAssets();
        tanProperty = new TangibleProperty();
        tanEstate = new ActualEstate();
        tanLiability = new CurrentLiability();
        assets.setInventoryValue(500);
        assets.setPettyCashValue(500);
        tanProperty.setFurnitureValue(500);
        tanProperty.setVehiclesValue(500);
        tanEstate.setBusinessAccount(40);
        tanEstate.setBusinessAccount(40);
        tanLiability.setAccountPayable(100);
        tanLiability.setAccountPayable(100);
        tanEstate.setCapitalAccount(40);
        tanEstate.setCapitalAccount(40);
        tanEstate.setLoss(20);
        tanEstate.setLoss(20);
    }

    @Test (expected = AssertionError.class)
    public void given_one_Asset_when_addAsset_then_error(){
        ArrayList<Asset> temp1 = (ArrayList<Asset>) fs.getAssets().clone();
        fs.addAsset(assets);
        fs.addAsset(tanProperty);
        ArrayList<Asset> temp2 = (ArrayList<Asset>) fs.getAssets().clone();
        assertArrayEquals(temp1.toArray(),temp2.toArray());
    }
    @Test
    public void given_one_Estate_when_addEstate_then_ok(){
        ArrayList<Estate> temp1 = (ArrayList<Estate>) fs.getEstates().clone();
        fs.addEstate(tanEstate);
        ArrayList<Estate> temp2 = (ArrayList<Estate>) fs.getEstates().clone();
        assertNotSame(temp1,temp2);
    }

    @Test
    public void when_calculateTotalAssets_then_ok(){
        fs.addAsset(tanProperty);
        fs.addAsset(assets);
        assertEquals(2000, fs.calculateTotalAssets(), 0);
    }

    @Test
    public void when_validateTotal_then_ok(){
        assertFalse(fs.validateTotal());
    }

    //In order to use Mockito



}