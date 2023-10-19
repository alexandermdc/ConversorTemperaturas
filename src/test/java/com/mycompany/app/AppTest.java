package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public static void FailureTesteFarenheit_Celcius(){
        assertEquals(32.0, App.ConverterFarenheit_Celcius(1.0), 0.0);
    }
}
