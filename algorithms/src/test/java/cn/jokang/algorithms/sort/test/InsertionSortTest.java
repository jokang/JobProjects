package cn.jokang.algorithms.sort.test;

import cn.jokang.algorithms.sort.InsertionSort;
import org.junit.Test;

public class InsertionSortTest extends BasicSortTest {
    @Test
    public void testInsertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array);
        print(array);
    }
    
    @Test
    public void testSpecialInput() {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(nullArray);
        insertionSort.insertionSort(emptyArray);
        insertionSort.insertionSort(oneElementArray);
    }
}
