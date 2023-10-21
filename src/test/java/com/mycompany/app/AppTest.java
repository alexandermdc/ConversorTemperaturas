package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
   /*  @Test
    public void FailureTesteFarenheitCelcius(){
        assertEquals(0.0, App.ConverterFarenheit_Celcius(31.0),0.0);
    }
    @Test
    public void FailureTesteCelciusFarenheit(){
        assertEquals(32.0, App.ConverterCelcius_Farenheit(2.0),0.0);
    }*/
    @Test
    public void SucessTestesFarenheitCelcius(){
        assertEquals(-17.77777777777778, App.ConverterFarenheit_Celcius(0.0), 0.0);
        assertEquals(10.0, App.ConverterFarenheit_Celcius(50.0), 0.0);
        assertEquals(-1.1111111111111112, App.ConverterFarenheit_Celcius(30.0), 0.0);
    }
    @Test
    public void SucessTestesCelciusFarenheit(){
        assertEquals(50.0, App.ConverterCelcius_Farenheit(10.0), 0.0);
        assertEquals(221.0, App.ConverterCelcius_Farenheit(105.0), 0.0);
        assertEquals(5.0, App.ConverterCelcius_Farenheit(-15.0), 0.0);
    }
}
