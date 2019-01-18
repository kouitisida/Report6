package jp.ac.uryukyu.ie.e185705;
import java.util.Random;

public class Enemy {
    int face;
    public Enemy() {
        Random rand = new Random();
        face = rand.nextInt(4);
    }
}