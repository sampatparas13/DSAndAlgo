package com.sampatparas.dsandalgolibrary.maths;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
* */

/*
    hint 1 : So, we essentially need to find three numbers x, y, and z such that they add up to the given value.
    If we fix one of the numbers say x, we are left with the two-sum problem at hand!

    hint 2 :For the two-sum problem, if we fix one of the numbers, say
            x
            , we have to scan the entire array to find the next number
            y
            which is
            value - x
            where value is the input parameter. Can we change our array somehow so that this search becomes faster?
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeNumsSumIsZero {
    public static void main(String[] args) {

        /*
        input : [3,0,-2,-1,1,2]
        expe :  [[-2,-1,3],[-2,0,2],[-1,0,1]]
         */

        for (List<Integer> list : threeSum(new int[]{3,0,-2,-1,1,2})) {
            for (Integer integer : list) {
                System.out.print("" + integer + ", ");
            }
            System.out.println("");
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        System.out.println("threeSum");

        Set<List<Integer>> list = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(list);
        Arrays.sort(nums);
        for (int first = 0; first < nums.length-2; first++) {
            int second = first +1;
            int third = nums.length - 1;
            while(second < third){
                int sum = nums[first] + nums[second] + nums[third];
                if(sum == 0)
                    list.add(Arrays.asList(nums[first] , nums[second++] , nums[third--]));
                else if(sum > 0)
                    third--;
                else if(sum < 0)
                    second++;
            }
        }
        return new ArrayList<>(list);
    }
}
