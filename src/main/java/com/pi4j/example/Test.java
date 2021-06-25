package com.pi4j.example;

import com.pi4j.example.shadeintime.AllShadeClose;
import com.pi4j.example.shadeintime.AllShadeOpen;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActionFrame();

            }
        });
        Run.rol();

//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }




    }
}


