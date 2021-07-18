package FinancialSheet;

public class ActualEstate implements Estate{
    private double capitalAccount;
    private double businessAccount;
    private double loss;

    public ActualEstate(double capitalAccount, double businessAccount, double loss) {
        this.capitalAccount = capitalAccount;
        this.businessAccount = businessAccount;
        this.loss = loss;
    }
    public ActualEstate(){
        this.capitalAccount = 0;
        this.businessAccount = 0;
        this.loss = 0;
    }
    public double addCapitalAccount(double value){
        return this.capitalAccount += value;
    }
    public double addBusinessAccount(double value){
        return this.businessAccount += value;
    }
    public double addLoss(double value){
        return this.loss += value;
    }

    public double calculateTotalBusiness() {
        double temp;
        temp = -(this.businessAccount - this.loss);
        return temp;
    }
    @Override
    public double calculateTotalCapital(){
        double temp;
        temp = this.capitalAccount - this.loss;
        return temp;

    }
    @Override
    public boolean validateTotal() {
        return this.loss + this.businessAccount + this.capitalAccount > 0;
    }
    // Getters and Setters
    public double getCapitalAccount() {
        return capitalAccount;
    }

    public void setCapitalAccount(double capitalAccount) {
        this.capitalAccount = capitalAccount;
    }

    public double getBusinessAccount() {
        return businessAccount;
    }

    public void setBusinessAccount(double businessAccount) {
        this.businessAccount = businessAccount;
    }

    public double getLoss() {
        return loss;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }





}
