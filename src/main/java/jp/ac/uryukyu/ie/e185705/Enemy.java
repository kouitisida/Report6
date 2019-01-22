package jp.ac.uryukyu.ie.e185705;
import java.util.Random;

/**
 * プレイヤーと対戦をするコンピュータのクラス。
 */
public class Enemy {
    int face;
    String face_figure;

    /**
     * コンストラクタ。コンピュータの顔の向きを数字で取得して適当な日本語に変換する。
     * face: //0~3の範囲でランダムで取得した数字
     * japanese.japan_face: //ランダムで取得した数字を適当な日本語に変換したもの。
     */
    public Enemy() {
        Random rand = new Random();
        face = rand.nextInt(4);
        Japanese japanese = new Japanese(face);
        System.out.print("相手の顔の向き：" + japanese.japan_face);
    }

    /**
     * コンピュータの顔の向きに対応した顔文字を取得するメソッド。
     * @param face ランダムで取得した数字を適当な顔の向きに変換したもの。日本語表示。
     * @return コンピュータの向いている顔の向きの顔文字
     */

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