package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car[] cars = new Car[3];
        cars[0] = new Car(1, "audi", "model1", 2008, "green", 100500, "azaza228");
        cars[1] = new Car(2, "audi", "sedan", 2000, "green", 100500, "azaza228");
        cars[2] = new Car(3, "lada", "sedan", 2000, "red", 1488, "baklajan007");

        System.out.println("Task1");
        String a = "lada";
        Rampage rak = new Rampage();
        Car[] rt = rak.marka(cars, a);
        for (Car h : rt)
            if (h != null)
                System.out.println(String.format("%10s ", h));


        System.out.println("Task2");
        String l = "sedan";
        int god = 5;
        Car[] ts2 = rak.taskTwo(cars, l, god);
        for (Car u:ts2)
            if (u!=null)
                System.out.println(u);

        System.out.println("Task3");

        double b = 11322;
        int y = 2000;
        for (Car n:rak.taskThree(cars, b, y))
            if (n!=null)
                System.out.println(n);
    }
}
