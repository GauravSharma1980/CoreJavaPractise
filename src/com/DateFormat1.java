package com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormat1 {

    public static void main(String[] args) {
        LocalDateTime localDateTime=null;
        String timestamp = "2024-09-09T23:56:10.520Z";
        try {
            localDateTime = LocalDateTime.parse(timestamp, DateTimeFormatter.ISO_DATE_TIME);
        }catch (DateTimeParseException exception){
            throw new RuntimeException("Date is invalid!!");
        }
        if(localDateTime.isAfter(LocalDateTime.now()))
        {
            System.out.println("after......");
        }else {
            System.out.println("before....");
        }
    }
}
