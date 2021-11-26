package com.company.moves.status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon self){
        self.addEffect(new Effect().stat(Stat.EVASION , 1));
    }
    @Override
    protected String describe() {
        return "повышает Evasiveness пользователя на один уровень, что затрудняет попадание по пользователю";
    }
}
