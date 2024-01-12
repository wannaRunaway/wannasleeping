package threadbase;

public class ExtendThread extends Thread{
    private Thread thread;
    private String threadName;
    ExtendThread(String threadName){
        this.threadName = threadName;
        System.out.println("creating"+threadName);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("running");
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" cycling");
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
