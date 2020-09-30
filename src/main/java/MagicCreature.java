public enum MagicCreature {

    OGRE("Ogre", 60),
    DRAGON("Dragon", 100);

    private String name;
    private int health;

    MagicCreature(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void removeHealth(int amount) {
        this.health -= amount;
    }
}
