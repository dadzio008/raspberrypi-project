package com.pi4j.example;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Run());
        EventQueue.invokeLater(() -> new ActionFrame());
    }
}
