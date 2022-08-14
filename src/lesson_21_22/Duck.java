package lesson_21_22;

public class Duck extends Animal {
    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    protected String move() {
        return "swim and walk";
    }
}
