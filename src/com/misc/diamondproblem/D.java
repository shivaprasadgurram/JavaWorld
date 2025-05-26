package com.misc.diamondproblem;

/**
 * To resolve the Diamond Problem, D explicitly overrides the display() method and specifies
 * which version to use by calling B.super.display() or C.super.display().
 */
class D implements B, C {
    @Override
    public void display() {
        // Resolving the ambiguity explicitly
        B.super.display();
        C.super.display();
        System.out.println("Class D");
    }
}
