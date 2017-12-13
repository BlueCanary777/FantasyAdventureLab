package Players;

import Rooms.Enemy;

public class Wizard extends Player implements ISpell{

    private String weapon;
    public Wizard(String name, int attackValue, int defendValue) {
        super(name, attackValue, defendValue);

        this.weapon = "Wand";
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
