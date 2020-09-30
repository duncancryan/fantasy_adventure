package Beings;

import Enums.Weapon;

public class Knight extends Warrior{

    public Knight(int health, String name, Weapon weapon) {
        super(150, name, weapon);
    }

    @Override
    public void reduceHealth(int amount) {
        super.reduceHealth(amount / 2);
    }


}
