package FinancialSheet;

import java.util.ArrayList;

public class FinancialStatement {
    private TangibleProperty tangibleProperty;
    private CurrentAssets currentAssets;
    private IBankAccount IBankAccount;
    private double totalAssets;
    private ArrayList<Asset> assets;

    public FinancialStatement(TangibleProperty tangibleProperty, CurrentAssets currentAssets,
                              IBankAccount IBankAccount, double totalAssets, ArrayList<Asset> assets) {
        this.tangibleProperty = tangibleProperty;
        this.currentAssets = currentAssets;
        this.IBankAccount = IBankAccount;
        this.totalAssets = totalAssets;
        this.assets = assets;
    }

    public FinancialStatement() {
        this.tangibleProperty = new TangibleProperty();
        this.currentAssets = new CurrentAssets();
        this.assets = new ArrayList<>();

    }

    //Getters and Setters

    public TangibleProperty getTangibleProperty() {
        return tangibleProperty;
    }

    public void setTangibleProperty(TangibleProperty tangibleProperty) {
        this.tangibleProperty = tangibleProperty;
    }

    public CurrentAssets getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(CurrentAssets currentAssets) {
        this.currentAssets = currentAssets;
    }

    public IBankAccount getBankAccount() {
        return IBankAccount;
    }

    public void setBankAccount(IBankAccount IBankAccount) {
        this.IBankAccount = IBankAccount;
    }

    public double getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(double totalAssets) {
        this.totalAssets = totalAssets;
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    public boolean validateTotal() {
        return this.tangibleProperty.calculateTotal() +
                this.currentAssets.calculateTotal() > 0;
    }

    public double calculateTotalAssets() {
        double total = 0;
        for (Asset s: assets) {
            total+=s.calculateTotal();
        }
        return total;
    }

    public void addAsset(Asset asset) {
        assets.add(asset);
    }
}
