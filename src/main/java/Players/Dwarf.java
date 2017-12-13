package Players;

import Rooms.Enemy;

public class Dwarf extends Player implements IWeapon {

    String weapon;

    public Dwarf(String name, int attackValue, int defendValue) {
        super(name, attackValue, defendValue);
        this.weapon = "Axe";
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
