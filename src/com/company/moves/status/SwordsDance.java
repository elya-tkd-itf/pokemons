package com.company.moves.status;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon self){
        self.addEffect(new Effect().stat(Stat.ATTACK , 2));
    }
    @Override
    protected String describe(){
        return "увеличивает атаку пользователя на два уровня";
    }
}
