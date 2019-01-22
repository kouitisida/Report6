package jp.ac.uryukyu.ie.e185705;
public class Main {
    public static void main(String[] args){
        System.out.println("あっち向いてホイをしよう！");
        System.out.println("せーのっ！　あっち向いてー ホイ！！！");
        Attack attack = new Attack();
        while(!Attack.decision){
            attack.scaning();
            attack.number_face(attack.finger);
        }

        Japanese japanese = new Japanese(attack.num);
        System.out.println("あなたの指の向き：" + japanese.japan_face + attack.emoticon(attack.num));
        Enemy enemy = new Enemy();
        enemy.emoticons(enemy.face);
        System.out.println(enemy.face_figure);
        new Judge(attack.num,enemy.face);
    }
}