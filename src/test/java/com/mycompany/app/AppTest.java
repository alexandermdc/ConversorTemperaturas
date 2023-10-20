package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    void FailureTesteFarenheitCelcius(){
        App.ConverterFarenheit_Celcius(null);
    }
    @Test
    void FailureTesteCelciusFarenheit(){
        App.ConverterCelcius_Farenheit(null);
    }
}
