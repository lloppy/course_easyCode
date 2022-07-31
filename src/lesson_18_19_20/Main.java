package lesson_18_19_20;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Polina", "Ankudinova");
        Person person2 = new Person("Porina", "Shramko");

        MemoryId memoryId = new MemoryId(777, "My name is Bond, James Bond");

        Lesson lesson = new Lesson(5, true);
        Lesson lesson2 = new Lesson(1, false);

        Rectangle rectangle = new Rectangle(3, 3, 1, 3);
        Rectangle rectangle2 = new Rectangle(13, 1, 13, 2);
        System.out.println(rectangle.getDecscription());
        System.out.println(rectangle2.getDecscription());

        Rectangle square = new Rectangle(
                new Point(0, 2),
                new Point(0, 4),
                new Point(2, 4),
                new Point(2, 2)
        );
        System.out.println(square.getDecscription());


    }
}
