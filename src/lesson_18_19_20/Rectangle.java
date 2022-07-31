package lesson_18_19_20;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;
    public Rectangle(Point a, Point b, Point c, Point d){
        this(a.getDistance(b), b.getDistance(c), c.getDistance(d), d.getDistance(a) );
    }

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }
    private boolean isSquare() {
        return this.sideA == this.sideB && this.sideC == this.sideD &&
                this.sideB == this.sideC;
    }


    public static void createRec(int pointA, int pointB, int pointC, int pointD){
        

    }

    public String getDecscription() {
        return isSquare()?
                "Square":
                "Rectangle";


    }
}
