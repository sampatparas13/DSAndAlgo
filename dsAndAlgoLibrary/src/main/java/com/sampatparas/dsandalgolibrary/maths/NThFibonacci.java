package com.sampatparas.dsandalgolibrary.maths;


// get nth number in fibonacci series

public class NThFibonacci {
    public static void main(String[] args) {
        System.out.println("getNThFibo 9: " + getNThFibo(9));
        System.out.println("getNThFibo 7: " + getNThFibo(7));
        System.out.println("getNThFibo 13: " + getNThFibo(13));
        System.out.println("getNThFibo 55: " + getNThFibo(55));


    }

    private static int getNThFibo(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;

        if (n == 0 || n == 1)
            return first;
        else if (n == 2)
            return second;

        System.out.print("" + first + " ");
        System.out.print("" + second + " ");

        for (int i = 2; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.print("" + sum + " ");
        }

        return sum;
    }
}
