package com;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

    @FunctionalInterface
     interface CompareSal{
        public int[] compSal(int arr[]);
    }
public class SecondHighestNumber {

    // get the second highest salary of employees


    public static void main(String[] args) {
    int arr [] = {101,102,103,104};

        CompareSal compareSal = (arrIn) -> {
            int tempSal=0;
            for(int i =0;i<arrIn.length;i++){
                for(int j=0;j<arrIn.length;j++){
                    if(arrIn[i] > arrIn[j]){
                        tempSal = arrIn[i];
                        arrIn[i] = arrIn[j];
                        arrIn[j] = tempSal;
                    }
                }
            }
            return arrIn;
        };

        int[] outSal = compareSal.compSal(arr);
        Arrays.stream(outSal).forEach(System.out::println);
        System.out.println("the second highest sal is "+outSal[1]);
    }

}
