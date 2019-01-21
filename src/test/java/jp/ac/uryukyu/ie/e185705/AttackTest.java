package jp.ac.uryukyu.ie.e185705;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttackTest {

    @Test
    void number_face(){

        Attack attack = new Attack();
        String[] sample = {"up","under","right","left","hoge","aho"};
        for(int i = 0; i < 4;i++ ){
            attack.number_face(sample[i]);
            System.out.println(attack.num);
            assertEquals(i,attack.num);
        }
        for(int i = 4; i < 6; i++){
            attack.number_face(sample[i]);
        }

    }
}