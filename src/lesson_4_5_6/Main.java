package lesson_4_5_6;

public class Main {
    private static final String name = "Kate";


    public static void main(String[] args) {
        String[] food = new String[] {"banana", "melon", "watermelon", "chips"};
        print(eat(name, food[2]));
        print(happy(true));

        print(eat(name, food[3]));
        print(happy(false));
    }

    public static String eat(String name, String food){
        return name + " ate " + food + "\n";
    }

    public static void print(String text){
        System.out.print(text);
    }

    public static String happy (boolean isHappy){
        String is  = name + " is happy";
        String isnt  = name + " isn't happy";

        String result = isHappy ? "Now " + is : isnt;
        return result + "\n" + "\n";
    }
}
