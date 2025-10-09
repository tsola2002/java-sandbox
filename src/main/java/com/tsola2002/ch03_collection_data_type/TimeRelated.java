package com.tsola2002.ch03_collection_data_type;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeRelated {

  public static void main(String[] args) {

    // DISPLAY THE CURRENT DATE USING LOCAL DATE
    //System.out.println(LocalDate.now()); // displays date in yyyy-mm-dd

    LocalDate today = LocalDate.now();
    DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    String format1 = today.format(defaultFormat);
    // System.out.println("dd-mm-yyyy ->" + format1);

    // DISPLAY THE CURRENT TIME USING LOCAL TIME
    //System.out.println(LocalTime.now());

    LocalTime todaysTime = LocalTime.now();
    DateTimeFormatter defaultTimeFormat = DateTimeFormatter.ofPattern("HH:mm");
    String format2 = todaysTime.format(defaultTimeFormat);
    //System.out.println(format2);


    // CREATING TIME AND DATE USING LOCAL DATETIME
    // System.out.println(LocalDateTime.now());

    LocalDateTime todaysDateTime = LocalDateTime.now();
    DateTimeFormatter defaultDateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    String format3 = todaysDateTime.format(defaultDateTimeFormat);
    //System.out.println(format3);

    // DISPLAY YESTERDAYS DATE
    //System.out.println(todaysDateTime.minus(Period.ofDays(2)));

    // DISPLAY TOMORROWS DATE
    //System.out.println(todaysDateTime.plus(Period.ofDays(1)));

    // ADD AN HOUR
    //System.out.println(todaysTime.plus(Duration.ofHours(2)));
    System.out.println(todaysTime.plus(Duration.ofMinutes(2)));




  }

}
