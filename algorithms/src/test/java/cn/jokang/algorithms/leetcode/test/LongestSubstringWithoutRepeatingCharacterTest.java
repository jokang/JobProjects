package cn.jokang.algorithms.leetcode.test;

import cn.jokang.algorithms.leetcode.LongestSubstringWithoutRepeatingCharacters;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacterTest {

  @Test
  public void test1() {
    LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
    String s1 = "abcabcbb";
    Assert.assertEquals(3, solution.DpSolution(s1));

    String s2 = "bbbbb";
    Assert.assertEquals(1, solution.DpSolution(s2));

    String s3 = "pwwkew";
    Assert.assertEquals(3, solution.DpSolution(s3));
  }

}
