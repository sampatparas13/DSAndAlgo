package com.sampatparas.dsandalgolibrary.maths;

public class RomanToIntegerNumber {

    public static void main(String[] args) {
        System.out.println("MXCMI to int = " + romanToInt("MXCMI"));
        System.out.println("III to int = " + romanToInt("III"));
        System.out.println("XXI to int = " + romanToInt("XXI"));
        System.out.println("XIXIXI to int = " + romanToInt("XIXIXI"));
        System.out.println("XIII to int = " + romanToInt("XIII"));

    }

    public static int romanToInt(String s) {

        int tmp = 0;
        char prev = ' ';
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            tmp += getNumberToAdd(c, prev);
            prev = c;
        }

        return tmp;
    }

    public static int getNumberToAdd(char curr, char prev){
        switch(curr){

            case 'I':
                return 1;
            case 'V':
                return prev == 'I' ? 3 : 5;
            case 'X':
                return prev == 'I' ? 8 : 10;
            case 'L':
                return prev == 'X' ? 30 : 50;
            case 'C':
                return prev  == 'X' ? 80 : 100;
            case 'D':
                return prev == 'C' ? 300 : 500;
            case 'M':
                return prev == 'C' ? 800 : 1000;
        }
        return 0;
    }
}
