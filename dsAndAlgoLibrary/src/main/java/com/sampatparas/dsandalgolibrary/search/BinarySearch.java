package com.sampatparas.dsandalgolibrary.search;

import com.sampatparas.dsandalgolibrary.sorting.BubbleSort;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,7,8,2,9,77,445,44,22,5,47};
        arr = BubbleSort.sortArrayAsending(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("found at index : " + searchFromArray(arr, 43));
    }

    private static int searchFromArray(int[] arr, int value) {



        // we have sorted asending array


        if(arr.length == 0)
            return -1;
        if(arr.length == 1 && arr[0] == value)
            return 1;

        int startIndex = 0;
        int lastIndex = arr.length - 1;

        while(startIndex <= lastIndex){
            int midIndex = (startIndex + lastIndex) / 2;
            if(arr[midIndex] == value){
                return midIndex;
            }
            else if(arr[midIndex] > value){
                lastIndex = midIndex - 1;
            }
            else if(arr[midIndex] < value){
                startIndex = midIndex +1;
            }
        }

        return -1;
    }
}
