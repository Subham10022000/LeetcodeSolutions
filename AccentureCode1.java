package org.example;

import java.util.Arrays;

public class AccentureCode1 {
    public static void main(String[] args) {
        int[] fighters = {2, 7, 4, 1, 8, 1};
        int result = compareFighters(fighters);
        System.out.println("Output: " + result);
    }

    public static int compareFighters(int[] fighters) {
        Arrays.sort(fighters);  // Sort the array in ascending order
        int n = fighters.length;

        while (n > 1) {
            int x = fighters[n - 1];
            int y = fighters[n - 2];

            if (x == y) {
                return 1;
            } else if (x >= y) {
                fighters[n - 2] = x - y;
            } else {
                return 0;
            }

            Arrays.sort(fighters, 0, n - 1);  // Sort the remaining elements
            n--;
        }

        return 0;
    }
}
