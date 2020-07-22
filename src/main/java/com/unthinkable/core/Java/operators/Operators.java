package com.unthinkable.core.Java.operators;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Operators {
    public void operatorsFunctions() {
        // Binary Literals
        int j, i = 0B1000_0_0;
        System.out.println(i);

        //Pre Post
        i = 4;
        i = i++;
        System.out.println(i);

        i = ++i;
        System.out.println(i);

        //Bitwise  a & b, c || d

        //Shift Operator
        i = 32;
        j = i << 2;
        System.out.println(j);

        j = i >> 2;
        System.out.println(j);

        i = 0;
        //Labeled break
        Mohit:
        while (true) {
            System.out.println("start ->" + i);
            while (true) {
                i++;
                if (i == 4) {
                    break Mohit;
                }
                System.out.println(i);
            }
        }
        System.out.println("end ->" + i);

        //Easy Swap
        i = 2;
        j = 4;
        j = i + j - (i = j);
        System.out.println(i + " : " + j);

        try {
         i =  System.in.read();
            System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("String Operations");
    }
}
