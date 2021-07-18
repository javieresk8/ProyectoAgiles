package FinancialSheet;

public class CurrentLiability implements Liability {
    private double accountPayable;

    public CurrentLiability(double accountPayable) {
        this.accountPayable = accountPayable;
    }
    public CurrentLiability(){
        this.accountPayable=0;
    }
    public double addLiability(double value) {
        return this.accountPayable += value;
    }
    public double calculateTotal() {
        double temp = this.accountPayable;
        return temp;
    }


    public boolean validateTotal() {
        double temp = this.accountPayable;
        if(temp>0){
            return true;
        }else{
            return false;
        }

    }

    public double getAccountPayable() {
        return accountPayable;
    }

    public void setAccountPayable(double accountPayable) {
        this.accountPayable = accountPayable;
    }
}
