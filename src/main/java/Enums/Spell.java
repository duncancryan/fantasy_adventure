package Enums;

public enum Spell {

    LIGHTNING("Lightningbolt", 30),
    FIREBALL("Fireball", 25),
    ICEBLAST("Iceblast", 20);

    private String spellName;
    private int damage;

    private Spell(String spellName, int damage){
        this.spellName = spellName;
        this.damage = damage;
    }

    public String getSpellName(){
        return this.spellName;
    }

    public int getDamage(){
        return this.damage;
    }

}
