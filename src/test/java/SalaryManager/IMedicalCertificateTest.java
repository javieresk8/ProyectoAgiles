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
    public void given_three_integers_when_validateDateCertificate_then_return_true(){
        IMedicalCertificate certificate = Mockito.mock(IMedicalCertificate.class);
        Mockito.when(certificate.validateDateCerticate(day, month, year)).thenReturn(true);
        assertTrue(certificate.validateDateCerticate(day, month, year));
    }

}