public enum HealingTool {
    POTION("potion", 50),
    LOTION("lotion", 20),
    HERBS("herbs", 10);

    private final String name;
    private final int value;

    HealingTool(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
