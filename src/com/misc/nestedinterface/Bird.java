package com.misc.nestedinterface;

public interface Bird {
    void fly();
    public interface NonFlyingBird {
        void canRun();
    }
}
