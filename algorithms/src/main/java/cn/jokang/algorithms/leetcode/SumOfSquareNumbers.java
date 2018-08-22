package cn.jokang.algorithms.leetcode;

// No. 633
public class SumOfSquareNumbers {
    // TEL
    public boolean judgeSquareSum(int c) {
        double doubleBound = Math.sqrt(c / 2.0);
        int bound = (int) doubleBound;
        long a = 0;
        long b = c;
        while (a <= bound && b >= bound && a <= b) {
            long val = a * a + b * b;
            if (val == c) {
                return true;
            } else if (val > c) {
                b--;
            } else {
                a++;
            }
        }

        return false;
    }

    // 3. User Math.sqrt
    public boolean judgeSquareSum3(int c) {
        // a must be of long type.
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }

        return false;
    }

    // 4.Use binary search
    public boolean judgeSquareSum4(int c) {
        for (long a = 0; a * a <= c; a++) {
            int b = c - (int) (a * a);
            if (binary_search(0, b, b)) {
                System.out.println("a=" + a + ", b=" + (int) Math.sqrt(b));
                return true;
            }
        }
        return false;
    }

    public boolean binary_search(long s, long e, int n) {
        if (s > e)
            return false;
        long mid = s + (e - s) / 2;
        if (mid * mid == n)
            return true;
        if (mid * mid > n)
            return binary_search(s, mid - 1, n);
        return binary_search(mid + 1, e, n);
    }

    public static void main(String[] args) {
        SumOfSquareNumbers s = new SumOfSquareNumbers();
        s.judgeSquareSum4(100000);
        s.judgeSquareSum4(999999999);
    }
}
