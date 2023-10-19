package com.mycompany.app;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void FailureTesteFarenheit_Celcius(){
        assertEquals(20.5, App.ConverterFarenheit_Celcius(32.0), 0.0)
    }
}
