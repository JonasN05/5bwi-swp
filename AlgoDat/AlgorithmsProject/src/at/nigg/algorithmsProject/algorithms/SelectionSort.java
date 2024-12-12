package at.nigg.algorithmsProject.algorithms;

public class SelectionSort implements Sorter {

    // https://www.geeksforgeeks.org/selection-sort-algorithm-2/
    // https://www.w3schools.com/dsa/dsa_algo_selectionsort.php

    private String name;

    public SelectionSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indexMinValue = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indexMinValue]) {
                    indexMinValue = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexMinValue];
            array[indexMinValue] = temp;
        }

        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }

}