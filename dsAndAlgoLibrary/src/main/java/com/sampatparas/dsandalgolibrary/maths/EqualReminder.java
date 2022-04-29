package com.sampatparas.dsandalgolibrary.maths;

public class EqualReminder {

    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int small = a;

        for (int i = 2; i <= small; i++) {
            System.out.println("i = " + i);
            System.out.println("a%i = " + (a%i));
            System.out.println("b%i = " + (b%i));
            if(a%i == b%i){
                System.out.println("Equal remider = " + i);
                break;
            }
        }
    }
}
