package org.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeOfFirstArray = sc.nextInt();
        int sizeOfSecondArray = sc.nextInt();

        int[] firstArray = new int[sizeOfFirstArray];
        int[] secondArray = new int[sizeOfSecondArray];

        for(int i=0;i<sizeOfFirstArray;i++) {
            firstArray[i] = sc.nextInt();
        }

        for(int i=0;i<sizeOfSecondArray;i++) {
            secondArray[i] = sc.nextInt();
        }

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        double median = findMedianSortedArrays(firstArray, secondArray);

        System.out.println("median of above two arrays is: "+median);
    }

    public static double findMedianSortedArrays(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0) return 0.0;

        //consider a=[2], b=[]
        //if not swapped, bleft will be -ve hence this condition will fail:
        //bleft == 0 ? Integer.MIN_VALUE : b[bleft - 1]
        if(a.length > b.length) {
            int[] temp = a;
            a = b;
            b = temp;
        }

        int lo = 0, hi = a.length, total = a.length + b.length;
        while(lo <= hi) {
            int aleft = lo + (hi - lo) / 2;
            int bleft = (total + 1) / 2 - aleft;
            int maVal = aleft == 0 ? Integer.MIN_VALUE : a[aleft - 1];
            int mbVal = bleft == 0 ? Integer.MIN_VALUE : b[bleft - 1];
            int aVal = aleft == a.length ? Integer.MAX_VALUE : a[aleft];
            int bVal = bleft == b.length ? Integer.MAX_VALUE : b[bleft];
            if(maVal <= bVal && mbVal <= aVal) {
                double res = Math.max(maVal, mbVal);
                if(total % 2 == 0) {
                    res += Math.min(aVal, bVal);
                    res /= 2.0;
                }
                return res;
            }else if(maVal > bVal) {
                hi = aleft - 1;
            } else {
                lo = aleft + 1;
            }
        }
        return 0.0;
    }

}


    //Read more: https://www.java67.com/2021/11/how-to-find-median-of-two-sorted-arrays.html#ixzz87SA7DZLA
