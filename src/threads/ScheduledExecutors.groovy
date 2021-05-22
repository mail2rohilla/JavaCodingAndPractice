package threads

import java.time.LocalDateTime
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit

class ScheduledExecutors {

    void execute(){
        ScheduledExecutorService sc = Executors.newScheduledThreadPool(5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ScheduledFuture<String> scheduledFuture1 = sc.scheduleAtFixedRate(new Runnable() {
            @Override
            void run() throws Exception {
                String name = Thread.currentThread().getName();
//                int randomTIme = (int)((Math.random().next()-1)*5);
                int randomTIme = 1;
                println "execution1 ${name} at ${LocalDateTime.now().second} will sleep for ${randomTIme} seconds"
                Thread.sleep(randomTIme*1000);
            }
        },3, 1, TimeUnit.SECONDS);


        ScheduledFuture<String> scheduledFuture2 = sc.scheduleAtFixedRate(new Runnable() {
            @Override
            void run() throws Exception {
                String name = Thread.currentThread().getName();
//                int randomTIme = (int)((Math.random().next()-1)*5);
                int randomTIme = 2;
                println "execution2 ${name} at ${LocalDateTime.now().second} will sleep for ${randomTIme} seconds"
                Thread.sleep(randomTIme*1000);
            }
        },3, 2, TimeUnit.SECONDS);

        ScheduledFuture<String> scheduledFuture3 = sc.scheduleAtFixedRate(new Runnable() {
            @Override
            void run() throws Exception {
                String name = Thread.currentThread().getName();
//                int randomTIme = (int)((Math.random().next()-1)*5);
                int randomTIme = 3;
                println "execution3 ${name} at ${LocalDateTime.now().second} will sleep for ${randomTIme} seconds"
                Thread.sleep(randomTIme*1000);
            }
        },3, 3, TimeUnit.SECONDS);
    }
}
