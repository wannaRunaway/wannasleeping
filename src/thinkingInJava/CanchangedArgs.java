package thinkingInJava;

public class CanchangedArgs {
    public static void main(String[] args) {
        canchangedargs(1);
        canchangedargs(1,2,3);
        canchangedargs();
    }

    static void canchangedargs(int... elements){
        JavaPrintln.Print(elements);
    }
}
