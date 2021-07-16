package FinancialSheet;

public class TangibleProperty implements Asset {
    private double vehiclesValue;
    private double furnitureValue;

    public TangibleProperty(double vehiclesValue, double furnitureValue) {
        this.vehiclesValue = vehiclesValue;
        this.furnitureValue = furnitureValue;
    }

    public TangibleProperty() {
        this.furnitureValue = 0;
        this.vehiclesValue = 0;
    }



    //Getters and Setters
    public double getVehiclesValue() {
        return vehiclesValue;
    }

    public void setVehiclesValue(double vehiclesValue) {
        this.vehiclesValue = vehiclesValue;
    }

    public double getFurnitureValue() {
        return furnitureValue;
    }

    public void setFurnitureValue(double furnitureValue) {
        this.furnitureValue = furnitureValue;
    }

    public double addVehiclesValue(double value) {
        return this.vehiclesValue += value;
    }

    public double addFurnitureValue(double value) {
        return this.furnitureValue += value;
    }

    public double calculateTotal() {
        return this.furnitureValue + this.vehiclesValue;
    }

    public boolean validateTotal() {
        return this.vehiclesValue + this.furnitureValue > 0;
    }
}
