package com.company;

import java.time.LocalDate;

public class MDate {
    private int day;
    private int month;
    private int year;

    public MDate() {
        LocalDate today = LocalDate.now();
        day = today.getDayOfMonth();
        month = today.getMonthValue();
        year = today.getYear();
    }

    public MDate(String dateStr) { // dd/mm/yyyy
        int firstSlash = dateStr.indexOf("/");
        int secondSlash = dateStr.lastIndexOf("/");

        String dayStr = dateStr.substring(0, firstSlash);
        String monthStr = dateStr.substring(firstSlash + 1, secondSlash);
        String yearStr = dateStr.substring(secondSlash + 1);

        day = Integer.parseInt(dayStr);
        month = Integer.parseInt(monthStr);
        year = Integer.parseInt(yearStr);

    }

    public MDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYearsBetween(MDate date) {
        MDate date1 = this;
        MDate date2 = date;
        int c = compareDate(date1, date2);
        if (c < 0) {
            MDate temp = date1;
            date1 = date2;
            date2 = temp;
        }

        int yearsBetween =  date1.year - date2.year;

        if (date1.month >= date2.month) {
            if (date1.day >= date2.day) {
                return yearsBetween;
            }
        }

        return yearsBetween - 1;
    }

    private static int compareDate(MDate date1, MDate date2) {
        if (date1.year == date2.year && date1.month == date2.month && date1.day == date2.day)
            return 0;
        if (date1.year > date2.year) return 1;
        else if (date1.year < date2.year) return -1;
        else {
            if (date1.month > date2.month) return 1;
            else if (date1.month < date2.month) return -1;
            else{
                if (date1.day > date2.day) return 1;
            }
        }

        return -1;
    }

    public int getDaysBetween(MDate date) {
        int days = 0;
        for (int i = year; i <= date.year; i++) {
            days += 365;
            if (isLeapYear(year)) {
                days ++;
            }
        }

        return date.day - day;
    }

    private boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
