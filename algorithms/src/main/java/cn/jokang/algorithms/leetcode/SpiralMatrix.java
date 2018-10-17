package cn.jokang.algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

// #54 也是顺时针方向打印数组
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> output = new ArrayList<>(rows * cols);
        appendOneLayer(matrix, 0, 0, rows - 1, cols - 1, output);
        return output;
    }

    private void appendOneLayer(int[][] matrix, int startRowIdx, int startColIdx, int endRowIdx, int endColIdx, List<Integer> output) {

        for (int i = startColIdx; i <= endColIdx; i++) {
            output.add(matrix[startRowIdx][i]);
        }
        for (int i = startRowIdx + 1; i <= endRowIdx; i++) {
            output.add(matrix[i][endColIdx]);
        }
        for (int i = endColIdx - 1; i >= startColIdx + 1; i--) {
            output.add(matrix[endRowIdx][i]);
        }
        for (int i = endRowIdx; i >= startRowIdx + 1; i--) {
            output.add(matrix[i][startColIdx]);
        }
        if (endRowIdx >= startRowIdx || endColIdx >= startColIdx)
            appendOneLayer(matrix, startRowIdx + 1, startColIdx + 1, endRowIdx - 1, endColIdx - 1, output);
    }

    public static void main(String[] args) {
        SpiralMatrix s = new SpiralMatrix();
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(s.spiralOrder(m));
    }
}
