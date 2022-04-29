package com.sampatparas.dsandalgolibrary.stringOps;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = new String[]{"flower","flow","flight"};

        arr = new String[]{"cir","car"};
        System.out.println("getLongestPrefixString : " + getLongestPrefixString(arr));
    }


    public static String getLongestPrefixString(String[] strs){
        StringBuilder prefix = new StringBuilder();
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];

        String shortestString = getShortestString(strs);
        System.out.println("getShortestString from array : " + shortestString);
        //["flower","flow","flight"]

        for(int i=0; i< shortestString.length(); i++){
            char c = shortestString.charAt(i);
            boolean isSame = true;
            for(int j=0; j< strs.length; j++){
                if(strs[j].charAt(i) != c){
                        isSame = false;
                    break;
                }
            }

            if(isSame)
                prefix.append(c);
            else
                break;
        }
        return prefix.toString().isEmpty() ? "" : prefix.toString();
    }

    public static String getShortestString(String[] strs) {

        String s = strs[0];
        for(int i=1; i< strs.length;i++){
            if(strs[i].length() < s.length())
                s = strs[i];
        }
        return s;
    }
}
