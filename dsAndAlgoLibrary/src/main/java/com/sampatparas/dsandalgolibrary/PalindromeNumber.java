package com.sampatparas.dsandalgolibrary;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("-121 " + isPalindrome(-121));
//        System.out.println("-1221 " + isPalindrome(-1221));
//        System.out.println("-12321 " + isPalindrome(-12321));
//        System.out.println("12321 " + isPalindrome(12321));
//        System.out.println("-1231 " + isPalindrome(-1231));
//        System.out.println("-1131 " + isPalindrome(-1131));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int reminder = 0;
        int sum = 0;
        int original = x;
        while (x > 0) {
            reminder = x % 10;
//            System.out.println("sum B : " + sum);
            sum = (sum * 10) + reminder;
//            System.out.println("sum A : " + sum);
            x = x / 10;
        }
//        System.out.println("sum = " + sum);
        return sum == original;
    }
}

