package lesson_13_14_15;

import java.util.Arrays;

public class Double {
    public static void main(String[] args) {
        int[] arrayStart = new int[]{1,9,9,9,9,2,3,4,2,2,2,1,1,1};
        int[] array = new int[arrayStart.length];
        Arrays.sort(arrayStart);

        int c = 1;
        array[0]+=arrayStart[0];
        for (int i = 0 ; i < arrayStart.length - 1; i++){
            if(arrayStart[i]!=arrayStart[i+1]){
                array[c]+=arrayStart[i+1];
                c++;
            }
        }

        for (int i = 0 ; i < arrayStart.length; i++){
            if (array[i]!=0){
                print(String.valueOf(array[i]));
            }
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
