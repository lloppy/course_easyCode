package lesson_18_19_20;

public class MemoryId {
    final int id;
    final String info;

    public MemoryId(int id, String info) {
        this.id = id;
        this.info = info;

        System.out.println("Your id: " + this.id + ". Your secret info is: " + info);
    }
}
