package srp1;

public class SquareDrawer {

    //region Public Methods

    public void draw() {

        for (int i = 0; i < squareV2.getSide() * 2 * scale; i++){
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 0; i < squareV2.getSide() * scale; i++){
            System.out.print("*");
            for (int j = 1; j < squareV2.getSide() * scale; j++){
                System.out.print("  ");
            }
            System.out.println(" *");
        }

        for (int i = 0; i <  squareV2.getSide()* 2 * scale; i++){
            System.out.println("* ");
        }
        System.out.println();
    }
    //endregion
    //region Constructors
    public SquareDrawer(SquareV2 squareV2) {
        this.squareV2 = squareV2;
    }

    public SquareDrawer(SquareV2 squareV2, int scale) {
        this.squareV2 = squareV2;
        this.scale = scale;
    }
    //endregion

    //region Public Getters and Setters (Properties)
    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }
    //endregion

    //region Private Fields


    private final SquareV2 squareV2;

    private int scale = 1;

    //endregion
}


