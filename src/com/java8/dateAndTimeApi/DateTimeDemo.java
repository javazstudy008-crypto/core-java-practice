package com.java8.dateAndTimeApi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);

        //Immutable and mutable
        //Before java-8
        Calendar currentDay = Calendar.getInstance();
        System.out.println("cal: " + currentDay.getTime());
        currentDay.add(Calendar.DAY_OF_MONTH, 6);
        System.out.println("cal after: " + currentDay.getTime());

        //java-8
        LocalDate today = LocalDate.now();
        System.out.println("today: " + today);
        LocalDate futureDate = today.plusDays(6);
        System.out.println("future: " + today);
        System.out.println("future date: " + futureDate);

        //Time
        LocalTime time = LocalTime.now();
        System.out.println("current time: " + time);

        //Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);
        System.out.println("not formatted today: " + today);
        System.out.println("formattedDate: " + formattedDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(timeFormatter);
        System.out.println(formattedTime);
        LocalDate date = LocalDate.parse(formattedDate, formatter);
        System.out.println("date: " + date);

        //ZonedTime
        ZonedDateTime zonedTime = ZonedDateTime.now();
        System.out.println("zonedTime: " + zonedTime);

        ZonedDateTime NYC_Time = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("NYC_Time: " + NYC_Time);
        ZonedDateTime LA_Time = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("LA_Time: " + LA_Time);
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("utc: " + utc);
        //Instant
        Instant instant = Instant.now();            //O longitude: prime meridian
        System.out.println("instant: " + instant);

        //Meeting schedule:
//        LocalDate lastDayOf20thCentury = LocalDate.of(1999, 12,31);
//        System.out.println(lastDayOf20thCentury);
        LocalDateTime meetingTime = LocalDateTime.of(2026, 03, 27,9,30);
        System.out.println("meetingTime: " + meetingTime);
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zoneMeetingTime = ZonedDateTime.of(meetingTime, zoneId);
        System.out.println(zoneMeetingTime);

        ZonedDateTime IndianMeetingTime = zoneMeetingTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("IndianMeetingTime: " + IndianMeetingTime);

        //
        LocalDate independence = LocalDate.of(1947, 8, 15);
        System.out.println("independence: " + independence);
    }
}
