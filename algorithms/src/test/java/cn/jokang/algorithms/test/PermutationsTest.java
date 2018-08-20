package cn.jokang.algorithms.test;

import cn.jokang.algorithms.Permutations;
import org.junit.Test;

import java.util.List;

public class PermutationsTest {
    private static void print(List<List<Integer>> lstOfLst) {
        for (List<Integer> lst : lstOfLst) {
            for (Integer i : lst) {
                System.out.print(i);
                System.out.print(',');
            }
            System.out.println();
        }
    }

    @Test
    public void test1() {
        Permutations p = new Permutations();
        List<List<Integer>> result = p.permute(new int[]{1, 2, 3});
        print(result);
    }
}
