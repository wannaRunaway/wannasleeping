package thinkingInJava;

import java.util.Arrays;

public class JavaPrintln {
    public static void Print(int... elements){
        System.out.println(Arrays.toString(elements));
        for(int number: elements){
            System.out.println(number);
        }
    }
}
