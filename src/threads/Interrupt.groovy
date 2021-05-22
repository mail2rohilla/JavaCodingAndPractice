package threads;

public class Interrupt {

    Thread th;
    void execute(){
        th = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!Thread.currentThread().isInterrupted()){
                    try{
                        while(!Thread.currentThread().isInterrupted()){}
//                            println "demmo interrupt"

                    }catch(InterruptedException ine){

                        println "thread is interrupted";
                    }

                    println "rechecking after interrupt ${Thread.currentThread().isInterrupted(true)}";
                    println "rechecking after interrupt after the method call ${Thread.currentThread().isInterrupted()}";

                }



            }
        });

        new ArrayList<>().so
        th.start();;
    }

    void interrupt(){
        th.interrupt();
    }
}
