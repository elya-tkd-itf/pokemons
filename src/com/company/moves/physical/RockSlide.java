package com.company.moves.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 0.9);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        if (Math.random() <= 0.3) Effect.flinch(opp);
    }
    @Override
    protected String describe() {
        return "наносит урон и имеет 30% шанс заставить цель вздрогнуть (если цель еще не двигалась)";
    }
}
