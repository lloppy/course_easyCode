package lesson_21_22;

public class Dog extends Animal {
    public Dog(String nickname) {
        super(nickname);
    }

    @Override
    protected String move() {
        return "run, swim and walk";
    }
}
