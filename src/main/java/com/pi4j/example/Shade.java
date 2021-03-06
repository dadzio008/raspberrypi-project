package com.pi4j.example;

import com.pi4j.Pi4J;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.util.Console;

import java.util.concurrent.TimeUnit;

public class Shade {
    public static void shadeOperation(int zmienna){
        final var console = new Console();
        var pi4j = Pi4J.newAutoContext();
        var shadeMove = DigitalOutput.newConfigBuilder(pi4j)
                .id("roleta")
                .name("Przełącznik")
                .address(zmienna)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");
        var move = pi4j.create(shadeMove);


        try {
            move.low();
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        move.high();

    }


}

