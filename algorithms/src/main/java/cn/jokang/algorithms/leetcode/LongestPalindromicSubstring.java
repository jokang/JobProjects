package cn.jokang.algorithms.leetcode;

public class LongestPalindromicSubstring {

  public String dpSolution(String s) {
    if (s == null || s.length() < 2) {
      return s;
    }

    int n = s.length();
    boolean[][] isPalindromic = new boolean[n][n];
    isPalindromic[0][0] = true;
    int l = 0;
    int r = 0;

    for (int i = 1; i < n; i++) {
      isPalindromic[i][i] = true;
      if (s.charAt(i - 1) == s.charAt(i)) {
        isPalindromic[i - 1][i] = true;
        l = i - 1;
        r = i;
      }
    }
    for (int step = 2; step < n; step++) {
      for (int i = 0; i < n - step; i++) {
        int j = i + step;
        if (s.charAt(i) == s.charAt(j) && isPalindromic[i + 1][j - 1]) {
          isPalindromic[i][j] = true;
          l = i;
          r = j;
        }

      }
    }

    return s.substring(l, r + 1);
  }

  public static void main(String[] args) {
    LongestPalindromicSubstring l = new LongestPalindromicSubstring();
    System.out.println(l.dpSolution("babad"));
  }
}
