package com.company.moves.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BodySlam extends PhysicalMove {
    public BodySlam() {
        super(Type.NORMAL, 85, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.3) Effect.paralyze(opp);
    }

    @Override
    protected String describe() {
        return "наносит урон и имеет 30% шанс парализовать цель";
    }
}
