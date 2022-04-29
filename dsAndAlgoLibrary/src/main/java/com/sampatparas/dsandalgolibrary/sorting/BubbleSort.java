package com.sampatparas.dsandalgolibrary.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,5,7,8,2,9,77,445,44,22,5,47};
        arr1 = sortArrayAsending(arr1);
        System.out.println("sorted: ");
        for (int i : arr1) {
            System.out.print("" + i + ", ");
        }

        arr1 = sortArrayDesending(arr1);
        System.out.println("");
        System.out.println("sorted desending: ");
        for (int i : arr1) {
            System.out.print("" + i + ", ");
        }
    }

    public static int[] sortArrayAsending(int[] arr1) {
        if(arr1.length == 0)
            return new int[]{};
        if(arr1.length == 1){
            return arr1;
        }
        int n = arr1.length;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n); j++) {
                if(arr1[j-1] > arr1[j]){
                    tmp = arr1[j-1];
                    arr1[j-1] = arr1[j];
                    arr1[j] = tmp;
                }
            }
        }
        return arr1;
    }

    private static int[] sortArrayDesending(int[] arr1) {
        if(arr1.length == 0)
            return new int[]{};
        if(arr1.length == 1){
            return arr1;
        }
        int n = arr1.length;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n); j++) {
                if(arr1[j-1] < arr1[j]){
                    tmp = arr1[j-1];
                    arr1[j-1] = arr1[j];
                    arr1[j] = tmp;
                }
            }
        }
        return arr1;
    }
}
