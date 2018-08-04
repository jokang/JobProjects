package cn.jokang.algorithms.sort.test;


import cn.jokang.algorithms.sort.QuickSort;
import org.junit.Test;

public class QuickSortTest extends BasicSortTest {
    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length - 1);
    }

    @Test
    public void testSpecialInput() {
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nullArray, 0, array.length - 1);
        quickSort.quickSort(emptyArray, 0, array.length - 1);
        quickSort.quickSort(oneElementArray, 0, array.length - 1);
    }
}
