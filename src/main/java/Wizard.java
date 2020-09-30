public class Wizard extends SpellCaster {

    public Wizard(int health, String name, Spell spell, MagicCreature creature){
        MagicCreature creature = new MagicCreature();
        super(health, name, Spell.LIGHTNING, creature);
        this.creature = creature;
    }

}
