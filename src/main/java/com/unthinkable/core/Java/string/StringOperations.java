package com.unthinkable.core.Java.string;

import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class StringOperations {
    //String Immutable
    private String ref1 = "Mohit";
    private String ref2 = "Mohit";

    public void operateOnString() throws IOException {

        //ref1 and ref2 ---> Same Object
        String ref3 = new String("Mohit"); //ref3 ---> Same Object indirectly

        int i = 0;
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println(i);
        }

        File f = new File("out.txt");
        FileOutputStream out = new FileOutputStream(f);
        DataOutputStream outputStream = new DataOutputStream(out);
        outputStream.write(12);

        FileInputStream in = new FileInputStream(f);
        DataInputStream inputStream = new DataInputStream(in);
        System.out.println(inputStream.read());
    }

    private void reflectionDemo() {
        System.out.println("Reached");
    }
}
