package SalaryManager;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IDigitalClockTest {
    String cedula = "1755041595";
    @Test
    public void given_one_String_when_getWorkScheduleProfesso_then_return_array(){
        IDigitalClock clock  = Mockito.mock(IDigitalClock.class);
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
        //Simula que retorna todos los registros
        Mockito.when(clock.getWorkScheduleProfessor(cedula)).thenReturn(records);
        assertEquals(records, clock.getWorkScheduleProfessor(cedula));
    }
}