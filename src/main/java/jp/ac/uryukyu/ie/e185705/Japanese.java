package jp.ac.uryukyu.ie.e185705;

/**
 * 数字をそれぞれ適当な日本語に直すクラス。
 */
public class Japanese {
    static String japan_face;

    /**
     * コンストラクタ。取得した数字から日本語を取得するメソッド。
     * @param num　変換する数字。
     * japan_face: //数字から適切な日本語に変換された文字列。
     */
    public Japanese(int num) {
        switch (num) {
            case 0:
                japan_face = "上";
                break;
            case 1:
                japan_face = "下";
                break;
            case 2:
                japan_face = "右";
                break;
            case 3:
                japan_face = "左";
                break;
        }
    }
}