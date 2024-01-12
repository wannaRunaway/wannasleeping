package thinkingInJava;

public class Myobject2 {
    public static void main(String args[]){
        Myobject myobject = new Myobject();
        myobject.toString();
        System.out.println(myobject.staticValueOne);
        System.out.println(myobject.staticValueTwo);
        myobject.staticValueOne = "not yeap";
        var myobjectTwo = new Myobject();
        System.out.println(myobjectTwo.staticValueOne);
    }
}
