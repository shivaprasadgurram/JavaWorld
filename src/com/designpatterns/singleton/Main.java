package com.designpatterns.singleton;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EagerDBCon obj = EagerDBCon.getInstance();
        LazyDBCon obj1 = LazyDBCon.getInstance();
        SyncDBCon obj2 =  SyncDBCon.getInstance();
        DoubleCheckLockDBCon obj3  = DoubleCheckLockDBCon.getInstance();
        BillPughDBCon obj4 = BillPughDBCon.getInstance();
        ENUMDBCon obj5 = ENUMDBCon.INSTANCE;

        Date birthDate = new Date();
        ImmutableClass person = new ImmutableClass("John Doe", 30, birthDate);

        System.out.println("Original Person: " + person);

        // Try to modify the birthDate externally
        birthDate.setTime(System.currentTimeMillis() + 1000000000L);

        // The Person's birthDate remains unchanged
        System.out.println("After modifying birthDate externally: " + person);

        // Try to modify the birthDate via the getter
        person.getBirthDate().setTime(System.currentTimeMillis() + 1000000000L);

        // The Person's birthDate remains unchanged
        System.out.println("After modifying birthDate via getter: " + person);
    }
}
