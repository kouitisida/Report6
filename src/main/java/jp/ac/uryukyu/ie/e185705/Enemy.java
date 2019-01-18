package jp.ac.uryukyu.ie.e185705;
import java.util.Random;
import jp.ac.uryukyu.ie.e185705.Japanese;
public class Enemy {
    int face;
    public Enemy() {
        Random rand = new Random();
        face = rand.nextInt(4);
        new Japanese(face);
        System.out.println("相手の顔の向き：" + Japanese.japan);
    }
}