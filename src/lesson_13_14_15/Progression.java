package lesson_13_14_15;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int c = 10 -2;
        int curr = scanner.nextInt();
        int next = scanner.nextInt();
        int diff = next - curr;
        curr = next;

        while (c > 0){
            next = scanner.nextInt();
            if (next -curr != diff){
                System.out.println("break");
                break;
            }
            curr = next;
            c--;
        }
    }
}
