package Rooms;

import Beings.Enemy;

public class Dungeon {
    private Enemy enemy;
    public Dungeon(Enemy enemy){
        this.enemy = enemy;
    }
    public Enemy getEnemy() {
        return enemy;
    }
    public boolean isComplete(){
        if (enemy.checkIfDead()){
            return true;
        }
        return false;
    }
}
