package com.company.moves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class StunSpore extends StatusMove {
    public StunSpore(){
        super(Type.GRASS, 0, 75);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect.paralyze(opp);
    }
    @Override
    protected String describe(){
        return "парализует цель, если попадает";
    }
}
