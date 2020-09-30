package Enums;

public enum Treasure {

    EMERALDS("Emeralds"),
    GOLD("Gold"),
    KINDEREGGSURPRISE("Kinder-Egg-Surprise");

    private String name;

    Treasure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
