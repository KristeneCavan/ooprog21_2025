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

    public static void main(String[] args) {
        DebugCircle circle = new DebugCircle(5); // create a DebugCircle with radius 5

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
    }
}
