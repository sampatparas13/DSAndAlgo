package com.sampatparas.dsandalgolibrary.maths;

public class ArrayPlusOne {
    public static void main(String[] args) {
        int[] temp = plusOne(new int[]{4,3,8,5,7});

        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i : temp) {
            System.out.print("" + i + ", ");
        }

    }
    public static int[] plusOne(int[] digits) {
        int n = getIntegerFromArray(digits)+1;
        System.out.println("plusOne : " + (n));
        String sum = "" + n;
        int[] temp = new int[sum.length() ];

        for (int i = 0; i < sum.length(); i++) {
            System.out.println("char at " + i +" is " + sum.charAt(i));
            temp[i] = sum.charAt(i) - '0'; // need to understand this
        }

        return temp;
    }

    public static int getIntegerFromArray(int[] digits){
        // [4,3,2,1]
        int mul = 1;
        int num = 0;
        for(int i= digits.length - 1; i >= 0; i--){
            num+=mul*digits[i];
            mul*=10;
        }
        return num;
    }

}
