import Players.Knight;
import Rooms.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemy enemy;

    @Before
    public void before(){
        knight = new Knight("Sir Galahad", 40, 5);
        enemy = new Enemy("Big Troll", 80, "troll", 15, 1);
    }

    @Test
    public void knightCanAttack(){
        knight.attack(enemy);
        assertEquals(41, enemy.getHealthPoints());
    }

    @Test
    public void knightStartsWithNoArmour() {

        assertEquals(false, knight.getHasArmour());
    }

    @Test
    public void knightCanAddArmour() {
        knight.addArmour();
        assertEquals(true, knight.getHasArmour());
    }

    @Test
    public void canArmourReduceDamage() {
        knight.addArmour();
        enemy.attack(knight);
        assertEquals(95, knight.getHealthPoints());
    }

}
