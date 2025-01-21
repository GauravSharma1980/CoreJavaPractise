package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListMergeAndSort {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3);

        List<Integer> list2 = Arrays.asList(4,5,6);

        List<Integer> list3 = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());

        System.out.println(list3);

        list3.sort(Comparator.reverseOrder());

        System.out.println("list3"+list3);

        mergeListsWithoutUsingStreamDotConcat();

        mergeListsWithoutUsingStreamDotConcatAndFlatMap();

    }

    private static void mergeListsWithoutUsingStreamDotConcatAndFlatMap() {
        System.out.println("mergeListsWithoutUsingStreamDotConcatAndFlatMap........");
        List<Integer> list1 = Arrays.asList(1,2,3);

        List<Integer> list2 = Arrays.asList(4,5,6);

        List<Integer> list3 = Stream
                                .builder()
                                .add(list1.stream())
                                .add(list2.stream())
                                .build()
                                .flatMap(s -> (Stream<Integer>) s)
                                .collect(Collectors.toList());
        list3.sort(Comparator.reverseOrder());
        System.out.println(list3);

    }

    private static void mergeListsWithoutUsingStreamDotConcat() {

        System.out.println("mergeListsWithoutUsingStreamDotConcat........");
        List<Integer> list1 = Arrays.asList(1,2,3);

        List<Integer> list2 = Arrays.asList(4,5,6);

        List<Integer> list3 =  Stream.of(list1,list2).flatMap(List::stream).collect(Collectors.toList());

        list3.sort(Comparator.reverseOrder());
        System.out.println(list3);
    }

}
