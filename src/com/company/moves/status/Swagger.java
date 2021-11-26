package com.company.moves.status;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){super(Type.NORMAL, 0, 0.85);}
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect.confuse(opp);
        opp.addEffect(new Effect().stat(Stat.ATTACK , 2));
    }
    @Override
    protected String describe(){
        return "сбивает цель с толку и увеличивает ее атаку на два уровня";
    }
}
