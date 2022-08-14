package lesson_21_22;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Rex"),
                new Duck("Donald"),
                new Fish("Nemo")
        };

        for (Animal animal : animals) {
            print(animal.description());
        }
    }

    public static final void print(String text) {
        System.out.println(text);
    }
}
