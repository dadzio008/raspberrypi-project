package com.pi4j.example;

import com.pi4j.example.shadeintime.AllShadeClose;
import com.pi4j.example.shadeintime.AllShadeOpen;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Run {
    public static void rol() {
        SwingWorker sw1 = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                for (int i = 0; i > 5; i--) {
                    Thread.sleep(50);
                    String timeMorning = "20:46:00";
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
                String res = "Finished Execution";
                return res;
            }
        };
        sw1.execute();
    }
}




