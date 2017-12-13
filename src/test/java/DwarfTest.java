import Players.Dwarf;
import Rooms.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Enemy enemy;


    @Before
    public void before(){
        dwarf = new Dwarf("Sam", 20, 5);

        enemy = new Enemy("Grimble", 50, "Troll", 10, 2);
    }


    @Test
    public void hasFullHealth(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void rucksackEmpty(){
        assertEquals(0, dwarf.getRucksack().size());
    }

    @Test
    public void getName(){
        assertEquals("Sam", dwarf.getName());
    }

    @Test
    public void canTakeDamage(){
        dwarf.takeDamage(10);
        assertEquals(90, dwarf.getHealthPoints());
    }

    @Test
    public void canIncreaseHealth(){
        dwarf.increaseHealth(50);
        assertEquals(150, dwarf.getHealthPoints());
    }

    @Test
    public void playerCanAttack(){
        dwarf.attack(enemy);
        assertEquals(32, enemy.getHealthPoints());
    }

    @Test
    public void trollCanAttack() {
        enemy.attack(dwarf);
        assertEquals(95, dwarf.getHealthPoints());
    }


}
