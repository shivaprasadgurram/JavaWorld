package com.misc.diamondproblem;

interface C extends A {
    default void display() {
        System.out.println("Interface C");
    }
}
