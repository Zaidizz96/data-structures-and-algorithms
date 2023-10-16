package dataStructures.insertion_sort;

import java.util.ArrayList;

public class InsertionSortArray {
    public static void insert(ArrayList<Integer> sorted, int value) {
        int i = 0;
        while (i < sorted.size() && value > sorted.get(i)) {
            i++;
        }
        sorted.add(i, value);
    }

    public static int[] insertionSort(int[] input) {
        ArrayList<Integer> sorted = new ArrayList<>();
        sorted.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            insert(sorted, input[i]);
        }
        return sorted.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] sampleArray = {8, 4, 23, 42, 16, 15};
        int[] sortedArray = insertionSort(sampleArray);

        System.out.print("Sorted Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
