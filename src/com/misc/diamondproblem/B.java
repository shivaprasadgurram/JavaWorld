package com.misc.diamondproblem;

interface B extends A {
    default void display() {
        System.out.println("Interface B");
    }
}
