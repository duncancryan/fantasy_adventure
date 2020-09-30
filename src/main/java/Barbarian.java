
public class Barbarian extends Warrior {
    public Barbarian(int health, String name, Weapon weapon) {
        super(100, name, weapon);
    }

    public void addHealth(int amount){
        super.addHealth(amount * 2);
    }
}
