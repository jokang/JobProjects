package cn.jokang.algorithms.test;


import cn.jokang.algorithms.PrintMatrix;
import org.junit.Test;

public class PrintMatrixTest {
    /**
     * 1  2  3
     * 4  5  6
     * 7  8  9
     * 10 11 12
     * 13 14 15
     */

    private int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};

    private int[][] emptyMatrix = {};

    private int[][] oneRowMatrix = {{1, 2, 3}};

    private int[][] oneColumnMatrix = {{1}, {2}, {3}};
    
    private int[][] onlyOneElement = {{1}};

    @Test
    public void testPrintMatrix() {
        PrintMatrix printMatrix = new PrintMatrix();
        printMatrix.printMatrix(matrix);
    }

    @Test
    public void testPrintEmptyMatrix() {
        PrintMatrix printMatrix = new PrintMatrix();
        printMatrix.printMatrix(emptyMatrix);
    }
    
    @Test
    public void testOneRowMatrix() {
        PrintMatrix printMatrix = new PrintMatrix();
        printMatrix.printMatrix(oneRowMatrix);
    }

    @Test
    public void testOneColumnMatrix() {
        PrintMatrix printMatrix = new PrintMatrix();
        printMatrix.printMatrix(oneRowMatrix);
    }

    @Test
    public void testOnlyOneElementMatrix() {
        PrintMatrix printMatrix = new PrintMatrix();
        printMatrix.printMatrix(onlyOneElement);
    }
}
