package threadbase;

public class DeadBolck {
    private DeadBolck deadBolck1 = new DeadBolck();
    private DeadBolck deadBolck2 = new DeadBolck();
    private int count = 0;

    public void onebolck(){
        synchronized (deadBolck1){
            count = count + 10;
            System.out.println("oneblock1 "+count);
            synchronized (deadBolck2){
                count = count + 10;
                System.out.println("oneblock2 "+count);
            }
        }
    }

    public void secondblock(){
        synchronized (deadBolck2){
            count = count - 20;
            System.out.println("secondblock1 "+count);
            synchronized (deadBolck1){
                count = count -20;
                System.out.println("secondblock2 "+count);
            }
        }
    }


    static class MainRun{
        public static void main(String[] args) throws InterruptedException {
            DeadBolck deadBolck = new DeadBolck();
            var thread1 = new Thread(deadBolck::onebolck);
            var thread2 = new Thread(deadBolck::secondblock);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println("main end");

        }
    }
}
