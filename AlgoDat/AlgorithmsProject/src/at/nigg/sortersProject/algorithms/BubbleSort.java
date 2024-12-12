package at.nigg.sortersProject.algorithms;

public class BubbleSort implements Sorter {

    // https://www.geeksforgeeks.org/bubble-sort-algorithm/
    // https://www.w3schools.com/dsa/dsa_algo_bubblesort.php

    private String name;

    public BubbleSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        boolean swapped;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Tauschen von zwei Elementen
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Abbruch des Arrays sollte sich nichts verändern -> effizienter
            if (swapped == false)
                break;
        }
        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
