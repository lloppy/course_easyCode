 package lesson_13_14_15;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = new int[] {1,2,3,4,5,6,7,8,9};
        int[] arrayTwo = new int[] {2,4,6,8,10,12,14,16,18};
        int[] array = new int[arrayTwo.length];

        for (int i = 0 ; i < arrayTwo.length; i++){
            array[i] += arrayOne[i]*arrayTwo[i];
        }

        for (int j : array) {
            print(String.valueOf(j));
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
