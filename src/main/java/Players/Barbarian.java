package Players;

import Rooms.Enemy;

public class Barbarian extends Player implements IWeapon {

    String weapon;

    public Barbarian(String name, int attackValue, int defendValue) {
        super(name, attackValue, defendValue);
        this.weapon = "Club";
    }

    public void attack(Enemy enemy) {
        if (enemy.isAlive() == true) {
            enemy.takeDamage(this.getAttackValue() - enemy.getDefendValue());
            if (enemy.getHealthPoints() <= 0) {
                enemy.setAlive(false);
            }
        }
    }
}
