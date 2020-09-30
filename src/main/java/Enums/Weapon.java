package Enums;

public enum Weapon {
    SWORD("sword", 15),
    AXE("axe", 20),
    CLUB("club", 10);

    private final String name;
    private final int damage;

    Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
