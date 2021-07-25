package SalaryManager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SalaryTest {
    String cedula = "1755041595";
    double moneyPerHour = 5.75;
    Salary salary;
    IHolidaySchedule holidaySchedule;
    IDigitalClock digitalClock;
    IMedicalCertificate medicalCertificate;
    //ArrayList<ClockRecord> records;

    @Before
    public void setUp(){
        salary = new Salary(cedula, moneyPerHour);
        //records = new ArrayList<>();
        //System.out.println("setup");
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

    public void given_one_ClockRecord_when_validateHoliday_then_return_true(){
        IHolidaySchedule schedule = Mockito.mock(IHolidaySchedule.class);
        Mockito.when(schedule.validateHoliday(Mockito.any())).thenReturn(true);
        //assertTrue(schedule.validateHoliday(day, month, year));
    }

//    @Test
//    public void when_calculateTotal_then_return_value(){
//        //Request de work schedule
//        ArrayList<ClockRecord> records;
//        records = digitalClock.getWorkScheduleProfessor(salary.getCedula());
//        //validate holidays
//
//        //validate medicalCertificate
//
//        //Calculate total salary
//        assertEquals(1500, salary.calculateTotal());
//    }



}