import static org.junit.Assert.assertArrayEquals;

import org.example.BubbleSort;
import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedArr = {11, 12, 22, 25, 34, 64, 90};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] sortedArr = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sortedArr = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] arr = {64, -34, 25, -12, 22, 11, -90};
        int[] sortedArr = {-90, -34, -12, 11, 22, 25, 64};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithMixedNumbers() {
        int[] arr = {-64, 34, -25, 12, -22, 11, 90};
        int[] sortedArr = {-64, -25, -22, 11, 12, 34, 90};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] arr = {5};
        int[] sortedArr = {5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithRepeatedElements() {
        int[] arr = {5, 2, 5, 8, 2, 1, 5};
        int[] sortedArr = {1, 2, 2, 5, 5, 5, 8};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithLargeNumbers() {
        int[] arr = {10000, 1000, 100, 10, 1};
        int[] sortedArr = {1, 10, 100, 1000, 10000};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithLargeNegativeNumbers() {
        int[] arr = {-1_000_000, -100_000, -10_000, -1000, -100};
        int[] sortedArr = {-1_000_000, -100_000, -10_000, -1000, -100};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }
}
