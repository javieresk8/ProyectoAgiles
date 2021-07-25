package SalaryManager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IMedicalCertificateTest {
    int day;
    int month;
    int year;

    @Before
    public void setUp(){
        day = 23;
        month = 7;
        year = 2021;

    }

    @Test
    public void given_one_ClockRecord_when_validateDateCertificate_then_return_true(){
        ClockRecord record = new ClockRecord("1755041595", 2021, 26, 7, 0.0, 0.0);
        IMedicalCertificate certificate = Mockito.mock(IMedicalCertificate.class);
        Mockito.when(certificate.validateDateCerticate(record)).thenReturn(true);
        assertTrue(certificate.validateDateCerticate(record));
    }

}