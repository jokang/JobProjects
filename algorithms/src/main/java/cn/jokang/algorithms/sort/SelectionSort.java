package cn.jokang.algorithms.sort;

/**
 * 选择未排序的部分的最大/最小元素，然后追加到已排序部分
 */
public class SelectionSort {
    public void selectionSort(int[] array) {
        if (null == array) return;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
