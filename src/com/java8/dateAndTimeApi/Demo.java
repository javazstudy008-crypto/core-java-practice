package com.java8.dateAndTimeApi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Demo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today: " + date);

        Date today = new Date();
        System.out.println(today);

        LocalDate nextWeek = date.plusWeeks(1);
        System.out.println("Nect week date: " + nextWeek);
        System.out.println("Today: " + date);

        //Adding day
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println("cal: " + cal.getTime());

        LocalDate futureDate = date.plusDays(7);
        System.out.println("futureDate: " + futureDate);

        //formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatTOday = date.format(formatter);
        System.out.println(formatTOday);

        //zoned time
        ZonedDateTime NYC_Time = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime NYC_Timee = ZonedDateTime.now();
        System.out.println(NYC_Time);
        System.out.println(NYC_Timee);

        //Instance
        Instant now = Instant.now();
        System.out.println(now);

        //ZoneTime
        ZoneId eastern = ZoneId.of("America/New_York");
        LocalDateTime meetingTime = LocalDateTime.of(2026, 03,28,9,30);
        ZonedDateTime meetingTimeEastern = ZonedDateTime.of(meetingTime, eastern);
        System.out.println("meetingTimeEastern: " + meetingTimeEastern);

        ZonedDateTime meetingTimeUniversal = meetingTimeEastern.withZoneSameInstant(ZoneId.of("UTC"));
        ZonedDateTime meetingTimeIndia = meetingTimeEastern.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("meetingTimeUniversal: " + meetingTimeUniversal);
        System.out.println("meetingTimeIndia: " + meetingTimeIndia);
    }
}
