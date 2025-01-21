package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestNumberAnotherWay {

    public static void main(String[] args) throws Throwable {

        sortedMethodInJava();

        findMaxMinInList();

        anyMatchAllMatchNoneMatch();
    }

    private static void anyMatchAllMatchNoneMatch() {
        List<Integer> integerList = Arrays.asList(23,12,89,10,18);
        System.out.println("anymatching value of 23 "+integerList.stream().anyMatch(n-> n ==23));

        System.out.println("nonmatching value of 23 "+integerList.stream().noneMatch(n-> n ==23));

        System.out.println("allMatching value of 23 "+integerList.stream().allMatch(n-> n ==23));


    }

    private static void findMaxMinInList() throws Throwable {
        List<Integer> integerList = Arrays.asList(23,12,89,10,18);
        Optional maxValue = integerList.stream().max(Integer::compareTo);
        Object result = maxValue.isPresent() ? maxValue : 0;
        System.out.println("maxValue"+result);

        Optional minValue = integerList.stream().min(Integer::compareTo);
        System.out.println("minValue"+minValue.orElse(null));
    }

    private static void sortedMethodInJava() {

        List<Integer> integerList = Arrays.asList(23,12,89,10,18);

        List<Integer> integerList1 = integerList;
        integerList1.sort(Comparator.reverseOrder());

        System.out.println("reverseOrder:: "+integerList1);

        System.out.println("the second higest is "+integerList1.get(1));

        integerList1.sort(Comparator.naturalOrder());

        System.out.println("naturalOrder::"+integerList1);

        List<Integer> originalList = Arrays.asList(23,12,89,10,18);

        System.out.println("sorted list::"+originalList.stream().sorted().collect(Collectors.toList()));
    }
}
