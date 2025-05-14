package com.designpatterns.singleton;

public class EagerDBCon {
    // This needs to at class level
    private static final EagerDBCon obj = new EagerDBCon();
    private EagerDBCon() {
        // No one allowed to create new obj using new keyword
    }
    public static EagerDBCon getInstance() {
        return obj;
    }
}

/*
 * Why this is not recommended?
 * Even though I'm not using but something got created already, waste of memory. isn't it?
 */