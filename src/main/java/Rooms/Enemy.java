package Rooms;

import Players.Player;

public class Enemy {
    String name;
    int healthPoints;
    String type;
    int attackValue;
    int defendValue;
    boolean alive;


    public Enemy(String name, int healthValue, String type, int attackValue, int defendValue) {
        this.name = name;
        this.healthPoints = healthValue;
        this.type = type;
        this.attackValue = attackValue;
        this.defendValue = defendValue;
        this.alive = true;
    }

    public void attack(Player player){
        if (player.isAlive() == true){
        player.takeDamage(this.getAttackValue() - player.getDefendValue());
            if (player.getHealthPoints() <= 0) {
                player.setAlive(false);
            }}

    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getType() {
        return type;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getDefendValue() {
        return defendValue;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }
}
