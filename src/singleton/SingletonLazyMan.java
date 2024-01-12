package singleton;

public class SingletonLazyMan {
    //构造函数private,无法new
    private SingletonLazyMan(){
    }
    private static SingletonLazyMan singletonLazyMan;
    public synchronized static SingletonLazyMan getInstance(){
        if (singletonLazyMan == null){
            singletonLazyMan = new SingletonLazyMan();
        }
        return singletonLazyMan;
    }
}
