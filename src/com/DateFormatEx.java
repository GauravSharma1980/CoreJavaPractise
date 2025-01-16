package com;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatEx {

    public static void main(String[] args) {

        // Define the date and time pattern that matches the input string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:Z");

        // Input string to be parsed
        String dateString = "2024-06-15 16:34:16:10Z";

        // Parse the string to a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);

        if(dateTime.isAfter(LocalDateTime.now()))
        {
            System.out.println("is after....");

        }else {
            System.out.println("is before....");
        }
        // Print the result
        System.out.println("Parsed LocalDateTime: " + dateTime);

    }
}
