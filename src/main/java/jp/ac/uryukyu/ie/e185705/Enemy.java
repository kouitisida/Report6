package jp.ac.uryukyu.ie.e185705;
import java.util.Random;

public class Enemy {
    private String direction_face = "なし";
    private int face;
    public Enemy(){
        Random rand = new Random();
        face = rand.nextInt(4);
        switch(face){
            case 0:
                direction_face = "上";
                break;
            case 1:
                direction_face = "右";
                break;
            case 2:
                direction_face = "下";
                break;
            case 3:
                direction_face = "左";
                break;
        }
        System.out.println("敵の顔の向きは" + direction_face + "です。");
    }
}

