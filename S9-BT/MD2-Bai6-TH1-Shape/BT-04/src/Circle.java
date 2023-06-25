public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.14;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * PI;
    }

    @Override
    String display() {
        return getColor();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " Có diện tích: " + getArea() +
                '}';
    }
}
