package jp.ac.uryukyu.ie.e185705;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("あっち向いてホイをしよう！");
        System.out.println("せーのっ！　あっち向いてー");
        Attack attack = new Attack();
        Enemy enemy = new Enemy();
        System.out.println(enemy.face);
        Judge judge = new Judge(attack.finger_num,enemy.face);
    }
}
