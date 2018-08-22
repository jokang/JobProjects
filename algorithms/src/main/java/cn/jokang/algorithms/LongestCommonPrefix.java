package cn.jokang.algorithms;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (null == strs || strs.length == 0) {
      return "";
    }

    if (strs.length == 1) {
      return strs[0];
    }

    int i = 0;
    for (; i < strs[0].length(); i++) { // For every char in the first string.
      char c = strs[0].charAt(i);

      int strIdx = 1;
      while (strIdx < strs.length && strs[strIdx].length() > i && strs[strIdx].charAt(i) == c) {
        strIdx++;
      }

      if (strIdx != strs.length) {
        break;
      }
    }

    return strs[0].substring(0, i);
  }

  public static void main(String[] args) {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
  }
}
