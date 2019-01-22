package jp.ac.uryukyu.ie.e185705;

/**
 * どちらが勝ったのか判定するメソッド。
 *
 */
public class Judge {
    /**
     * fingerとfaceの数字が等しいかを検証してプレイヤーが勝ったのかコンピュータが勝ったのかを判定するメソッド。
     * @param finger プレイヤーが指定した指の向きを表す数字。
     * @param face　　コンピュータの顔の向きを示す数字。
     */
    public Judge(int finger, int face){
        if(finger == face){
            System.out.println("おめでとう！！。君の勝ちだよ！");
        }
        else{
            System.out.println("残念でしたー( ^ω^ )");
        }
    }
}