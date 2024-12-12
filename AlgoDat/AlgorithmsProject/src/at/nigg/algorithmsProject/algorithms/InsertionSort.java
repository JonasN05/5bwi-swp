package at.nigg.algorithmsProject.algorithms;

public class InsertionSort implements Sorter {

    // https://www.geeksforgeeks.org/insertion-sort-algorithm/
    // https://www.w3schools.com/dsa/dsa_algo_insertionsort.php

    private String name;

    public InsertionSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
