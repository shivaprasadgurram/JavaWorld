package com.designpatterns.singleton;

import java.util.Date;

/**
 * 1. We can't change the value of an object once it is created.
 * 2. Declare class as final so that it can't be extended.
 * 3. All class members should be private. So that direct access can be avoided.
 * 4. Class members should be initialized only once via constructor.
 * 5. There should not be any setter methods, which is generally used to change the value.
 * 6. Just getters, and perform deep copy for mutable members.
 */
public final class ImmutableClass {

    private final String name;
    private final int age;
    private final Date birthDate;

    public ImmutableClass(String name, int age, Date birthDate) {
        if (name == null || birthDate == null) {
            throw new IllegalArgumentException("Name and birthDate cannot be null");
        }
        this.name = name;
        this.age = age;

        // Perform deep copy for the mutable Date object
        this.birthDate = new Date(birthDate.getTime());
    }

    // String is immutable, so no deep copy needed
    public String getName() {
        return name;
    }

    // primitive type, no deep copy needed
    public int getAge() {
        return age;
    }

    // returns a deep copy to prevent external modification
    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", birthDate=" + birthDate + '}';
    }
}
