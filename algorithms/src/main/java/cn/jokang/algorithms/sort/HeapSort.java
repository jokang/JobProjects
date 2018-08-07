package cn.jokang.algorithms.sort;

public class HeapSort {
    public void heapSort(int arr[]) {
        int elementsCount = arr.length;

        // Build heap (rearrange array)
        for (int i = elementsCount / 2 - 1; i >= 0; i--)
            heapify(arr, elementsCount, i);

        // One by one extract an element from heap
        for (int firstSortedIdx = elementsCount - 1; firstSortedIdx >= 0; firstSortedIdx--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[firstSortedIdx];
            arr[firstSortedIdx] = temp;

            // call max heapify on the reduced heap
            @SuppressWarnings("UnnecessaryLocalVariable")
            int remainHeapSize = firstSortedIdx;
            heapify(arr, remainHeapSize, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private void heapify(int arr[], int heapSize, int rootIdx) {
        int largestIdx = rootIdx;  // Initialize largest as root
        int left = 2 * rootIdx + 1;  // left = 2*i + 1
        int right = 2 * rootIdx + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (left < heapSize && arr[left] > arr[largestIdx])
            largestIdx = left;

        // If right child is larger than largest so far
        if (right < heapSize && arr[right] > arr[largestIdx])
            largestIdx = right;

        // If largest is not root
        if (largestIdx != rootIdx) {
            int swap = arr[rootIdx];
            arr[rootIdx] = arr[largestIdx];
            arr[largestIdx] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, heapSize, largestIdx);
        }
    }
}
