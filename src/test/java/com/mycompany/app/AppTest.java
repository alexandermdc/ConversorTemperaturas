package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void FailureTesteFarenheitCelcius(){
        assertEquals(2.1, App.ConverterFarenheit_Celcius(32.0), 0.0);
    }
}
