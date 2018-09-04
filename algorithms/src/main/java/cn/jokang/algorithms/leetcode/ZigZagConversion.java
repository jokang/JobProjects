package cn.jokang.algorithms.leetcode;

public class ZigZagConversion {

  public String convert(String s, int numRows) {
    if (s.length() < 2 || numRows == 1) {
      return s;
    }

    int numCols = calColIdx(numRows, s.length() - 1) + 1;
    char[][] m = new char[numRows][numCols];
    for (int i = 0; i < s.length(); i++) {
      int rowIdx = calRowIdx(numRows, i);
      int colIdx = calColIdx(numRows, i);
      m[rowIdx][colIdx] = s.charAt(i);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        if (m[i][j] != 0) {
          sb.append(m[i][j]);
        }
      }
    }

    return sb.toString();
  }

  private int calRowIdx(int numRows, int idxInStr) {
    // 0, 1, 2, 3, 2, 1, 0 .....这样变化
    idxInStr = idxInStr % (2 * numRows - 2);
    int flag = idxInStr / numRows;
    if (flag % 2 == 0) {
      return idxInStr;
    } else {
      return 2 * (numRows - 1) - idxInStr;
    }
  }

  private int calColIdx(int numRows, int idxInStr) {
    // 每一竖条和斜条划为一组
    int numGroup = idxInStr / (numRows * 2 - 2);
    int idxInGroup = idxInStr % (numRows * 2 - 2);
    if (idxInGroup < numRows) {
      return numGroup * (numRows - 1);
    } else {
      return numGroup * (numRows - 1) + idxInGroup - numRows + 1;
    }
  }

  public static void main(String[] args) {
    ZigZagConversion c = new ZigZagConversion();
    System.out.println(c.convert("PAYPALISHIRING", 3));
  }
}
