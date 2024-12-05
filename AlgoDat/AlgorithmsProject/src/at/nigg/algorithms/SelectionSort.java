package at.nigg.algorithms;

public class SelectionSort implements Sorter {

    private String name;

    public SelectionSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        return new int[] { 3, 2, 1 };
    }

    @Override
    public String getName() {
        return this.name;
    }

}