package threadbase;

public class JavaBase {
    public static void main(String[] args) throws InterruptedException {
//        var runnalbeThreadType = new threadbase.RunnalbeThreadType(threadbase.RunnalbeThreadType.class.getCanonicalName());
//        runnalbeThreadType.start();
//        var extendThread = new threadbase.ExtendThread(threadbase.ExtendThread.class.getName());
//        extendThread.start();
        int count = 0;
        var thread = new Thread(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"starting");
        });
        System.out.println("start...");
        thread.start();
        thread.join();
        System.out.println("end...");
    }
}
