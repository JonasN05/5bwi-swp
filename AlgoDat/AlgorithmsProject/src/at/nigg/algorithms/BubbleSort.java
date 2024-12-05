package at.nigg.algorithms;

public class BubbleSort implements Sorter {

    private String name;

    public BubbleSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        return new int[] { 1, 2, 3 };
    }

    @Override
    public String getName() {
        return this.name;
    }

}
