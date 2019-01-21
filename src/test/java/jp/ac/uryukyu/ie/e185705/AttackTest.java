package jp.ac.uryukyu.ie.e185705;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttackTest {

    @Test
    void number_face(){
        Attack attack = new Attack();
        String[] sample = {"up","under","right","left","hoge","aho"};
        for(String samples :sample){
            attack.number_face(samples);
        }
    }
}