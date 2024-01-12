package singleton;

public class SingletonDCL {
    //构造函数private,无法new
    private SingletonDCL(){
    }
    private static volatile SingletonDCL singletonDCL = new SingletonDCL();
    public static SingletonDCL getInstance(){
        //第一次判空，为了检验当前是否有对象
        if (singletonDCL==null){
            synchronized (SingletonDCL.class){
                //第二次判空，第一次初始化的时候，因为多个线程都跑到了这里，所以为了避免重复创建，会再次判空
                if (singletonDCL == null){
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }
}
