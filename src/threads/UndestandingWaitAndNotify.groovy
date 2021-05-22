package threads

class UndestandingWaitAndNotify {

    void execute(){
        SharableObject sharableObject = new SharableObject();
        sharableObject.a = (int)((Math.random().next()-1)*5)
        println "initially data is ${sharableObject.a}";;
        Thread th1 = new Thread(new Runnable() {
            @Override
            void run() {
                while(!Thread.currentThread().isInterrupted()){
                    if(sharableObject.a != 0){
                        println "making th1 wait for zero"
                        synchronized (sharableObject){
                            sharableObject.wait();
                        }
                    }else{
                        println "found zero";
                        Thread.yield();
                    }
                }

                println "th1 interrupted";
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            void run() {
                while(!Thread.currentThread().isInterrupted()){
                    if(sharableObject.a != 1){
                        println "making th2 wait for one"
                        synchronized (sharableObject){
                            sharableObject.wait();
                        }
                    }else{
                        println "found one";
                        Thread.yield();
                    }
                }

                println "th2 interrupted";
            }
        });
        Thread th3 = new Thread(new Runnable() {
            @Override
            void run() {
                while(!Thread.currentThread().isInterrupted()){
                    sharableObject.a = (int)((Math.random().next()-1)*5);
                    println "th3 value = ${sharableObject.a}"
                    synchronized (sharableObject){
                        println "notifying";
                        sharableObject.notify();
                    }

                    Thread.sleep(1000);
                }
            }
        });


        th1.start();
        th2.start();
        th3.start();
    }
}
