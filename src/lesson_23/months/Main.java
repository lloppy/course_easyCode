package lesson_23.months;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

       print(factory.create("January"));
       print(factory.create("April"));
       print(factory.create("Lirpa"));
    }

    public static final void print(int text) {
        System.out.println(text);
    }
}
