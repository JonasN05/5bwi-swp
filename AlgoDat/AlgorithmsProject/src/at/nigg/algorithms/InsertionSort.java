package at.nigg.algorithms;

public class InsertionSort implements Sorter {

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
