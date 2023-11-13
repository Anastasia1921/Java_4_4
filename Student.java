package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.IntStream;

public class Student implements Learner {
    @Override
    public void learn() {
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.YYYY HH:mm");
        String message = formatter.format(current);
        System.out.printf("Дата-время начала учёбы: %s \n", message);
        System.out.println("Я учусь. .zZ");
        IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");
    }
}