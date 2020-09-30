package Beings;

public abstract class Enemy extends Character implements IAttack {

    private int attackPower;

    public Enemy(int health, String name, int attackPower) {
        super(health, name);
        this.attackPower = attackPower;
    }

    public void attack(Character target){
        target.reduceHealth(this.attackPower);
    }

}
