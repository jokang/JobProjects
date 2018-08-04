package cn.jokang.algorithms.sort;

/**
 * 插入排序。不断选择无序区中的元素，插入到有序区中。
 */
public class InsertionSort {
    public void insertionSort(int[] array) {
        if (null == array || 1 == array.length) return;

        int sortedIdx = 0;
        for (int i = 1; i < array.length; i++) { // 遍历无序区中的每一个元素
            int indexToInsert = 0;
            // array[i] 是待插入的元素
            while (indexToInsert <= sortedIdx && array[indexToInsert] < array[i]) {
                indexToInsert++;
            }

            array[indexToInsert] = array[i];
            sortedIdx += 1;
        }
    }
}
