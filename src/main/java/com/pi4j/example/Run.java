package com.pi4j.example;

import com.pi4j.example.shadeintime.AllShadeClose;
import com.pi4j.example.shadeintime.AllShadeOpen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Run {
    public static void rol() {
        String timeMorning = "20:46:00";
        String timeEvening = "23:12:00";
        String pattern = "HH:mm:ss";
        Date time = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat(pattern);
        String timeAsString = df.format(time);
        if (timeAsString.equals(timeEvening)){
            AllShadeClose.shadeClosing();
            System.out.println("Wszystkie rolety zostały zamknięte");
        }else if (timeAsString.equals(timeMorning)){
            AllShadeOpen.shadeOpening();
            System.out.println("Wszystkie rolety zostały otwarte");
        }else {
            System.err.println("Coś poszło nie tak");
        }

    }

}

