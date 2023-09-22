package lsp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Bird bird1 = new Bird();// oT
        Bird bird2 = new Bird();// oT
        Bird bird3 = new Bird();// oT

        Duck duck1 = new Duck();// oS
        Duck duck2 = new Duck();// oS

        Penguin penguin1 = new Penguin();// oS

        List<Bird> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        birds.add(duck1);
        birds.add(duck2);
        birds.add(penguin1);

        processFly(birds);


    }

    /**
     * P
     * @param birds
     */

    public static void processFly(List<Bird> birds){
        for (Bird bird: birds) {
            if (bird.isCanFly())
            bird.fly();
        }
    }



}
