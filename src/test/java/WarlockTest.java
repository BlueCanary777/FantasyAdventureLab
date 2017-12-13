import Players.Warlock;
import Rooms.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Enemy enemy;

    @Before
    public void before() {
        warlock = new Warlock("Xenovarge", 10, 2);
        enemy = new Enemy("Big Troll", 80, "troll", 15, 1);

    }

    @Test
    public void canCastSpell() {
        warlock.castSpell(enemy);
        assertEquals(71, enemy.getHealthPoints());
    }


}
