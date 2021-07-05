package com.pi4j.example.shadeintime;

import com.pi4j.Pi4J;
import com.pi4j.example.Loading;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.util.Console;

import java.util.concurrent.TimeUnit;

public class AllShadeClose {
    public static void shadeClosing(){
        final var console = new Console();
        var pi4j = Pi4J.newAutoContext();
        var closeShadeBedRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta1")
                .name("Przełącznik1")
                .address(20)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var closeShadeLivingRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta2")
                .name("Przełącznik2")
                .address(19)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var closeShadeDiningRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta3")
                .name("Przełącznik3")
                .address(6)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var closeShadeBathRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta")
                .name("Przełącznik")
                .address(17)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var closeShadeUpperRoom = DigitalOutput.newConfigBuilder(pi4j)
                .id("Roleta4")
                .name("Przełącznik4")
                .address(12)
                .shutdown(DigitalState.HIGH)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var shadeCloseBedroom = pi4j.create(closeShadeBedRoom);
        var shadeCloseLivingRoom = pi4j.create(closeShadeLivingRoom);
        var shadeCloseDiningRoom = pi4j.create(closeShadeDiningRoom);
        var shadeCloseBathRoom = pi4j.create(closeShadeBathRoom);
        var shadeCloseUpperRoom = pi4j.create(closeShadeUpperRoom);






        try {
            shadeCloseBedroom.low();
            shadeCloseLivingRoom.low();
            shadeCloseDiningRoom.low();
            shadeCloseBathRoom.low();
            shadeCloseUpperRoom.low();
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shadeCloseBedroom.high();
        shadeCloseLivingRoom.high();
        shadeCloseDiningRoom.high();
        shadeCloseBathRoom.high();
        shadeCloseUpperRoom.high();

    }
}
