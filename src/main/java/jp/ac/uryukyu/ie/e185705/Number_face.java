package jp.ac.uryukyu.ie.e185705;

public class Number_face {
    int num;
    public Number_face(String direction){

        switch(direction){
            case "up":
                num = 0;
                break;
            case "under":
                num = 1;
                break;
            case "right":
                num = 2;
                break;
            case "left":
                num = 3;
                break;
            default:

        }
    }
}
