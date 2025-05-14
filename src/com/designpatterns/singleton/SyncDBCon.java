package com.designpatterns.singleton;

public class SyncDBCon {
    private static SyncDBCon obj;
    private SyncDBCon() {

    }
    synchronized public static SyncDBCon getInstance() {
        if (obj == null) {
            obj = new SyncDBCon();
        }
        return  obj;
    }
}

/*
 * Why this is not recommended?
 * It performs lock and unlock.
 * If two threads calls the method, only one thread allowed to go inside.
 * since you are using at method level, there going to so much waiting period time. Becomes very slow.
 * Let's say we are calling getInstance from so many places, So method keep on performing lock and unlock for
 * each call.
 */
