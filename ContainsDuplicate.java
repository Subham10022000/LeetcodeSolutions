package org.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements :->");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNext()) {
                arr[i] = sc.nextInt();

            }
        }
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);

        } return false;
    }
}



