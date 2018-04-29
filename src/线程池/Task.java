package 线程池;

public class Task implements Runnable {
    private final int id;

    public Task(int id) {
        super();
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("task id=" + id);
    }
}
