package com.misc.nestedinterface;

public class Main {
    public static void main(String[] args) {
        Bird.NonFlyingBird obj = new Hen();
        obj.canRun();
    }
}
