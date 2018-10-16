package com.company;

public class Car {
    private int id;

    private String mark;

    private String model;

    private int year;

    private String color;

    private double price;

    private String number;

    public Car(int id, String mark, String model, int year, String color, double price, String number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /* public void show() {
        System.out.printf("%5d %5s %5s %5d %10s %10s %15s \n", getId(), getMark(), getModel(), getYear(), getColor(), getPrice(), getNumber());
    }
*/
    @Override
    public String toString() {
        return "id="+this.getId()+"   Mark="+this.getMark()+"   Model="+this.getModel()+"  Year="+this.getYear()+"  Color="+this.getColor()+"    Price="+this.getPrice()+"    Number="+this.getNumber();
    }
}
