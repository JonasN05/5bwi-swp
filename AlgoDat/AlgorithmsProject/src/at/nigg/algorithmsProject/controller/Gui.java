package at.nigg.algorithmsProject.controller;

import at.nigg.algorithmsProject.algorithms.BubbleSort;
import at.nigg.algorithmsProject.algorithms.InsertionSort;
import at.nigg.algorithmsProject.algorithms.SelectionSort;
import at.nigg.algorithmsProject.algorithms.Sorter;

public class Gui {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Sorter bubbleSort = new BubbleSort("bubble");
        Sorter insertionSort = new InsertionSort("insertion");
        Sorter selectionSort = new SelectionSort("selection");

        controller.addSorter(bubbleSort);
        controller.addSorter(insertionSort);
        controller.addSorter(selectionSort);

        controller.run();

    }

}
