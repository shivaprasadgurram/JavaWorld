package com.misc.nestedinterface;

public class Hen implements Bird.NonFlyingBird {
    @Override
    public void canRun() {
        System.out.println("Running.....");
    }
}
