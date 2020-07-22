package com.unthinkable.core.Java.functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

//What to do..
//Internal Iteration
public class StreamOperations {
    public static void Operations() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Functional Interface
        //Consumer
        //Lambda Expression
        list.forEach(i -> System.out.print(i));
        System.out.println();

        //Method Reference
        list.forEach(System.out::print);
        System.out.println();
        list.forEach(StreamOperations::doubleIt);
        System.out.println();

        //Stream API
        Stream<Integer> stream = list.stream();
        System.out.println(stream.map(i -> i * 2).reduce(0, (c, e) -> c * e));
        System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));
        System.out.println(list.stream().filter(i -> i % 2 == 0).map(i -> i * 2).reduce(0, Integer::sum));
        System.out.println(
            list.stream()
                .filter(StreamOperations::filterIt)  //Lazy
                .map(StreamOperations::doubleIt)      //Lazy
                .findFirst()          //Eager
                .orElse(0));
    }

    public static int doubleIt(int i) {
        System.out.print("Double : " + i + " ");
        return i * 2;
    }

    public static boolean filterIt(int i) {
        System.out.println("Value : " + i);
        return (i % 2 == 0);
    }
}
