package cn.jokang.algorithms.sort.test;

import cn.jokang.algorithms.sort.SelectionSort;
import org.junit.Test;

public class SelectionSortTest extends BasicSortTest {
    @Test
    public void testNormal() {
        SelectionSort bubbleSort = new SelectionSort();
        bubbleSort.selectionSort(array);
        print(array);
    }
}
