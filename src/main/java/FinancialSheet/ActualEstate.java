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
    public double calculateTotal() {
        double temp;
        temp = this.businessAccount + this.loss + this.capitalAccount;
        return temp;
    }
    public boolean validateTotal() {
        double temp = this.businessAccount + this.capitalAccount + this.loss;
        if (temp > 0){
            return true;
        }else {
            return false;
        }

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
