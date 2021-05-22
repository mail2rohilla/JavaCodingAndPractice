package threads

import java.util.concurrent.Callable
import java.util.concurrent.ExecutorCompletionService
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.locks.ReentrantLock

class ExecutorCallable {
    void execute(){

        ThreadLocal<Integer> intThreadLocal = new ThreadLocal<Integer>(){
            @Override
            protected Integer initialValue(){
                return 10;
            }
        };

        intThreadLocal.createInheritedMap();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorCompletionService service = new ExecutorCompletionService(executorService);
        ReentrantLock rl = new ReentrantLock();
        Future<String> f1 = service.submit(new Callable<String>() {
            @Override
            String call() throws Exception {
                println "entering 5 sec hold ${Thread.currentThread().getName()}"
                Thread.sleep(5000);
                println "5 sec hold complete"

                return "result after 5 secs";
            }
        });

        Future<Number>f2 = service.submit(new Callable<Number>() {
            @Override
            Number call() throws Exception {
                println "entering 1 sec hold ${Thread.currentThread().getName()}"
                Thread.sleep(1000);
                println "1 sec hold complete"

                return 10f;
            }
        });

        println service.take().get();
        println service.take().get();
//        println service.take().get(); // this will wait indefinitely for the task completion.

        executorService.shutdown();
    }

}
