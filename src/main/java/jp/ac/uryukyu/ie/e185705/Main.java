package jp.ac.uryukyu.ie.e185705;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("あっち向いてホイをしよう！");
        System.out.println("せーのっ！　あっち向いてー");
        Attack attack = new Attack();
        Enemy enemy = new Enemy();
        Number_face n_f = new Number_face(attack.finger);
        System.out.println(n_f.num);
        System.out.println(enemy.face);
        Judge judge = new Judge(n_f.num, enemy.face);


    }
}
