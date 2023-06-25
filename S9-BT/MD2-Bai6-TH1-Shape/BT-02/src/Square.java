public class Square  implements Colorable{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
public void calulataArea(){
        double area = sideLength * sideLength;
    System.out.println("Square area " + area);
}
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
