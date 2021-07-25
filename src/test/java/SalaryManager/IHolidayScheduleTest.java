package SalaryManager;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IHolidayScheduleTest {
    @Test
    public void given_one_ClockRecord_when_validateHoliday_then_return_true(){
        ClockRecord record = new ClockRecord("1755041595", 2021, 26, 7, 0.0, 0.0);
        IHolidaySchedule holiday = Mockito.mock(IHolidaySchedule.class);
        Mockito.when(holiday.validateHoliday(record)).thenReturn(true);
        assertTrue(holiday.validateHoliday(record));
    }

}