package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void FailureTesteFarenheitCelcius(){
        assertEquals(32.1, App.ConverterFarenheit_Celcius(0.0),0.0);
    }
    @Test
    public void FailureTesteCelciusFarenheit(){
        assertEquals(0.0, App.ConverterFarenheit_Celcius(55.0),0.0);
    }
}
