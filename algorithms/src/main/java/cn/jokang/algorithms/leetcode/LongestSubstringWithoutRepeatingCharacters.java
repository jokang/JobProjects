package cn.jokang.algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

  public int DpSolution(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }
    int startIdx = 0; // 最后一个字符串结尾的最长无重复字符子串的起始位置
    int ret = 1;
    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      int j = indexOf(s, startIdx, i - 1, c);
      if (j != -1) {
        // 添加之后重复，不可能有更长的子串
        startIdx = j + 1;
      } else {
        // 添加之后不重复
        int l = i - startIdx + 1;
        if (l > ret) {
          ret = l;
        }
      }
    }
    return ret;
  }

  private int indexOf(String s, int start, int end, char c) {
    for (int i = end; i >= start; i--) {
      if (s.charAt(i) == c) {
        return i;
      }
    }
    return -1;
  }

  public int SlidingWindowSolution1(String s) {
    int ret = 0;
    int length = s.length();
    int left = 0;
    int right = 0;
    Set<Character> set = new HashSet<>();
    while (left < length && right < length) {
      char c = s.charAt(right);
      if (set.contains(c)) {
        // 可以一次跳多步
        set.remove(s.charAt(left));
        left++;
      } else {
        ret = Math.max(ret, right - left + 1);
        set.add(c);
        right++;
      }
    }

    return ret;
  }
}
