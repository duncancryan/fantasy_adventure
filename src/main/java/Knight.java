public class Knight extends Warrior{

    public Knight(int health, String name, Weapon weapon) {
        super(health, name, weapon);
    }

    @Override
    public void reduceHealth(int amount) {
        super.reduceHealth(amount / 2);
    }


}
