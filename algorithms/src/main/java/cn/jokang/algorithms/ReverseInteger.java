package cn.jokang.algorithms;

public class ReverseInteger {

  public int reverse(int x) {
    int ret = 0;
    while (x != 0) {
      int tail = x % 10;
      int newRet = ret * 10 + tail;
      if ((newRet - tail) / 10 != ret) {
        return 0;
      }
      ret = newRet;
      x = x / 10;
    }
    return ret;
  }

}
