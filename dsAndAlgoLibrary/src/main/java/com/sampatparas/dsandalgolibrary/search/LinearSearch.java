package com.sampatparas.dsandalgolibrary.search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,5,7,8,77,445,44,22,5,47};
        System.out.println("found : " + searchFromArray(arr1, 44));
    }

    private static boolean searchFromArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value)
                return true;
        }
        return false;
    }
}
