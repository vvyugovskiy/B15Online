package com.acme.utils;

public class MyDate {

    public int day;
    public int year;
    public int month;

    public MyDate() {
    }

    public MyDate(int m, int d, int y) {
        setDate(m, d, y);
    }

    public String toString() {
        return "MyDate : " + month + "/" + day + "/" + year;
    }

    public void setDate(int m, int d, int y) {
        this.day = d;
        this.year = y;
        this.month = m;
    }

    public static void leapYears (){
        for (int i = 1752; i <=2020 ; i++) {
            if (i % 4==0){
                if (i % 100!=0 || i % 400 ==0){
                    System.out.println("The year "+i+ " is a leap year");
                }
            }
        }

    }

}
