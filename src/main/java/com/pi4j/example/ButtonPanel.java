package com.pi4j.example;

import com.pi4j.example.shadeintime.AllShadeClose;
import com.pi4j.example.shadeintime.AllShadeOpen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {

    public static final int HEIGHT = 200;
    public static final int WIDTH = 500;
    private final JButton buttonOpenBedroom;
    private final JButton buttonCloseBedroom;
    private final JButton buttonOpenLivingRoom;
    private final JButton buttonCloseLivingRoom;
    private final JButton buttonOpenDiningRoom;
    private final JButton buttonCloseDiningRoom;
    private final JButton buttonOpenBathroom;
    private final JButton buttonCloseBathroom;
    private final JButton buttonOpenUpperRoom;
    private final JButton buttonCloseUpperRoom;
    private final JButton buttonOpenAllShades;
    private final JButton buttonCloseAllShades;


    public ButtonPanel() {
        buttonOpenBedroom = new JButton("Bedroom Open Shade");
        buttonCloseBedroom = new JButton("Bedroom Close Shade");
        buttonOpenLivingRoom = new JButton("LivingRoom Open Shade");
        buttonCloseLivingRoom = new JButton("LivingRoom Close Shade");
        buttonOpenDiningRoom = new JButton("DiningRoom Open Shade");
        buttonCloseDiningRoom = new JButton("DiningRoom Close Shade");
        buttonOpenBathroom = new JButton("Bathroom Open Shade");
        buttonCloseBathroom = new JButton("Bathroom Close Shade");
        buttonOpenUpperRoom = new JButton("Upper Room Open Shade");
        buttonCloseUpperRoom = new JButton("Upper Room Close Shade");
        buttonOpenAllShades = new JButton("Open All Shades");
        buttonCloseAllShades = new JButton("Close All Shades");

        buttonCloseBedroom.addActionListener(this);
        buttonOpenBedroom.addActionListener(this);
        buttonOpenLivingRoom.addActionListener(this);
        buttonCloseLivingRoom.addActionListener(this);
        buttonOpenDiningRoom.addActionListener(this);
        buttonCloseDiningRoom.addActionListener(this);
        buttonOpenBathroom.addActionListener(this);
        buttonCloseBathroom.addActionListener(this);
        buttonOpenUpperRoom.addActionListener(this);
        buttonCloseUpperRoom.addActionListener(this);
        buttonOpenAllShades.addActionListener(this);
        buttonCloseAllShades.addActionListener(this);

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(buttonOpenBedroom);
        add(buttonCloseBedroom);
        add(buttonOpenLivingRoom);
        add(buttonCloseLivingRoom);
        add(buttonOpenDiningRoom);
        add(buttonCloseDiningRoom);
        add(buttonOpenBathroom);
        add(buttonCloseBathroom);
        add(buttonOpenUpperRoom);
        add(buttonCloseUpperRoom);
        add(buttonOpenAllShades);
        add(buttonCloseAllShades);

    }

    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (buttonOpenBedroom == source) {
            Shade.shadeOperation(21);
        } else if (buttonCloseBedroom == source) {
            Shade.shadeOperation(20);
        } else if (buttonOpenLivingRoom == source) {
            Shade.shadeOperation(26);
        } else if (buttonCloseLivingRoom == source) {
            Shade.shadeOperation(19);
        } else if (buttonOpenDiningRoom == source) {
            Shade.shadeOperation(13);
        } else if (buttonCloseDiningRoom == source) {
            Shade.shadeOperation(6);
        } else if (buttonOpenBathroom == source) {
            Shade.shadeOperation(27);
        } else if (buttonCloseBathroom == source) {
            Shade.shadeOperation(17);
        } else if (buttonOpenUpperRoom == source) {
            Shade.shadeOperation(16);
        } else if (buttonCloseUpperRoom == source) {
            Shade.shadeOperation(12);
        } else if (buttonOpenAllShades == source){
        AllShadeOpen.shadeOpening();
        } else if (buttonCloseAllShades == source){
        AllShadeClose.shadeClosing();
    }
    }

}
