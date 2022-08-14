package lesson_21_22;

public class Fish extends Animal {
    public Fish(String nickname) {
        super(nickname);
    }

    @Override
    protected String move() {
        return "swim";
    }
}
