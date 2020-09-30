public abstract class Warrior extends Character implements IAttack{

    private Weapon weapon;
    public Warrior(int health, String name, Weapon weapon) {
        super(health, name);
        this.weapon = weapon;
    }

    public void attack(Character target) {
        int damage = this.weapon.getDamage();
        target.reduceHealth(damage);
    }
}
