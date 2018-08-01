package cn.jokang.algorithms.sort.test;


import cn.jokang.algorithms.sort.QuickSort;
import org.junit.Test;

public class QuickSortTest {
    private int[] nullArray = null;
    private int[] emptyArray = {};
    private int[] oneElementArray = {1};

    private int[] array = {10, 3, 5, 8, 7};

    @Test
    public void testQuickSortExceptions() {
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nullArray, 0, array.length - 1);
        quickSort.quickSort(emptyArray, 0, array.length - 1);
        quickSort.quickSort(oneElementArray, 0, array.length - 1);
    }

    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
