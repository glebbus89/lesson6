package lsp;

/**
 * T
 */


public class Bird {

    protected boolean canFly = true;
    protected int flySpeed = 10;

    public boolean isCanFly() {
        return canFly;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void fly(){
        System.out.printf("Птица летит со скоростью %d\n", flySpeed);
    }
}
