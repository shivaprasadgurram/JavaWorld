package com.designpatterns.singleton;

public class DoubleCheckLockDBCon {
    private static DoubleCheckLockDBCon obj;

    private DoubleCheckLockDBCon() {

    }

    public static DoubleCheckLockDBCon getInstance() {
        if(obj == null) {
            synchronized (DoubleCheckLockDBCon.class) {
                if (obj == null) {
                    obj = new DoubleCheckLockDBCon();
                }
            }
        }
        return obj;
    }
}

/**
 * Why this is not recommended?
 *
 * Once first check satisfied, then it will lock.
 * It solves concurrency issue, even if two threads comes at same times, due to second check only one thread go
 * inside.
 *
 * There is a memory issue, lets assume we have multicore CPU and each core will have their own cache (L1 cache).
 * Then there going to be common main memory.
 *
 * Due to delay in cache's sync and sync between cache and main memory multiple objects will get created.
 *
 * Note: For performance, all cores stores data into cache, and periodically they sync up with main memory.

 * Use volatile in this case
 *
 * Since we are using volatile, so it's going to be a bit slow because it deals with main memory directly.
 * Also we are still using synchronized keyword (lock and unlock)
 */
