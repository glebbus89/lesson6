package ocp;

public class SquareV2 implements ShapeV2 {
    public SquareV2(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    private final int side;

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
}
