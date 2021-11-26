package com.company.moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        if (Math.random() <= 0.1) Effect.freeze(opp);
    }
    @Override
    protected String describe(){
        return "наносит урон и имеет 10% шанс заморозить цель";
    }
}
