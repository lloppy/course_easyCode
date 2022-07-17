package lesson_4_5_6.sum;

import java.io.FilterOutputStream;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        String first = "String";
        String second = "sum";
        String result = sumStr(first,second);

        System.out.println(result);
    }

    public static String sumStr(String first, String second){
        return first + " " + second;
    }
}