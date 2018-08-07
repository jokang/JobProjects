package cn.jokang.concurrence;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello thread.");
        throw new RuntimeException("False alarm.");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new SimpleThread();
        t.setUncaughtExceptionHandler((t1, e) -> {
            System.out.println(t1.getName());
        });
        t.start();
        t.join();
    }
}
