package lab3;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Hero {

    String name;
    String heroClass;
    int power;
    int hp;

    String kick(Hero this, Hero enemy){

return null;
        }


    boolean isAlive(){
        if (hp>0) return true;
        else return false;
    }

}
