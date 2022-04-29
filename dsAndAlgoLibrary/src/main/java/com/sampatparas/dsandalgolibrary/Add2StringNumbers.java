package com.sampatparas.dsandalgolibrary;

public class Add2StringNumbers {
    public static void main(String[] args) {
        System.out.println("adding 11 and 22 :" + add2Numbers("11","22"));
    }

    public static String add2Numbers(String s1, String s2){
        // pending
        return "" + (Integer.parseInt(s1) + Integer.parseInt(s2));
    }
}
