package threadbase;

class Counter {
    public static int count = 0;
    public static final Counter counter = new Counter();
}

class ThreadAdd implements Runnable {
    Thread thread;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (Counter.counter) {
                Counter.count = Counter.count + 1;
            }
            System.out.println(this.getClass().getName() + " " + Counter.count);
        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
}

class ThreadDec implements Runnable {
    Thread thread;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (Counter.counter) {
                Counter.count = Counter.count - 1;
            }
            System.out.println(this.getClass().getName() + " " + Counter.count);
        }
    }

    public void start() {
        if (thread == null) {
            Thread thread1 = new Thread(this);
            thread = thread1;
            thread.start();
        }
    }
}

public class Threadsynchronize {
    public static void main(String[] args) throws InterruptedException {
        var threadAdd = new ThreadAdd();
        var threaddec = new ThreadDec();
        threadAdd.start();
        threaddec.start();
        threadAdd.thread.join();
        threaddec.thread.join();
        System.out.println("final result is "+Counter.count);
    }
}
