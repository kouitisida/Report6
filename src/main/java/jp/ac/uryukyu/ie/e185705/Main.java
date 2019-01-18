package jp.ac.uryukyu.ie.e185705;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("あっち向いてホイをしよう！");
        System.out.println("せーのっ！　あっち向いてー ホイ！！！");
        Attack attack = new Attack();
        Japanese japanese = new Japanese(attack.finger_num);
        System.out.println("あなたの指の向き：" + japanese.japan);
        Enemy enemy = new Enemy();
        Judge judge = new Judge(attack.finger_num,enemy.face);
    }
}
