package threadbase;

public class RunnalbeThreadType implements Runnable{
    private Thread thread;
    private String threadName;
    RunnalbeThreadType(String threadName){
        this.threadName = threadName;
        System.out.println(threadName+" creating");
    }
    @Override
    public void run() {
        System.out.println("start running");
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" is cycling");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void start(){
        System.out.println("starting");
        if (thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
