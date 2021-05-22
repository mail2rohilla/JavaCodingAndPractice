package threads

class CommonResourceSharingByMultipleThreads {

    static int count = 0;
    Integer  data = 50;
    Thread[] threads;
    Set<Integer> set = new TreeSet<>();

    synchronized void performadd()
    {
        this.data += 10;
//        println "${Thread.currentThread().getName()} add"

    }

    synchronized void performsub(){
        this.data -= 10;
//        println "${Thread.currentThread().getName()} sub"

    }

    synchronized void inccoount(){
        count++;
    }
    void performTransaction(){
        performadd();

//        Thread.sleep(new Random().nextInt(2));
        performsub();
//        data++;
        inccoount();

        set.add(this.data);


if(data != 50)
    println "data is ${this.set}"

//        Thread.sleep(1000)
    }
    void execute(){

        Thread mainThread = Thread.currentThread();

        Thread[] th = new Thread[10];
        for(int i = 0; i< 10;i++){
            th[i] =
            new Thread(new Runnable() {
                @Override
                void run() {
                    while(!Thread.currentThread().isInterrupted()){
                        performTransaction();
                    }

                    println "interrupted ${Thread.currentThread().getName()}"


                }
            }, "DeepuThread_" + i);
        }
        threads = th;

        for(Thread thread : th){
            println "starting Thread ${thread.getName()}"
            thread.start();
        }
    }

    void interrupt(){
        println "interrupting all threads"
        for(Thread th : this.threads){
            if(th.getState() == TIMED_WAITING)
            th.interrupt();
        }
    }

}
