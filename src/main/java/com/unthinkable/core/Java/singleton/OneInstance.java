package com.unthinkable.core.Java.singleton;

public class OneInstance {
    private static OneInstance one;

    private OneInstance() {

    }

    public static OneInstance getInstance() {
        if (one == null) {
            synchronized (OneInstance.class) { // Double Checked Locking

            }
            one = new OneInstance();
        }
        return one;
    }

    public void show() {
        System.out.println("Only One Instance is allowed");
    }
}
