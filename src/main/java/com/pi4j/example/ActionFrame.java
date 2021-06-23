package com.pi4j.example;

import javax.swing.*;

public class ActionFrame extends JFrame{ //implements Runnable{
    public ActionFrame() {
        super("Test");


        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


//    @Override
//    public void run() {
//        for (int i = 0; i>5; i--){
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
