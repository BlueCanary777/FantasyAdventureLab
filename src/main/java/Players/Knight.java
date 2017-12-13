package Players;

import Rooms.Enemy;

public class Knight extends Player implements IWeapon {

    String weapon;
    Boolean hasArmour;

    public Knight(String name, int attackValue, int defendValue) {
        super(name, attackValue, defendValue);
        this.weapon = "sword";
        this.hasArmour =false;
    }

    public void attack(Enemy enemy) {
        if (enemy.isAlive() == true) {
            enemy.takeDamage(this.getAttackValue() - enemy.getDefendValue());
            if (enemy.getHealthPoints() <= 0) {
                enemy.setAlive(false);
            }
        }
    }

    public void setHasArmour(Boolean hasArmour) {
        this.hasArmour = hasArmour;
    }

    public void addArmour() {
        this.setHasArmour(true);
    }

    public Boolean getHasArmour() {
        return hasArmour;
    }

    public void takeDamage(int damage) {
        if (this.getHasArmour() == true) {
            this.healthPoints -= damage * 0.5;
        }
        else this.healthPoints -= damage;
    }

}
