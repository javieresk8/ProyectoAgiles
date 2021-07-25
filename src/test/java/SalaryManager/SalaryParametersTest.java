package SalaryManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class SalaryParametersTest {
    private String cedula;
    private IHolidaySchedule holidaySchedule;
    private IDigitalClock digitalClock;
    private IMedicalCertificate medicalCertificate;
    private double moneyPerHour;
    private double expected;

    @Before
    public void setUp(){
        cedula = "1755041595";
    }
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        IDigitalClock clock  = Mockito.mock(IDigitalClock.class);
        IHolidaySchedule holidayValidator = Mockito.mock((IHolidaySchedule.class));
        IMedicalCertificate certificateValidator = Mockito.mock(IMedicalCertificate.class);
        ClockRecord record = new ClockRecord("1755041595", 2021, 23, 7, 8.5, 17.0);
        ClockRecord record2 = new ClockRecord("1755041595", 2021, 24, 7, 8.5, 17.0);
        ClockRecord record3 = new ClockRecord("1755041595", 2021, 22, 7, 8.5, 17.0);
        ClockRecord missingDay = new ClockRecord("1755041595", 2021, 26, 7, 0.0, 0.0);
        ClockRecord holiday = new ClockRecord("1755041595", 2021, 25, 7, 0.0, 0.0);
        ClockRecord record4 = new ClockRecord("1755041595", 2021, 27, 7, 8.5, 17.0);
        ClockRecord record5 = new ClockRecord("1755041595", 2021, 28, 7, 8.5, 17.0);
        ClockRecord missingDay2 = new ClockRecord("1755041595", 2021, 29, 7, 0.0, 0.0);
        ClockRecord holiday2 = new ClockRecord("1755041595", 2021, 30, 7, 0.0, 0.0);

        ArrayList<ClockRecord> records = new ArrayList<>();
        records.add(record);
        records.add(record2);

        Mockito.when(clock.getWorkScheduleProfessor("1755041595")).thenReturn(records);
        Mockito.when(holidayValidator.validateHoliday(holiday)).thenReturn(true);
        Mockito.when(certificateValidator.validateDateCerticate(missingDay)).thenReturn(true);
        objects.add(new Object[]{"1755041595", holidayValidator, clock,certificateValidator, 9, 8.5*2*9 });

        ArrayList<ClockRecord> records2 = new ArrayList<>();
        IDigitalClock clock2  = Mockito.mock(IDigitalClock.class);
        IHolidaySchedule holidayValidator2 = Mockito.mock((IHolidaySchedule.class));
        IMedicalCertificate certificateValidator2 = Mockito.mock(IMedicalCertificate.class);
        records2.add(record);
        records2.add(record2);
        records2.add(record3);
        Mockito.when(clock2.getWorkScheduleProfessor("1755041595")).thenReturn(records2);
        Mockito.when(holidayValidator2.validateHoliday(holiday)).thenReturn(true);
        Mockito.when(certificateValidator2.validateDateCerticate(missingDay)).thenReturn(true);
        objects.add(new Object[]{"1755041595", holidayValidator2, clock2,certificateValidator2, 9, 8.5*3*9 });

        ArrayList<ClockRecord> records3 = new ArrayList<>();
        IDigitalClock clock3  = Mockito.mock(IDigitalClock.class);
        IHolidaySchedule holidayValidator3 = Mockito.mock((IHolidaySchedule.class));
        IMedicalCertificate certificateValidator3 = Mockito.mock(IMedicalCertificate.class);
        records3.add(record);
        records3.add(record2);
        records3.add(record3);
        records3.add(record4);
        records3.add(record5);
        records3.add(holiday2);
        records3.add(missingDay2);
        Mockito.when(clock3.getWorkScheduleProfessor("1755041595")).thenReturn(records3);
        Mockito.when(holidayValidator3.validateHoliday(holiday)).thenReturn(true);
        Mockito.when(certificateValidator2.validateDateCerticate(missingDay)).thenReturn(true);
        objects.add(new Object[]{"1755041595", holidayValidator3, clock3,certificateValidator3, 9, 8.5*5*9 });

        return objects;
    }

    public SalaryParametersTest(String cedula, IHolidaySchedule holidaySchedule, IDigitalClock digitalClock, IMedicalCertificate medicalCertificate, double moneyPerHour, double expected) {

        this.cedula = cedula;
        this.holidaySchedule = holidaySchedule;
        this.digitalClock = digitalClock;
        this.medicalCertificate = medicalCertificate;
        this.moneyPerHour = moneyPerHour;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_calculateTotal_then_return_double(){
        Salary salary = new Salary(cedula, holidaySchedule, digitalClock,
                medicalCertificate, moneyPerHour);
        double actual = salary.calculateTotal(cedula);
        assertEquals(expected, actual, 0 );

    }
}