public class Square extends Rectangle implements  Resizeable{
private  double side;

    public Square(double side) {
        super(side, side);

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }


}
