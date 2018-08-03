package cn.jokang.algorithms.sort.test;


public class BasicSortTest {
    protected int[] nullArray = null;
    protected int[] emptyArray = {};
    protected int[] oneElementArray = {1};

    protected int[] array = {10, 3, 5, 8, 7};
    
    protected void print(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
