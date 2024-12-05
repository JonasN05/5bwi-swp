package at.nigg.algorithms;

import java.util.Arrays;

public class InsertionSort implements Sorter {

    private String name;

    public InsertionSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
