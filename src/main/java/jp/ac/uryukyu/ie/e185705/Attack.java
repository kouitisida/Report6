package jp.ac.uryukyu.ie.e185705;
import java.util.Scanner;
public class Attack {
    String finger;
    public Attack() {
        System.out.println("キーボードで指定の英語を入力してください。上：up,下：under,右：right,左：left");
        Scanner scan = new Scanner(System.in);
        finger = scan.next();
    }
}


