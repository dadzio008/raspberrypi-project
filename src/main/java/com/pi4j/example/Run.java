package com.pi4j.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Run {
    public Run() {
        String timeMorning = "19:47";
        String timeEvening = "21:30";
        String pattern = "HH:mm";
        Date time = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat(pattern);
        String timeAsString = df.format(time);
        if (timeAsString.equals(timeEvening)){
            Shade.shadeClosing();
            System.out.println("rolety zostały zamknięte");
        }else if (timeAsString.equals(timeMorning)){
            Shade.shadeOpening();
            System.out.println("rolety zostały otwarte");
        }else {
            System.err.println("Coś poszło nie tak");
        }

    }
}