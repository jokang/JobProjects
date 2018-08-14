package cn.jokang.misc;

public class StringRelated {

  private static void formatNull() {
    String nullString = null;
    String s = String.format("The result is %s.", nullString);
    System.out.println(s);
  }

  public static void main(String[] args) {
    formatNull();
  }

}
