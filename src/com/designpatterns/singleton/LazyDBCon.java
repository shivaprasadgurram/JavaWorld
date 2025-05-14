package com.designpatterns.singleton;

public class LazyDBCon {
    private static LazyDBCon obj;
    private LazyDBCon() {
    }
    public static LazyDBCon getInstance() {
        if (obj == null) {
            obj = new LazyDBCon();
        }
        return  obj;
    }
}

/*
 * Why this is not recommended?
 * This is bit better compare to Eager but issue is with multi threading. What if two threads comes in parallel?
 * it violates singleton goal. creates two objects
 */
