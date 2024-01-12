public class Test {
    public static void main(String[] args) {
        Window window = new Window();
        window.show(new Button());
        window.show(new TextView());
    }
    public static class Window{
        public void show(View child){
            child.mesure();
            child.draw();
        }
    }

    //写一个抽象view,draw交给子类自己实现，mesure公用代码
    public static abstract class View{
        public void mesure(){
            print("view mesure");
        }
        public abstract void draw();
    }

    //写一个Button
    public static class Button extends View{
        @Override
        public void draw() {
            print("button draw");
        }
    }

    //新建一个TextView文件
    public static class TextView extends View{
        @Override
        public void draw() {
            print("textview draw");
        }
    }

    public static void print(String message){
        System.out.println(message);
    }
}
