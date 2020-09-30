public class Dwarf extends Warrior {

    public Dwarf(int health, String name, Weapon weapon) {
        super(health, name, weapon);
    }

    public void attack(Character target){
        int baseDamage = this.getWeapon().getDamage();
        int damage = baseDamage * 2;
        target.reduceHealth(damage);
    }
}
