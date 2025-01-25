package com.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

public class FindTotalNumberOfElementsPresentInList {

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(4,6,7,5,4);
        Consumer<Integer> findTotalNumberOfElementsPresentInList  = number-> System.out.println("size is" + number);
        letCallMethod(integerList,findTotalNumberOfElementsPresentInList);

    }

    private static void letCallMethod(List<Integer> integerList,Consumer findTotalNumberOfElementsPresentInList) {

        AtomicLong count = new AtomicLong();
        integerList
                .forEach(number -> {
                    //findTotalNumberOfElementsPresentInList.accept(number);
                    count.incrementAndGet();
                });
        System.out.println(count);
    }
}
