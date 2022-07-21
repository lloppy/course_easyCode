package lesson_10_11_12;

public class Main {

    public static void main(String[] args) {
        print(drink(true, true));
        print(drink(true, false));
        print(drink(false, true));
        print(drink(false, false));

    }

    public static String drink(boolean isTodayFriday, boolean aLotOfMoney) {
        if (isTodayFriday && aLotOfMoney) {
            print("Lets go drink beer!");
        } else {
            if (isTodayFriday) {
                print("Need to ask for a loan");
            } else {
                print("Buckwheat is our everything(");
            }
        }
        return "";
    }

    public static void print(String text) {
        System.out.println(text);
    }
}