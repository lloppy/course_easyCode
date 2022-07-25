package lesson_18_19_20;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public boolean isSquare() {
        return this.sideA == this.sideB && this.sideC == this.sideD &&
                this.sideB == this.sideC;
    }
}
