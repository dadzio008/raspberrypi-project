package com.pi4j.example.shadeintime;

import com.pi4j.Pi4J;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.util.Console;

import java.util.concurrent.TimeUnit;

public class AllShadeClose {
    public static void shadeClosing(){
        final var console = new Console();
        var pi4j = Pi4J.newAutoContext();
        var closeShadeBedRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(20)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var closeShadeLivingRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(19)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var closeShadeDiningRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(6)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var closeShadeBathRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(17)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var closeShadeUpperRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(12)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.HIGH)
                .provider("pigpio-digital-output");

        var shadeCloseBedroom = pi4j.create(closeShadeBedRoom);
        var shadeCloseLivingRoom = pi4j.create(closeShadeLivingRoom);
        var shadeCloseDiningRoom = pi4j.create(closeShadeDiningRoom);
        var shadeCloseBathRoom = pi4j.create(closeShadeBathRoom);
        var shadeCloseUpperRoom = pi4j.create(closeShadeUpperRoom);

        shadeCloseBedroom.high();
        shadeCloseLivingRoom.high();
        shadeCloseDiningRoom.high();
        shadeCloseBathRoom.high();
        shadeCloseUpperRoom.high();

        shadeCloseBedroom.pulse(20, TimeUnit.SECONDS);
        shadeCloseLivingRoom.pulse(20, TimeUnit.SECONDS);
        shadeCloseDiningRoom.pulse(20, TimeUnit.SECONDS);
        shadeCloseBathRoom.pulse(20, TimeUnit.SECONDS);
        shadeCloseUpperRoom.pulse(20, TimeUnit.SECONDS);


    }
}
