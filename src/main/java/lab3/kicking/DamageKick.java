package lab3.kicking;

import lab3.Hero;

import java.util.Random;

abstract class DamageKick implements Kick
{
    public String kick(Hero hero, Hero enemy){
        Random random = new Random();
        int damage = random.nextInt(hero.getPower());
        enemy.setHp(enemy.getHp()-damage); ;
        return "Hero " + hero.getName() + " just kicked hero "+enemy.getName() +" for "+damage+" damage.";
    };
}
