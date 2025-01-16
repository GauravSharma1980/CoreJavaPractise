package com;

import java.time.LocalDate;

public class DateLocal {

    public static void main(String [] args) {
        //LocalDate date1 = LocalDate.parse("2000-06-25");
        LocalDate date1 = LocalDate.parse("25-06-2025");
        while(date1.getDayOfMonth() >= 20) {
            System.out.println(date1);
            System.out.println("day"+date1.getDayOfMonth());
            date1 = date1.plusDays(-1);
            System.out.println("day after"+date1.getDayOfMonth());
        }
        /*while(date1.getDayOfMonth() >= 20) {
            System.out.println(date1);
            System.out.println("day"+date1.getDayOfMonth());
            date1 = date1.plusDays(-1);
            System.out.println("day after"+date1.getDayOfMonth());
        }*/
    }
}
