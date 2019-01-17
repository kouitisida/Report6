package jp.ac.uryukyu.ie.e185705;
import java.util.Scanner;
public class Attack {
    private String direction = "なし";
    private int finger;
    public Attack(){
        System.out.println("キーボードで0~3のどれかを選択してください。0:上　1:右　2:下　3:左");
        Scanner scan = new Scanner(System.in);
        finger = scan.nextInt();
        switch(finger){
            case 0:
                direction = "上";
                break;
            case 1:
                direction = "右";
                break;
            case 2:
                direction = "下";
                break;
            case 3:
                direction = "左";
                break;
        }
        System.out.println("ホイ！ あなたの指している方向は" + direction + "ですね。");


    }
}


