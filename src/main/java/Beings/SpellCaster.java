package Beings;

import Beings.Character;
import Enums.MagicCreature;
import Enums.Spell;

public abstract class SpellCaster extends Character implements IAttack {

    private Spell spell;
    private MagicCreature creature;

    public SpellCaster(int health, String name, Spell spell, MagicCreature creature){
        super(health, name);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return spell;
    }

    public MagicCreature getCreature() {
        return creature;
    }

    public void changeSpell(Spell spell){
        this.spell = spell;
    }

    public void changeCreature(MagicCreature creature){
        this.creature = creature;
    }

    public void attack(Character enemy){
        enemy.reduceHealth(spell.getDamage());
    }

}
