package datastructures.insertion_sort;

import dataStructures.insertion_sort.InsertionSortArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortArrayTest {

    @Test
    public void testReverseSorted() {
        int[] input = {20, 18, 12, 8, 5, -2};
        int[] expected = {-2, 5, 8, 12, 18, 20};
        int[] result = InsertionSortArray.insertionSort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testFewUniques() {
        int[] input = {5, 12, 7, 5, 5, 7};
        int[] expected = {5, 5, 5, 7, 7, 12};
        int[] result = InsertionSortArray.insertionSort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testNearlySorted() {
        int[] input = {2, 3, 5, 7, 13, 11};
        int[] expected = {2, 3, 5, 7, 11, 13};
        int[] result = InsertionSortArray.insertionSort(input);
        Assertions.assertArrayEquals(expected, result);
    }
}
