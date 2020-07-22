package com.unthinkable.core.Java.functional;

public interface DeclareDefine {

    void onlyDec();
    default void def() {
        System.out.println("Define using (default) keyword");
    }

}
