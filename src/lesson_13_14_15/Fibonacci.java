package lesson_13_14_15;

public class Fibonacci {
    public static void main(String[] args) {
        print(subsequence(10));
        print(subsequence(1));
        print(subsequence(2));
    }

    public static String subsequence(int max) {
        if (max == 1) {
            print(String.valueOf(1));
        } else {
            print(String.valueOf(1));
            print(String.valueOf(2));

            int n = 0;
            for (int i = 0; i < max; i++) {
                n++;
                print(String.valueOf(2 * n + 1));
            }
        }
        return "";
    }
    public static void print(String text) {
        System.out.println(text);
    }
}
