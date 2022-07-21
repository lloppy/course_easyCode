package lesson_13_14_15;

public class Reverse {
    public static void main(String[] args) {
        reverseNum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    public static void reverseNum(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
            if (i == 0) {
                System.out.println("End of array!");
            }
        }
    }
}
