package FinancialSheet;

import java.util.ArrayList;

public class FinancialStatement {
    private TangibleProperty tangibleProperty;
    private CurrentAssets currentAssets;
    private IBankAccount IBankAccount;
    private double totalAssets;
    private ArrayList<Asset> assets;
    private ActualEstate actualEstate;
    private CurrentLiability currentLiability;
    private ArrayList<Liability> liabilities;
    private double totalLiabilities;
    private ArrayList<Estate> estates;
    private double totalEstates;

    public FinancialSheet.IBankAccount getIBankAccount() {
        return IBankAccount;
    }

    public void setIBankAccount(FinancialSheet.IBankAccount IBankAccount) {
        this.IBankAccount = IBankAccount;
    }

    public ArrayList<Liability> getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(ArrayList<Liability> liabilities) {
        this.liabilities = liabilities;
    }

    public void setEstates(ArrayList<Estate> estates) {
        this.estates = estates;
    }

    public FinancialStatement(ArrayList<Estate> estates, TangibleProperty tangibleProperty, CurrentAssets currentAssets,
                              IBankAccount IBankAccount, double totalAssets, ArrayList<Asset> assets, ActualEstate actualEstate,
                              CurrentLiability currentLiability, ArrayList<Liability> liabilities, double totalLiabilities,
                              double totalEstates) {
        this.tangibleProperty = tangibleProperty;
        this.currentAssets = currentAssets;
        this.IBankAccount = IBankAccount;
        this.totalAssets = totalAssets;
        this.assets = assets;
        this.actualEstate = actualEstate;
        this.currentLiability = currentLiability;
        this.liabilities = liabilities;
        this.totalLiabilities = totalLiabilities;
        this.totalEstates = totalEstates;
        this.estates=estates;
    }

    public FinancialStatement() {
        this.tangibleProperty = new TangibleProperty();
        this.currentAssets = new CurrentAssets();
        this.assets = new ArrayList<>();
        this.estates = new ArrayList<>();
    }

    //Getters and Setters

    public ActualEstate getActualEstate() {
        return actualEstate;
    }

    public void setActualEstate(ActualEstate actualEstate) {
        this.actualEstate = actualEstate;
    }

    public CurrentLiability getCurrentLiability() {
        return currentLiability;
    }

    public void setCurrentLiability(CurrentLiability currentLiability) {
        this.currentLiability = currentLiability;
    }

    public double getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(double totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public double getTotalEstates() {
        return totalEstates;
    }

    public void setTotalEstates(double totalEstates) {
        this.totalEstates = totalEstates;
    }

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

    public ArrayList<Estate> getEstates() {
        return estates;
    }

    public FinancialStatement(TangibleProperty tangibleProperty, CurrentAssets currentAssets, FinancialSheet.IBankAccount IBankAccount, double totalAssets, ArrayList<Asset> assets, ActualEstate actualEstate, CurrentLiability currentLiability, ArrayList<Liability> liabilities, double totalLiabilities, ArrayList<Estate> estates, double totalEstates) {
        this.tangibleProperty = tangibleProperty;
        this.currentAssets = currentAssets;
        this.IBankAccount = IBankAccount;
        this.totalAssets = totalAssets;
        this.assets = assets;
        this.actualEstate = actualEstate;
        this.currentLiability = currentLiability;
        this.liabilities = liabilities;
        this.totalLiabilities = totalLiabilities;
        this.estates = estates;
        this.totalEstates = totalEstates;
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
    public double calculateTotalLiability(){
            double total = 0;
            for(Liability l: liabilities){
                total+=l.calculateTotal();
            }
            return total;
    }
    public double calculateTotalEstate(){
        double total = 0;
        for(Estate e: estates){
            total+=e.calculateTotalCapital();
        }
        return total;
    }
    public void addAsset(Asset asset) {
        assets.add(asset);
    }
    public void addEstate(Estate estate){
        estates.add(estate);
    }

    public void addLiability(Liability liability){
        liabilities.add(liability);
    }
}
