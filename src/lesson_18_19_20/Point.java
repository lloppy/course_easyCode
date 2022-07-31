package lesson_18_19_20;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDistance(Point otherPoint) {
        return (int) Math.sqrt((x - otherPoint.x) * (x - otherPoint.x) + (y - otherPoint.y) * (y - otherPoint.y));
    }
}
