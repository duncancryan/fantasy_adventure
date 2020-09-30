package Beings;

import Enums.HealingTool;

public class Healer extends Character {

    private HealingTool healingTool;

    public Healer(int health, String name, HealingTool healingTool) {
        super(80, name);
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public void heal(Character target){
        int healValue = this.healingTool.getValue();
        target.addHealth(healValue);
    }
}
