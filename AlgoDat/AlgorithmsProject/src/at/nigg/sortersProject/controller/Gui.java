package at.nigg.sortersProject.controller;

import at.nigg.sortersProject.algorithms.BubbleSort;
import at.nigg.sortersProject.algorithms.InsertionSort;
import at.nigg.sortersProject.algorithms.SelectionSort;
import at.nigg.sortersProject.algorithms.Sorter;

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
