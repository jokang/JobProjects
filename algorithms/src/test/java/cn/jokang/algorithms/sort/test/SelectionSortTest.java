package cn.jokang.algorithms.sort.test;

import cn.jokang.algorithms.sort.SelectionSort;
import org.junit.Test;

public class SelectionSortTest extends BasicSortTest {
    @Test
    public void testNormal() {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(array);
        print(array);
    }
    
    @Test
    public void testSpecialInput() {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(nullArray);
        selectionSort.selectionSort(emptyArray);
        selectionSort.selectionSort(oneElementArray);
    }
}
