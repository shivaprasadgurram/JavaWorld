package com.designpatterns.singleton;

public class BillPughDBCon {

    private BillPughDBCon() {
    }

    private static class BillPughDBConHelper {
        private static final BillPughDBCon INSTANCE_OBJECT = new BillPughDBCon();
    }

    public static BillPughDBCon getInstance() {
        return BillPughDBConHelper.INSTANCE_OBJECT;
    }
}


/**
 * No more volatile, synchronized.
 * It uses EAGER initialization, but it resolves it's main issue.
 *
 * Nested classes do not load at app start up time. They will get loaded only when they referenced or used.
 *
 * It leverages, JVM's class-loading mechanism
 *
 * Class Loading is Atomic: The JVM ensures that a class is loaded only once, even if multiple threads try to load it simultaneously.
 * Static Field Initialization is Thread-Safe: The initialization of static fields (like INSTANCE) is guaranteed to be thread-safe by the JVM.
 */
