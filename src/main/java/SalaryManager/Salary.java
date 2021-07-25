package SalaryManager;

import java.util.ArrayList;

public class Salary {
    private String cedula;
    private IHolidaySchedule holidaySchedule;
    private IDigitalClock digitalClock;
    private IMedicalCertificate medicalCertificate;
    private double moneyPerHour;

    public Salary(String cedula, double moneyPerHour) {
        this.cedula = cedula;
        this.moneyPerHour = moneyPerHour;
    }

    public Salary(String cedula, IHolidaySchedule holidaySchedule, IDigitalClock digitalClock,
                  IMedicalCertificate medicalCertificate, double moneyPerHour) {

        this.cedula = cedula;
        this.holidaySchedule = holidaySchedule;
        this.digitalClock = digitalClock;
        this.medicalCertificate = medicalCertificate;
        this.moneyPerHour = moneyPerHour;
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

    public ArrayList<ClockRecord> validateDates(ArrayList<ClockRecord> records) {
        ArrayList<ClockRecord> datesValidated = new ArrayList<>();
        boolean holidayFlag = false;
        boolean medicalFlag = false;
        for (ClockRecord record :
                records) {
            if(record.getTimeStart() == 0.0 && record.getTimeEnd() ==0.0){
                //Verifica que no este en los registros de fechas feriado o permiso medico
                //Retorna true si el dia esta NO esta justificado,
                // false caso contrario
                holidayFlag = holidaySchedule.validateHoliday(record);
                medicalFlag = medicalCertificate.validateDateCerticate(record);
            }
            if(!holidayFlag && !medicalFlag){
                datesValidated.add(record);
            }
        }
        return datesValidated;
    }

    public double calculateTotal(String cedula) {
        ArrayList<ClockRecord> recordsProfessor = (ArrayList<ClockRecord>) digitalClock.getWorkScheduleProfessor(cedula).clone();
        recordsProfessor = (ArrayList<ClockRecord>) validateDates(recordsProfessor).clone();
        double hoursWorked;
        hoursWorked = calculateHours(recordsProfessor);
        return calculateMoney(hoursWorked);
    }

    private double calculateMoney(double hoursWorked) {
        return hoursWorked * this.moneyPerHour;
    }

}
