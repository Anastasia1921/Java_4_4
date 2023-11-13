package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentWithTimerAndCalendar implements Learner {
        private Learner learner;
        public StudentWithTimerAndCalendar(Learner learner) {
            this.learner = learner;
        }

        @Override
        public void learn() {
            Date current = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.YYYY HH:mm");
            String message = formatter.format(current);
            System.out.printf("Дата-время начала учёбы: %s \n", message);
            learner.learn();
        }
    }
