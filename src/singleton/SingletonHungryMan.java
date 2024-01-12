package singleton;

public class SingletonHungryMan {
    //构造函数私有
    private SingletonHungryMan(){
    }
    //直接创建对象
    private static SingletonHungryMan singletonHungryMan = new SingletonHungryMan();
    //静态public提供外部访问
    public static SingletonHungryMan getInstance(){
        return singletonHungryMan;
    }
}
