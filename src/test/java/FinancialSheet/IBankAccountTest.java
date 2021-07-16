package FinancialSheet;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IBankAccountTest {

    @Test
    public void when_calculateBankValue_then_ok(){
        IBankAccount b = Mockito.mock(IBankAccount.class);
        Mockito.when(b.calculateBankValue()).thenReturn(5000.0);
        assertEquals(5000.0, b.calculateBankValue(), 0);
    }

}