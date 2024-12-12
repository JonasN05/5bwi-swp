package at.nigg.algorithms;

public class SelectionSort implements Sorter {

    private String name;

    public SelectionSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indexMinValue = i;
            for (int j = i + 1; j < array.length; j++) {
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