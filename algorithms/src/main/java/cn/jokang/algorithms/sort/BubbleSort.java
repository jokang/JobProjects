package cn.jokang.algorithms.sort;

/**
 * 从小到大冒泡排序。
 */
public class BubbleSort {
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void bubbleSort(int[] array) {
        if (null == array) return;
       
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int sortedIdx = length - i - 1; // 记录排好序的第一个index

            // 未排序的部分比较两两相邻的元素，把大的移到右边
            for (int j = 0; j < sortedIdx; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
}
