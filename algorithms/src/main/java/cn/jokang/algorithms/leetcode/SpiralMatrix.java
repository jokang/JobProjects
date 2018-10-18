package cn.jokang.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;

// #54 也是顺时针方向打印数组
@SuppressWarnings("WeakerAccess")
public class SpiralMatrix {

  public List<Integer> spiralOrder(int[][] matrix) {
    if (null == matrix || matrix.length == 0) {
      return Collections.emptyList();
    }
    int rows = matrix.length;
    int cols = matrix[0].length;
    List<Integer> output = new ArrayList<>(rows * cols);
    appendOneLayer(matrix, 0, 0, rows - 1, cols - 1, output);
    return output;
  }

  private void appendOneLayer(int[][] matrix, int startRowIdx, int startColIdx, int endRowIdx, int endColIdx,
      List<Integer> output) {
    if (endRowIdx < startRowIdx || endColIdx < startColIdx) {
      return;
    }

    for (int i = startColIdx; i <= endColIdx; i++) {
      output.add(matrix[startRowIdx][i]);
    }
    for (int i = startRowIdx + 1; i <= endRowIdx; i++) {
      output.add(matrix[i][endColIdx]);
    }
    if (startRowIdx == endRowIdx || startColIdx == endColIdx) {
      // 要考虑最后只有一行或者只有一列的情况。
      return;
    }
    for (int i = endColIdx - 1; i >= startColIdx + 1; i--) {
      output.add(matrix[endRowIdx][i]);
    }
    for (int i = endRowIdx; i >= startRowIdx + 1; i--) {
      output.add(matrix[i][startColIdx]);
    }
    appendOneLayer(matrix, startRowIdx + 1, startColIdx + 1, endRowIdx - 1, endColIdx - 1, output);
  }

  public static void main(String[] args) {
    SpiralMatrix s = new SpiralMatrix();
    int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    Assert.assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), s.spiralOrder(m));
    //Assert.assertArrayEquals(s.spiralOrder(m).toArray(new Integer[9]), new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5});

    int[][] m2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    Assert.assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), s.spiralOrder(m2));

    int[][] m3 = {{6, 9, 7}};
    Assert.assertEquals(Arrays.asList(6, 9, 7), s.spiralOrder(m3));
  }
}
