package com.pi4j.example.shadeintime;

import com.pi4j.Pi4J;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.util.Console;

import java.util.concurrent.TimeUnit;

public class AllShadeOpen {
    public static void shadeOpening(){
        final var console = new Console();
        var pi4j = Pi4J.newAutoContext();

        var openShadeBedRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(21)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var openShadeLivingRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(26)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var openShadeDiningRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(13)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var openShadeBathRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(27)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var openShadeUpperRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(16)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var shadeOpenBedroom = pi4j.create(openShadeBedRoom);
        var shadeOpenLivingRoom = pi4j.create(openShadeLivingRoom);
        var shadeOpenDiningRoom = pi4j.create(openShadeDiningRoom);
        var shadeOpenBathRoom = pi4j.create(openShadeBathRoom);
        var shadeOpenUpperRoom = pi4j.create(openShadeUpperRoom);

        shadeOpenBedroom.high();
        shadeOpenLivingRoom.high();
        shadeOpenDiningRoom.high();
        shadeOpenBathRoom.high();
        shadeOpenUpperRoom.high();

        shadeOpenBedroom.pulse(20, TimeUnit.SECONDS);
        shadeOpenLivingRoom.pulse(20, TimeUnit.SECONDS);
        shadeOpenDiningRoom.pulse(20, TimeUnit.SECONDS);
        shadeOpenBathRoom.pulse(20, TimeUnit.SECONDS);
        shadeOpenUpperRoom.pulse(20, TimeUnit.SECONDS);


    }
}
