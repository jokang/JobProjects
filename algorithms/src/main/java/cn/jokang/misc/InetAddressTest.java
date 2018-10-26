package cn.jokang.misc;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

  public static void main(String[] args) throws UnknownHostException {
    InetAddress local = InetAddress.getLocalHost();
    System.out.println(local);
    // 在配置了hostname，但没有配置相应域名解析的机器上，因为需要域名解析，下面的语句会很慢。
    System.out.println(local.getCanonicalHostName());
    System.out.println(local.getHostAddress());
  }
}
