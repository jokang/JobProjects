package cn.jokang.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

  public boolean wordPattern(String pattern, String str) {
    String[] ss = str.split(" ");
    if (ss.length != pattern.length()) {
      return false;
    }

    Map index = new HashMap();
    for (Integer i = 0; i < pattern.length(); i++) {
      if (index.put(ss[i], i) != index.put(pattern.charAt(i), i)) {

        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    WordPattern wp = new WordPattern();
    System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
  }
}
