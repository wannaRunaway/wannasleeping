import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

/*
读书系列：
数据结构与算法分析
 */
public class DataStructer {
    public static void main(String[] args) {
//        copyArray();
//        deleteArray();
        deleteArrayItrator();

    }

    private static void deleteArrayItrator() {
        List<Integer> list =  List.of(1,2,3,4,5,6);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next()%2==0){
                iterator.remove();
            }
        }
    }

    //删除偶数元素
    private static void deleteArray() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int i = 0;
        while (i < list.size()) {
            if (list.get(i)%2==0){ //取余是偶数
                list.remove(i);
            } else {
                i ++;
            }
        }
        for (int element: list){
            System.out.print(element);
        }
    }

    //手动扩容数组
    private static void copyArray() {
        int originArr[] = new int[]{10, 0, 9};
        int newArray[] = new int[originArr.length * 2];
        for (int i = 0; i < originArr.length; i++) {
            newArray[i] = originArr[i];
        }
        originArr = newArray;
        for (int numbers : originArr) {
            System.out.println(numbers);
        }
    }
}
