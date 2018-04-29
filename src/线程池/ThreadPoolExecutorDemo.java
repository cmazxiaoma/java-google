package 线程池;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecutorDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        List<Future<?>> taskResults = new LinkedList<Future<?>>();

        for (int i = 0; i < 10; i++) {
            taskResults.add(threadPool.submit(new Task(i)));
        }

        System.out.println("10 tasks dispatch successfully");

        for (Future<?> future : taskResults) {
            future.get();
        }

        System.out.println("10 taska all finished");
        threadPool.shutdown();
    }
}
