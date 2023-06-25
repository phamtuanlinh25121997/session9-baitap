public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    @Override
    double getArea() {
        return width * height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    String display() {
        return "Có màu là " + getColor();

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Color: " + getColor() +
                " width=" + width +
                ", height=" + height +
                "Diện tích là: " + getArea()
                + '}';
    }

}
