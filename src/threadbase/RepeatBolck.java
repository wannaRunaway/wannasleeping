package threadbase;

/**
 * 可重入锁
 * */
public class RepeatBolck {
    private int count;
    public synchronized void add(int number){
        count = count+number;
        System.out.println("add "+count);

    }

    public synchronized void des(int number){
        count = count - number;
        System.out.println("des "+count);
    }

    public static class MainBolck {
        public static void main(String[] args) {
            RepeatBolck repeatBolck = new RepeatBolck();
            repeatBolck.add(10);
            repeatBolck.des(2);
            System.out.println("result "+repeatBolck.count);
        }
    }
}

