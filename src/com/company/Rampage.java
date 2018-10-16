package com.company;

import java.util.Calendar;

public class Rampage {

    public Car[] taskTwo(Car[] cars, String n, int g) {
        Calendar now = Calendar.getInstance();
        int ye = now.get(Calendar.YEAR);
        Car[] task2 = new Car[cars.length];
        int i = 0;
        for (Car o : cars) {
            if ((ye - o.getYear()) > g && o.getModel().equals(n)) {
                task2[i] = o;
                i++;
            }
        }
        return task2;
    }

    public Car[] taskThree(Car[] cars, double p, int y) {
        Car[] task3 = new Car[cars.length];
        int i = 0;
        for (Car t : cars) {
            if (y == t.getYear() && t.getPrice() > p) {
                task3[i] = t;
                i++;
            }
        }
        return task3;
    }

    public Car[] marka(Car[] cars, String m) {
        Car[] z = new Car[cars.length];
        int i = 0;
        for (Car x : cars) {
            if (m.equals(x.getMark())) {
                z[i] = x;
                i++;
            }
        }
        return z;
    }
}
