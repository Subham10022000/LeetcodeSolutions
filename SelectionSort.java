package org.example;

// Selection sort in Java

// Selection sort in Java

import java.util.Arrays;

class SelectionSort {
    void selectionSort(int array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) { //run this upto [lastindex-1]
            int min_idx = step; // set first element as min

            for (int i = step + 1; i < size; i++){

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]){
                    min_idx = i;
        }
    }
            // put min at the correct position
            int temp = array[step]; //swap the min element with the current step element
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    // driver code
    public static void main(String args[]) {
        int[] data = { 20, 12, 10, 15, 2 };
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}