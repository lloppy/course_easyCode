package lesson_21_22;

public abstract class Animal {
    protected final String nickname;
    protected final String type;

    protected Animal(String nickname) {
        this.nickname = nickname;
        this.type = this.getClass().getSimpleName();
    }

    protected String description() {
        return "Hello! I am a " + type + ". My name is " + nickname + ". My move is " + move();
    }

    protected abstract String move();

}
