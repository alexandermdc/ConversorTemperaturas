package com.mycompany.app;


public class App 
{
    public static double ConverterFarenheit_Celcius(Double farenheit){
        return (farenheit - 32.0) * 5.0/9.0;
    }
    public static double ConverterCelcius_Farenheit(Double celcius){
        return (celcius * 9.0/5.0) + 32.0;
    }
}
