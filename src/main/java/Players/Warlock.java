package Players;

import Rooms.Enemy;

public class Warlock extends Player implements ISpell{

    private String weapon;
    public Warlock(String name, int attackValue, int defendValue) {
        super(name, attackValue, defendValue);

        this.weapon = "Magic Stones";
    }

    public void castSpell(Enemy enemy) {
        if (enemy.isAlive() == true) {
            enemy.takeDamage(this.getAttackValue() - enemy.getDefendValue());
            if (enemy.getHealthPoints() <= 0) {
                enemy.setAlive(false);
            }
        }
    }



}
