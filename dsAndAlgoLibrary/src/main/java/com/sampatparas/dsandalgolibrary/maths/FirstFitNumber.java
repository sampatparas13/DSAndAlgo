package com.sampatparas.dsandalgolibrary.maths;

/*
You are given a list of integers rooms and an integer target.
 Return the first integer in rooms that's target or larger.
 If there is no solution, return -1.
*/

public class FirstFitNumber {

    public static void main(String[] args) {
        int[] tmp = new int[]{1, 8, 14, 22, 25};
        System.out.println("First fit number is " + getFirstFitNumber(tmp, 11));
    }

    private static int getFirstFitNumber(int[] tmp, int target) {
        for (int i = 0; i < tmp.length; i++) {
            if(tmp[i] == target || tmp[i] > target)
                return tmp[i];
        }
        return -1;
    }
}
