package cn.jokang.algorithms.sort.test;

import cn.jokang.algorithms.sort.BubbleSort;
import org.junit.Test;

public class BubbleSortTest extends BasicSortTest {
    @Test
    public void testNormal() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        print(array);
    }

    @Test
    public void testSpecialInput() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(nullArray);
        bubbleSort.bubbleSort(emptyArray);
        bubbleSort.bubbleSort(oneElementArray);
    }
}
