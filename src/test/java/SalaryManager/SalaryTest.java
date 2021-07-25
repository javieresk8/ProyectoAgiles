package SalaryManager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SalaryTest {
    String cedula = "1755041595";
    double moneyPerHour = 8.5;
    Salary salary;
    IHolidaySchedule holidaySchedule;
    IDigitalClock digitalClock;
    IMedicalCertificate medicalCertificate;
    //ArrayList<ClockRecord> records;

    @Before
    public void setUp(){
        salary = new Salary(cedula, moneyPerHour);

    }



    @Test
    public void given_one_ArrayList_when_calculateHours_then_ok(){
        //ArrayList<ClockRecord> records = (ArrayList<ClockRecord>) digitalClock.getWorkScheduleProfessor(cedula).clone();
        IDigitalClock clock  = Mockito.mock(IDigitalClock.class);
        ClockRecord record = new ClockRecord("1755041595", 2021, 23, 7, 8.5, 17.0);
        ClockRecord record2 = new ClockRecord("1755041595", 2021, 24, 7, 8.5, 17.0);
        ClockRecord record3 = new ClockRecord("1755041595", 2021, 25, 7, 8.5, 17.0);
        ArrayList<ClockRecord> records = new ArrayList<>();
        records.add(record);
        records.add(record2);
        records.add(record3);
        Mockito.when(clock.getWorkScheduleProfessor(cedula)).thenReturn(records);
        assertEquals(8.5*3, salary.calculateHours(records), 0);
    }

    @Test
    public void given_one_ArrayList_when_validateDates_then_return_true(){
        IDigitalClock clock  = Mockito.mock(IDigitalClock.class);
        IHolidaySchedule holidayValidator = Mockito.mock((IHolidaySchedule.class));
        IMedicalCertificate certificateValidator = Mockito.mock(IMedicalCertificate.class);
        ClockRecord record = new ClockRecord("1755041595", 2021, 23, 7, 8.5, 17.0);
        ClockRecord record2 = new ClockRecord("1755041595", 2021, 24, 7, 8.5, 17.0);
        ClockRecord record3 = new ClockRecord("1755041595", 2021, 22, 7, 8.5, 17.0);
        ClockRecord missingDay = new ClockRecord("1755041595", 2021, 26, 7, 0.0, 0.0);
        ClockRecord holiday = new ClockRecord("1755041595", 2021, 25, 7, 0.0, 0.0);

        ArrayList<ClockRecord> records = new ArrayList<>();
        records.add(record);
        records.add(record2);
        records.add(record3);
        records.add(missingDay);
        records.add(holiday);
        //System.out.println("Lenght =" + records.size());
        ArrayList<ClockRecord> recordsCleaned = new ArrayList<>();
        recordsCleaned.add(record);
        recordsCleaned.add(record2);
        recordsCleaned.add(record3);

        Mockito.when(clock.getWorkScheduleProfessor(cedula)).thenReturn(records);
        //System.out.println("Lenght2 =" + records.size());
        //Simulacion de validacion de medical y holiday
        Mockito.when(holidayValidator.validateHoliday(holiday)).thenReturn(true);
        Mockito.when(certificateValidator.validateDateCerticate(missingDay)).thenReturn(true);

        Salary salaryComplete = new Salary(cedula, holidayValidator,  clock,certificateValidator, moneyPerHour);

        assertEquals(recordsCleaned, salaryComplete.validateDates(records));
    }

    @Test
    public void given_one_String_when_calculateTotal_then_return_double(){
        IDigitalClock clock  = Mockito.mock(IDigitalClock.class);
        IHolidaySchedule holidayValidator = Mockito.mock((IHolidaySchedule.class));
        IMedicalCertificate certificateValidator = Mockito.mock(IMedicalCertificate.class);
        ClockRecord record = new ClockRecord("1755041595", 2021, 23, 7, 8.5, 17.0);
        ClockRecord record2 = new ClockRecord("1755041595", 2021, 24, 7, 8.5, 17.0);
        ClockRecord record3 = new ClockRecord("1755041595", 2021, 22, 7, 8.5, 17.0);
        ClockRecord missingDay = new ClockRecord("1755041595", 2021, 26, 7, 0.0, 0.0);
        ClockRecord holiday = new ClockRecord("1755041595", 2021, 25, 7, 0.0, 0.0);

        ArrayList<ClockRecord> records = new ArrayList<>();
        records.add(record);
        records.add(record2);
        records.add(record3);
        records.add(missingDay);
        records.add(holiday);
        //System.out.println("Lenght =" + records.size());
        ArrayList<ClockRecord> recordsCleaned = new ArrayList<>();
        recordsCleaned.add(record);
        recordsCleaned.add(record2);
        recordsCleaned.add(record3);

        Mockito.when(clock.getWorkScheduleProfessor(cedula)).thenReturn(records);
        Mockito.when(holidayValidator.validateHoliday(holiday)).thenReturn(true);
        Mockito.when(certificateValidator.validateDateCerticate(missingDay)).thenReturn(true);

        Salary salaryComplete = new Salary(cedula, holidayValidator,  clock,certificateValidator, moneyPerHour);


        //Calculate total salary
        assertEquals(moneyPerHour*8.5*3, salaryComplete.calculateTotal(cedula), 0);
    }



}