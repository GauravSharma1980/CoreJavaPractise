package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date is: " + str);
    }
}
