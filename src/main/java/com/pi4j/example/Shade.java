package com.pi4j.example;

import com.pi4j.Pi4J;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.util.Console;

import java.util.concurrent.TimeUnit;

public class Shade {
//    private static final int PIN_ROLO = new Pin;
//    private static final int PIN_ROLC = 20;
    public static void shadeOperation(int zmienna){
        final var console = new Console();
        var pi4j = Pi4J.newAutoContext();
        var shadeMove = DigitalOutput.newConfigBuilder(pi4j)
                .id("roleta")
                .name("Przełącznik")
                .address(zmienna)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");
        var move = pi4j.create(shadeMove);
        move.low();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}

