package 死锁分析;

public class DeadLockDemo {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";

    public static void main(String[] args) {
        Thread a = new Thread(new LockThread1());
        Thread b = new Thread(new LockThread2());
        a.start();
        b.start();
    }
}

class LockThread1 implements Runnable {

    @Override
    public void run() {

        System.out.println("lockThread1 running");
        while (true) {
            synchronized (DeadLockDemo.obj1) {
                System.out.println("lockThrea1 lock obj1");
                try {
                    Thread.sleep(3000);
                    synchronized (DeadLockDemo.obj2) {
                        System.out.println("lockThrea1 lock obj2");
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}

class LockThread2 implements Runnable {

    @Override
    public void run() {

        System.out.println("lockThread2 running");
        while (true) {
            synchronized (DeadLockDemo.obj2) {
                System.out.println("lockThrea2 lock obj2");
                try {
                    Thread.sleep(3000);
                    synchronized (DeadLockDemo.obj1) {
                        System.out.println("lockThrea2 lock obj1");
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
