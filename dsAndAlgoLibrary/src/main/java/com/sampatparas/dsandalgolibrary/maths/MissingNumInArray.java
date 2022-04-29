package com.sampatparas.dsandalgolibrary.maths;


// between min number to max number,
// find which numbers are missing

import java.util.HashMap;
import java.util.Map;

public class MissingNumInArray {

    public static void main(String[] args) {
        int[] tmp = new int[]{1, 2, 4, 5, 8, 9};
        System.out.println(getMissingNumber(tmp));

    }

    private static String getMissingNumber(int[] tmp) {
        StringBuilder sb = new StringBuilder();
        for (int i = getMinFromArray(tmp); i < getMaxFromArray(tmp); i++) {

            if(!containsInArray(tmp,i)){
                sb.append(i);
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    private static boolean containsInArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return true;
        }
        return false;
    }


    private static int getMinFromArray(int[] tmp) {
        int min = tmp[0];
        for (int i = 1; i < tmp.length; i++) {
            if (tmp[i] < min)
                min = tmp[i];
        }
        return min;
    }

    private static int getMaxFromArray(int[] tmp) {
        int max = tmp[0];
        for (int i = 1; i < tmp.length; i++) {
            if (tmp[i] > max)
                max = tmp[i];
        }
        return max;
    }

}
