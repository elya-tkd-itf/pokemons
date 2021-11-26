package com.company.moves.special;

import ru.ifmo.se.pokemon.*;

public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf() {
        super(Type.GRASS, 60, Double.MAX_VALUE);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.addEffect(new Effect().stat(Stat.EVASION, 0).stat(Stat.ACCURACY, 1));
    }

    @Override
    protected String describe() {
        return "наносит урон и игнорирует изменения характеристик точности и уклонения";
    }
}
