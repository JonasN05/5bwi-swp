package at.nigg.randomNumGen;

public class Main {
    public static void main(String[] args) {
        int[] data = DataGenerator.generateDataArray(8, 15, 50);
        DataGenerator.printArraySelfMade(data, 50);
    }
}
