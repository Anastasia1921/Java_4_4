package com.company;

public class Main {

    public static void main(String[] args) {
        new StudentWithTimerAndCalendar(new StudentWithTimer(new Student())).learn();
    }
}