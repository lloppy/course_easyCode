package lesson_18_19_20;

public class Lesson {

    final int countLesson;
    final boolean isEnding;

    public Lesson(int countLesson, boolean isEnding) {
        this.countLesson = countLesson;
        this.isEnding = isEnding;

        System.out.println(this.countLesson + " lesson is end? " + isEnding);
    }
}
