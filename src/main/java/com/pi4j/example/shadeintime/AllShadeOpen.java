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
                .id("Roleta5")
                .name("Przełącznik5")
                .address(21)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var openShadeLivingRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta6")
                .name("Przełącznik6")
                .address(26)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var openShadeDiningRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta7")
                .name("Przełącznik7")
                .address(13)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var openShadeBathRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta8")
                .name("Przełącznik8")
                .address(27)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var openShadeUpperRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta9")
                .name("Przełącznik9")
                .address(16)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var shadeOpenBedroom = pi4j.create(openShadeBedRoom);
        var shadeOpenLivingRoom = pi4j.create(openShadeLivingRoom);
        var shadeOpenDiningRoom = pi4j.create(openShadeDiningRoom);
        var shadeOpenBathRoom = pi4j.create(openShadeBathRoom);
        var shadeOpenUpperRoom = pi4j.create(openShadeUpperRoom);

        


        try {
            shadeOpenBedroom.low();
            shadeOpenLivingRoom.low();
            shadeOpenDiningRoom.low();
            shadeOpenBathRoom.low();
            shadeOpenUpperRoom.low();
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shadeOpenBedroom.high();
        shadeOpenLivingRoom.high();
        shadeOpenDiningRoom.high();
        shadeOpenBathRoom.high();
        shadeOpenUpperRoom.high();
    }
}
