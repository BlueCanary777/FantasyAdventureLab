package Rooms;

import Players.Player;

import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<Player> players;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(Player player){
        this.players.remove(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int numberOfPlayersPresent(){
        return this.players.size();
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
