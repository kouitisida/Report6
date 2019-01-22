package jp.ac.uryukyu.ie.e185705;
import java.util.Scanner;
/**
 * プレイヤーの攻撃クラス
 *
 */
public class Attack {
    String finger;
    int num;
    String finger_emoticons;
    static boolean decision;
    public Attack() {
    }

    /**
     * キーボード入力をするためのメソッド
     * finger: //入力された文字列
     */
    public void scaning(){
        System.out.println("キーボードで指定の英語を入力してください。上：up,下：under,右：right,左：left");
        Scanner scan = new Scanner(System.in);
        finger = scan.next();
    }

    /**
     * 入力された文字列を適切な数字に変換するメソッド。想定していない文字列の場合もう一度入力してもらう。
     *
     * @param finger キーボード入力された文字列
     * num: //文字列に対する適当な数字
     * decision: //キーボード入力が適切かどうかを判定する。
     *               適切な時trueを適切ではない時にfalseを返す
     */
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

    /**
     * プレイヤーがわかりやすいように自分の指定した指の向きの絵を表示できるようにするメソッド。
     * @param num　キーボード入力された文字列に対応する数字
     * @return プレイヤーが指定した指の向きの絵。
     */
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
