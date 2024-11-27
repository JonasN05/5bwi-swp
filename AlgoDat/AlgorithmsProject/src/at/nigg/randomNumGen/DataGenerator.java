package at.nigg.randomNumGen;

import java.util.Arrays;
import java.util.Random;

public class DataGenerator {

    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            int number = random.nextInt();
            data[i] = number;
        }
        return data;
    }

    public static int[] generateDataArray(int size, int min, int max) {
        Random random = new Random();
        int[] data = new int[size];
        int bound = max - min;
        for (int i = 0; i < size; i++) {
            data[i] = min + random.nextInt(bound);
        }
        return data;
    }

    public static void printArray(int[] data) {
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        System.out.println("------------------------------");

        for (int i : data) {
            System.out.println(i);
        }
    }

}