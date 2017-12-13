package Players;
import Rooms.Treasure;
import java.util.ArrayList;

public class Player {
    private String name;
    protected int healthPoints;
    private ArrayList<Treasure> rucksack;
    private int attackValue;
    private int defendValue;
    private boolean alive;

    public Player(String name, int attackValue, int defendValue) {
        this.name = name;
        this.healthPoints = 100;
        this.rucksack = new ArrayList<>();
        this.attackValue = attackValue;
        this.defendValue = defendValue;
        this.alive = true;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public void increaseHealth(int health){
        this.healthPoints += health;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Treasure> getRucksack() {
        return rucksack;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getDefendValue() {
        return defendValue;
    }
}
