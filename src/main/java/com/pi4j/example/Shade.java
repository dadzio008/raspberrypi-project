package com.pi4j.example;

import com.pi4j.Pi4J;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.util.Console;

import java.util.concurrent.TimeUnit;

public class Shade {
    private static final int PIN_ROL = 22;
    public static void shadeClosing(){
        final var console = new Console();
        var pi4j = Pi4J.newAutoContext();
        var closeShade = DigitalOutput.newConfigBuilder(pi4j)
                .id("roleta")
                .name("Przełącznik")
                .address(PIN_ROL)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");
        var shadeClose = pi4j.create(closeShade);

            shadeClose.pulse(20,TimeUnit.SECONDS);

        }
    public static void shadeOpening(){
        final var console = new Console();
        var pi4j = Pi4J.newAutoContext();
        var openShade = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(PIN_ROL)
                .shutdown(DigitalState.LOW)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");
        var shadeOpen = pi4j.create(openShade);
        shadeOpen.pulse(20, TimeUnit.SECONDS);

    }
}

