package jp.ac.uryukyu.ie.e185705;
import java.util.Random;
public class Enemy {
    int face;
    String face_figure;
    public Enemy() {
        Random rand = new Random();
        face = rand.nextInt(4);
        Japanese japanese = new Japanese(face);
        System.out.print("相手の顔の向き：" + japanese.japan_face);
    }
    public String emoticons(int face){
        switch(face){
            case 0:
                face_figure = "(￣д￣)";
                break;
            case 1:
                face_figure = "(._.)";
                break;
            case 2:
                face_figure = "( →_→)";
                break;
            case 3:
                face_figure = "(←_←　)";

        }
        return face_figure;
    }
}