package com.company.moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf(){
        super(Type.GRASS, 55, 0.95);
    }
    @Override
    protected double calcCriticalHit(Pokemon opp, Pokemon self){
        return 1 >> 3;
    }
    @Override
    protected String describe(){
        return "наносит урон и имеет повышенный коэффициент критического удара";
    }
}
