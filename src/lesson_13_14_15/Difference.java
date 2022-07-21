package lesson_13_14_15;

import java.lang.reflect.Array;

public class Difference {
    public static void main(String[] args) {
        int[] numbers = new int[]{15, 27, 35675, 235145, 473573, 354, 235, 264, 6, 5, 4, 2, 767, 35};
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < minVal) {
                minVal = number;
            }
            if (number > maxVal) {
                maxVal = number;
            }
        }

        System.out.println(maxVal - minVal);
    }
}

