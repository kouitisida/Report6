package jp.ac.uryukyu.ie.e185705;

public class Number_face {
    static int num;
    static boolean decision = false;
    public Number_face(String direction){
        switch(direction){
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
                                    + direction);
        }
    }
}