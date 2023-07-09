package org.example;

import java.util.*;

class TwoSum {

        public static int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int sum= target-nums[i];
                if(map.containsKey(sum)){
                    return new int[] {map.get(sum),i};
                }
                map.put(nums[i],i);
            }
            return new int[]{};
        }

    // time complexity O(n) | space complexity O(n)
//    public static int[] twoSum(int[] numbers, int targetSum) {
//        int[] result = null;
//
//        if (numbers == null || numbers.length < 2) {
//            return null;
//        }
//
//        Set<Integer> map = new HashSet<>();
//        for (int i= 0; i < numbers.length; i++) {
//            int diff = targetSum - numbers[i];
//            if (map.contains(diff)) {
//                result = new int[2];
//                result[0] = numbers[i];
//                result[1] = diff;
//                break;
//            }
//            map.add(numbers[i]);
//        }
//
//        return result;
//    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(
                twoSum(new int[]{3, 6, 10, 14}, 9))); // [6, 3] best case

//        System.out.println(Arrays.toString(
//                twoSum(null, 4))); // null - invalid input

        System.out.println(Arrays.toString(
                twoSum(new int[]{3, 1, 4}, 9))); // null - no pair exists

        System.out.println(Arrays.toString(
                twoSum(new int[]{3}, 9))); // null - array with less than two integers
    }
}