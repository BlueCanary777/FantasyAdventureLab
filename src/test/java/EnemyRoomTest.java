import Players.Dwarf;
import Rooms.Enemy;
import Rooms.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    EnemyRoom enemyRoom2;
    Enemy enemy;
    Enemy enemy2;
    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Sleepy", 20, 5);
        enemy = new Enemy("Zadok", 50, "Orc", 45, 10);
        enemy2 = new Enemy("SwampKilla", 75, "Troll", 20, 2);
        enemyRoom = new EnemyRoom("Dungeon 1", enemy);
        enemyRoom2 = new EnemyRoom("Barn of Doom", enemy2);
    }

    @Test
    public void canAddPlayer(){
        enemyRoom.addPlayer(dwarf);
        enemyRoom.addPlayer(dwarf);
        assertEquals(2, enemyRoom.numberOfPlayersPresent());
    }

    @Test
    public void isEnemyPresent(){
        assertEquals("Orc", enemyRoom.getEnemy().getType());
    }

    @Test
    public void canCheckIfAlive(){
        enemyRoom.addPlayer(dwarf);
        dwarf.attack(enemy);
        assertEquals(true, enemy.isAlive());
    }

    @Test
    public void canCheckIfDead(){
        enemyRoom.addPlayer(dwarf);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        assertEquals(false, enemy.isAlive());
    }

    @Test
    public void canRoomComplete(){
        enemyRoom.addPlayer(dwarf);
        assertEquals(false, enemyRoom.roomComplete());
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        assertEquals(false, enemy.isAlive());
        assertEquals(true, enemyRoom.roomComplete());
    }

    @Test
    public void playersCantLeave(){
        enemyRoom.addPlayer(dwarf);
        enemyRoom.addPlayer(dwarf);
        enemyRoom.removePlayers();
        assertEquals(2, enemyRoom.numberOfPlayersPresent());
    }

    @Test
    public void playersCanLeave(){
        enemyRoom.addPlayer(dwarf);
        enemyRoom.addPlayer(dwarf);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        enemyRoom.removePlayers();
        assertEquals(0, enemyRoom.numberOfPlayersPresent());
    }

    @Test
    public void playersCanExitRoom(){
        enemyRoom.addPlayer(dwarf);
        enemyRoom.addPlayer(dwarf);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        enemyRoom.goToNewRoom(enemyRoom2);
        assertEquals(0, enemyRoom.numberOfPlayersPresent());
        assertEquals(2, enemyRoom2.numberOfPlayersPresent());
    }

}
