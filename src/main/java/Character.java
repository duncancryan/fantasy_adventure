import Enums.Treasure;

import java.util.ArrayList;

public abstract class Character {

    private int health;
    private String name;
    private ArrayList<Treasure> treasure;

    public Character (int health, String name){
        this.health = health;
        this.name = name;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasure;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int amount) {
        this.health -= amount;
    }

    public void addHealth(int amount) {
        this.health += amount;
    }

}
