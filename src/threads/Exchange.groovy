package threads

import java.sql.Time
import java.time.LocalDateTime
import java.util.concurrent.Exchanger

class Exchange {

    Exchanger exchanger = new Exchanger<ArrayList>();

    void execute(){

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(0);
        b.add(1);
        new Thread(new ExchangeClass(exchanger, a)).start();
        new Thread(new ExchangeClass(exchanger, b)).start();
    };

    private class ExchangeClass implements Runnable
    {
        java.util.concurrent.Exchanger exchanger;

        ExchangeClass(Exchanger exchanger1, ArrayList initialValue){
            this.exchanger = exchanger1;
            data = initialValue;
        }

        ArrayList<Integer> data;

        @Override
        void run() {
            String name = Thread.currentThread().getName()
            println "initial value ${name} is ${data}";

            while(!Thread.currentThread().isInterrupted()){
                println("Thread ${name}  awaits exchange with data ${data}")
                data = exchanger.exchange(data);
                println("Thread ${name}  done exchange with data ${data}")

                int sleep = (int)(Math.random()*1000);
                Thread.sleep(sleep);
            }
        }
    }
}
