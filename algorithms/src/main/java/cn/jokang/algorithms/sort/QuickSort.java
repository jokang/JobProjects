package cn.jokang.algorithms.sort;

/**
 * 快速排序
 */
public class QuickSort {
    /**
     * 交换array[i]和array[j]
     */
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 划分
     *
     * @param array    待划分的数组
     * @param beginIdx 起始index
     * @param endIdx   结束index
     * @return 划分后的pivot所在的index
     */
    private int partition(int[] array, int beginIdx, int endIdx) {
        int pivotIdx = beginIdx;
        int firstElementBiggerThanPivotIdx = beginIdx + 1;
        for (int i = beginIdx + 1; i <= endIdx; i++) {
            if (array[pivotIdx] > array[i]) {
                swap(array, firstElementBiggerThanPivotIdx, i);
                firstElementBiggerThanPivotIdx++;
            }
        }
        swap(array, pivotIdx, firstElementBiggerThanPivotIdx - 1);
        return firstElementBiggerThanPivotIdx - 1;
    }

    public void quickSort(int[] array, int begin, int end) {
        if (null == array || array.length <= 1) return;
        
        if (begin >= end) return; // 终止条件

        int pivotIndex = partition(array, begin, end);
        quickSort(array, begin, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, end);
    }
}
