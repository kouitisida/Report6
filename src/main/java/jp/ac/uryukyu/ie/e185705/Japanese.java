package jp.ac.uryukyu.ie.e185705;

public class Japanese {
    static String japan;
    public Japanese(int num){
        switch(num){
            case 0:
                japan = "上";
                break;
            case 1:
                japan = "下";
                break;
            case 2:
                japan = "右";
                break;
            case 3:
                japan = "左";
                break;
        }
    }
}

