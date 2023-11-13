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
			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
			String message = formatter.format(current);
			System.out.printf("Время начала учёбы: %s \n", message);
            learner.learn();
        }
    }
