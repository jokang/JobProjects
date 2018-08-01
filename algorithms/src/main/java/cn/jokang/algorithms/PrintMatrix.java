package cn.jokang.algorithms;

/**
 * 斜对角方向打印一个数组。
 * <p>
 * 比如：
 * [[1, 2, 3],
 * [4, 5, 6],
 * [7, 8, 9],
 * [10, 11, 12]]
 * 打印输出: 1, 2, 4, 3, 5, 7, 6, 8, 10, 9, 11, 12
 */
public class PrintMatrix {
    // 假设输入的数组是矩阵，不是“梯形数组”
    public void printMatrix(int[][] matrix) {
        if (null == matrix) return;

        int rowCount = matrix.length;
        if (rowCount == 0) return; // 空矩阵
        
        int columnCount = matrix[0].length;

        // 第一行
        for (int i = 0; i < matrix[0].length; i++) {
            printOneLine(matrix, 0, i);
        }

        // 最后一列
        for (int i = 1; i < rowCount; i++) {
            printOneLine(matrix, i, columnCount - 1);
        }

    }

    private void printOneLine(int[][] matrix, int rowIndex, int columnIndex) {
        // 打印一条斜线上的数组
        int i = rowIndex;
        int j = columnIndex;
        while (i < matrix.length && j >= 0) {
            System.out.println(matrix[i][j]);
            i++;
            j--;
        }
    }
}
