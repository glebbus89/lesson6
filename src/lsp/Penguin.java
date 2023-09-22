package lsp;

public class Penguin extends Bird {

    public Penguin(){
        canFly = false;
        flySpeed = 0;

    }

    @Override
    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать.");
//        System.out.println("Пингвин не умеет летать");

    }

}
