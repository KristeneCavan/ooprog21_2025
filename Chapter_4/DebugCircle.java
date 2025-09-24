public class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;

    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
