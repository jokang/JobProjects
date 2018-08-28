package cn.jokang.algorithms.leetcode;

/**
 * 405. Convert a Number to Hexadecimal
 */
public class ConvertToHexdecimal {
    private final char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String toHex(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.insert(0, m[num & 0xf]);
            num = (num >>> 4);
        }
        return sb.toString();
    }
}
