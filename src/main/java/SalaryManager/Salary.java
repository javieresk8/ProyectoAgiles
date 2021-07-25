package SalaryManager;

import java.util.ArrayList;

public class Salary {
    private double value;
    private String cedula;
    private IHolidaySchedule holidaySchedule;
    private IDigitalClock digitalClock;
    private IMedicalCertificate medicalCertificate;
    private double moneyPerHour;

    public Salary(String cedula, double moneyPerHour) {
        this.cedula = cedula;
        this.moneyPerHour = moneyPerHour;
    }



    public String getCedula() {
        return cedula;
    }

    public double calculateHours(ArrayList<ClockRecord> records) {
        double hours = 0 ;
        for (ClockRecord record :
                records) {
            double start = record.getTimeStart();
            double end = record.getTimeEnd();
            hours += (end - start);
        }
        return hours;
    }
}
