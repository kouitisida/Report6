package jp.ac.uryukyu.ie.e185705;

public class Japanese {
    static String japan_face;
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