package Beings;

import Enums.MagicCreature;
import Enums.Spell;

public class Warlock extends SpellCaster {

    public Warlock(String name){
        super(50, name, Spell.FIREBALL, MagicCreature.OGRE);
    }

}
