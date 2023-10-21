package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void FailureTesteFarenheitCelcius(){
        assertEquals(0.0, App.ConverterFarenheit_Celcius(32.0),0.0);
    }
    @Test
    public void FailureTesteCelciusFarenheit(){
        assertEquals(32.0, App.ConverterCelcius_Farenheit(0.0),0.0);
    }
}
