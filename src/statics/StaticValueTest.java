package statics;

import javax.print.attribute.standard.PrinterInfo;
import javax.print.attribute.standard.PrinterMoreInfo;
import java.util.Arrays;

public class StaticValueTest {
    public static int value = 10;
    protected int a = 10;
}

class Executerion {
    public static void main(String[] args) {
        StaticValueTest.value++;
        StaticValueTest staticValueTest1 = new StaticValueTest();
        StaticValueTest staticValueTest2 = new StaticValueTest();
        System.out.println(staticValueTest1.value==staticValueTest2.value);
        String a = "我的";
        switch (a){
            case "我的":
            System.out.println("我的");
            break;
            default:
                break;
        }
        Leaf leaf = new Leaf();
        leaf.getleaf().getleaf().getleaf().getleaf().print();
        int[] test = new int[1];
        test[0] = 1;
//        test[1] = 2;
        System.out.println(Arrays.toString(test));
        System.out.println(leaf);
        changeArguments(1, "我");
        changeArguments(1, "我", "你");
        changeArguments(1);
        Circle circle = new Circle();
        circle.draw(1);
        circle.draw();
    }

    static void changeArguments(int canddy, String... object){
        System.out.print("canddy: "+canddy);
        for (String s: object) {
            System.out.println("object: "+s);
        }
    }
}

class Leaf{
    int i;
    public Leaf getleaf(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i =  :"+i);
    }

    @Override
    public String toString() {
        return "super.toString()";
    }

}

class Circle extends Shape{

    void draw(int i) {
        System.out.println("circle draw "+i);
    }
}
