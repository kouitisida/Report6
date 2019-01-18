package jp.ac.uryukyu.ie.e185705;
import java.util.Scanner;
import jp.ac.uryukyu.ie.e185705.Number_face;
public class Attack {
    String finger;
    int finger_num;
    public Attack() {
        while(!Number_face.decision){
            System.out.println("キーボードで指定の英語を入力してください。上：up,下：under,右：right,左：left");
            Scanner scan = new Scanner(System.in);
            finger = scan.next();
            new Number_face(finger);
            System.out.println(Number_face.num);
            finger_num = Number_face.num;

        }

    }
}