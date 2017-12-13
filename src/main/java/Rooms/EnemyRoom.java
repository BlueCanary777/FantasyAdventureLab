package Rooms;

import Players.Player;

import java.util.ArrayList;

public class EnemyRoom extends Room {

    Enemy enemy;
    public EnemyRoom(String name, Enemy enemy) {
        super(name);
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public boolean roomComplete(){
        return !enemy.isAlive();
    }

    public void removePlayers(){
        if(roomComplete()){
        this.players.clear();}
    }

    public void goToNewRoom(Room room){
        ArrayList<Player> newarray = new ArrayList<>(this.players);
        room.setPlayers(newarray);
        this.removePlayers();
    }
        //clear players from current room
    //add same players to players arraylist of a second room

}
