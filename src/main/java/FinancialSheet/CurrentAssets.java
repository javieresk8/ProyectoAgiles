package FinancialSheet;

public class CurrentAssets implements Asset{
    private double pettyCashValue;
    private double inventoryValue;

    public CurrentAssets (double inventoryValue, double pettyCashValue) {
        this.inventoryValue = inventoryValue;
        this.pettyCashValue = pettyCashValue;
    }

    public CurrentAssets(){
        this.inventoryValue = 0;
        this.pettyCashValue = 0;
    }

    public double addPettyCashValue(double value) {
        return  this.pettyCashValue += value;
    }

    public double addInventoryValue(double value) {
        return this.inventoryValue+=value;
    }

    public double calculateTotal() {
        return this.inventoryValue + this.pettyCashValue;
    }


    //Getters and Setters
    public double getPettyCashValue() {
        return pettyCashValue;
    }

    public void setPettyCashValue(double pettyCashValue) {
        this.pettyCashValue = pettyCashValue;
    }

    public double getInventoryValue() {
        return inventoryValue;
    }

    public void setInventoryValue(double inventoryValue) {
        this.inventoryValue = inventoryValue;
    }

    public boolean validateTotal() {
        return this.pettyCashValue + this.inventoryValue > 0;
    }
}

