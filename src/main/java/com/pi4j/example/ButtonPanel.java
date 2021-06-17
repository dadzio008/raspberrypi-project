package com.pi4j.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {

    public static final int HEIGHT = 200;
    public static final int WIDTH = 600;
    private JButton buttonOnSleep;
    private JButton buttonOffSleep;
    private JButton buttonOnDayRoom;
    private JButton buttonOffDayRoom;



    public ButtonPanel(){
        buttonOnSleep = new JButton("Turn On SleepRoom");
        buttonOffSleep = new JButton("Turn Off SleepRoom");

        buttonOffSleep.addActionListener(this);
        buttonOnSleep.addActionListener(this);
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(buttonOffSleep);
        add(buttonOnSleep);
    }

    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source == buttonOnSleep)
            Shade.shadeOpening();
        else if (source == buttonOffSleep)
            Shade.shadeClosing();
    }
}
