//package com.pi4j.example;
//
//import com.pi4j.Pi4J;
//import com.pi4j.io.gpio.digital.DigitalOutput;
//import com.pi4j.io.gpio.digital.DigitalState;
//import com.pi4j.util.Console;
//
//public class Led2 {
//    boolean on;
//
//    public Led2(boolean on) {
//        this.on = on;
//    }
//
//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }
//    private static final int PIN_LED = 22;
//
//        final var console = new Console();
////        console.title(" Example");
////        var pi4j = Pi4J.newAutoContext();
//        var ledConfig = DigitalOutput.newConfigBuilder(pi4j)
//                .id("led")
//                .name("LED Flasher")
//                .address(PIN_LED)
//                .shutdown(DigitalState.LOW)
//                .initial(DigitalState.LOW)
//                .provider("pigpio-digital-output");
//        var led = pi4j.create(ledConfig);
//        led.equals(DigitalState.HIGH) {
//            console.println("LED low");
//            led.low()
//}
