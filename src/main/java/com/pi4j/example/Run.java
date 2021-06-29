package com.pi4j.example;

import com.pi4j.example.shadeintime.AllShadeClose;
import com.pi4j.example.shadeintime.AllShadeOpen;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Run extends Thread {
    public void run() {
        for (int i = 1; i < 5; i--) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println(e);
            }

            String timeMorning = "19:18:00";
            String timeEvening = "23:12:00";
            String pattern = "HH:mm:ss";
            Date time = Calendar.getInstance().getTime();
            DateFormat df = new SimpleDateFormat(pattern);
            String timeAsString = df.format(time);
            if (timeAsString.equals(timeEvening)) {
                AllShadeClose.shadeClosing();
                System.out.println("Wszystkie rolety zostały zamknięte");
            } else if (timeAsString.equals(timeMorning)) {
                AllShadeOpen.shadeOpening();
                System.out.println("Wszystkie rolety zostały otwarte");
            } else {
                System.err.println("Coś poszło nie tak");


            }
        }
    }
            public static void main (String args[]){
                Run run1 = new Run();

                run1.start();
                EventQueue.invokeLater(ActionFrame::new);
            }
        }









