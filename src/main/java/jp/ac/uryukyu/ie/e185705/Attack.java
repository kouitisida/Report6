package jp.ac.uryukyu.ie.e185705;
import java.util.Scanner;
public class Attack {
    String finger;
    int num;
    String finger_emoticons;
    static boolean decision;
    public Attack() {

    }
    public void scaning(){
        System.out.println("キーボードで指定の英語を入力してください。上：up,下：under,右：right,左：left");
        Scanner scan = new Scanner(System.in);
        finger = scan.next();
    }
    public void number_face(String finger){
        switch(finger){
            case "up":
                num = 0;
                decision = true;
                break;
            case "under":
                num = 1;
                decision = true;
                break;
            case "right":
                num = 2;
                decision = true;
                break;
            case "left":
                num = 3;
                decision = true;
                break;
            default:
                System.out.println("すみません入力を確認できませんでした。入力が正しくない可能性があります再度入力をお願いします。入力された文字:"
                        + finger);
        }
    }
    public String emoticon(int num){
        switch(num){
            case 0:
                finger_emoticons = "☝️";
                break;
            case 1:
                finger_emoticons = "👇";
                break;
            case 2:
                finger_emoticons = "👉";
                break;
            case 3:
                finger_emoticons = "👈";
                break;

        }
        return finger_emoticons;
    }
}
