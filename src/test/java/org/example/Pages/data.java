package org.example.Pages;

import java.util.Random;

public class data {
    public static String FirstName = "Mohamed";
    public static String SecondName = "Salah";
    public static String CompanyName = "test";

    static Random random = new Random();
    static int randomInt  = random.nextInt(800)+100;
    public static String Email = "user"+randomInt +"@gmail.com";

    public static String Password = "12345678";
    public static String DayDOB = "10";
    public static String MonthDOB = "12";
    public static String YearDOB = "1997";



}
