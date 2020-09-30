package Beings;

import Enums.MagicCreature;
import Enums.Spell;

public class Wizard extends SpellCaster {

    public Wizard(String name){
        super(40, name, Spell.LIGHTNING, MagicCreature.DRAGON);
    }

}
