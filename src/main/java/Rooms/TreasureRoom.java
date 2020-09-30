package Rooms;


import Enums.Treasure;

public class TreasureRoom {

    private Treasure treasure;

    public TreasureRoom(Treasure treasure) {
        super();
        this.treasure = treasure;
    }

    public void removeTreasure() {
        this.treasure = null;
    }
}
