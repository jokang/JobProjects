package cn.jokang.algorithms.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        if (x == 0) return true;

        int a = 1000000000;
        while (x / a == 0) a /= 10;

        int b = 1;
        while (a > b) {
            int hi = x / a % 10;
            int low = x / b % 10;
            if (hi == low) {
                a /= 10;
                b *= 10;
            } else {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(1000000001));
    }
}
