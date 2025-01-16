package com;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Wrapper {

    @FunctionalInterface
    interface FunctionWithException<T, R> {
        R apply(T t) throws Exception;
    }
    public  <T, R> Function<T, R> wrap(FunctionWithException<T, R> func) {
        return i -> {
            try {
                return func.apply(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    public static void main(String[] args) {

        Wrapper wrapper = new Wrapper();

        wrapper.callMe();


    }

    private void callMe() {

        FunctionWithException<String,Integer>  functionWithException = (s) -> s.length()+10;

        List myList = new ArrayList<>();
        myList.add("Lala");
        myList.add("Bal");
        myList.add("Pa");
        myList.add("Caloo");

        myList.stream()
                .map(wrap(functionWithException))
                .forEach(System.out::println);
    }
}
