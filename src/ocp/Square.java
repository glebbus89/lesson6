package ocp;

public class Square implements Shape  {

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    private final int side;

}
