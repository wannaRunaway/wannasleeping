package singleton;

public class SingletonInnerClass {
    private SingletonInnerClass(){}
    /*
    静态内部类
    * */
    private static class SingletonHolder{
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }
    public static SingletonInnerClass getInstance(){
        return SingletonHolder.instance;
    }

    private Object readResolve(){
        return SingletonHolder.instance;
    }
}
