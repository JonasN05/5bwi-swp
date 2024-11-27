package at.nigg.randomNumGen;

public class Main {
    public static void main(String[] args) {
        int[] data = DataGenerator.generateDataArray(5, 15, 50);
        DataGenerator.printArray(data);
    }
}
